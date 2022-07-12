package com.api.employee.controller;

import com.api.employee.Mensagens.Mensagens;
import com.api.employee.model.EmployeeModel;
import com.api.employee.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/employee")
public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @PostMapping
    public @ResponseBody ResponseEntity<EmployeeModel> createEmployee(@Valid @RequestBody EmployeeModel createEmployee){
        return ResponseEntity.status(201).body(employeeService.createEmployee(createEmployee));
    }

    @RequestMapping(value = "/findById/{id}", method = RequestMethod.GET)
    public @ResponseBody String findEmployeeById( @Valid @PathVariable Integer id){
        return employeeService.findEmployeeById(id);
    }

    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public @ResponseBody ResponseEntity<List<EmployeeModel>> findAllEmployees(){
        return ResponseEntity.status(200).body(employeeService.employeeList());
    }

    @RequestMapping(value = "/deleteAll",method = RequestMethod.DELETE)
    public @ResponseBody String deleteAllEmployees(){
        return employeeService.deleteAllEmployee();
    }

    @RequestMapping(value = "/updateEmployee/{id}")
    public @ResponseBody ResponseEntity<String> updateEmployee(@RequestBody EmployeeModel employeeModel , @PathVariable Integer id){
        return ResponseEntity.status(201).body(employeeService.editEmployee(employeeModel , id));
    }

    @RequestMapping(value = "/deleteById/{id}",method = RequestMethod.DELETE)
    public @ResponseBody String deleteById(@PathVariable Integer id){
        return Mensagens.getMensagem(employeeService.deleteEmployee(id));
    }

    @PostMapping("/login")
    public ResponseEntity<EmployeeModel> validarSenha(@Valid @RequestBody EmployeeModel employeeToVerificate){
        Boolean isValid = employeeService.ValidarNome(employeeToVerificate);
        return isValid ? ResponseEntity.status(HttpStatus.UNAUTHORIZED).build() : ResponseEntity.status(200).build();
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String ,String> handleValidationException(MethodArgumentNotValidException ex){
        Map<String ,String> erros = new HashMap<>();

        ex.getBindingResult().getAllErrors().forEach(error -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            erros.put(fieldName, errorMessage);
        });

        return erros ;
    }
}
