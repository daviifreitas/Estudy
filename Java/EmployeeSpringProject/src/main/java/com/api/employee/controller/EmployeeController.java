package com.api.employee.controller;

import com.api.employee.Mensagens.Mensagens;
import com.api.employee.Repository.IEmployeeRepository;
import com.api.employee.model.EmployeeModel;
import com.api.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/employee")
public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @PostMapping
    public @ResponseBody ResponseEntity<EmployeeModel> createEmployee(@RequestBody EmployeeModel createEmployee){
        return ResponseEntity.status(201).body(employeeService.createEmployee(createEmployee));
    }

    @RequestMapping(value = "/employee/findById/{id}", method = RequestMethod.GET)
    public @ResponseBody String findEmployeeById(@PathVariable Integer id){
        return employeeService.findEmployeeById(id);
    }

    @RequestMapping(value = "/employee/findAll", method = RequestMethod.GET)
    public @ResponseBody ResponseEntity<List<EmployeeModel>> findAllEmployees(){
        return ResponseEntity.status(200).body(employeeService.employeeList());
    }

    @RequestMapping(value = "/employee/deleteAll",method = RequestMethod.DELETE)
    public @ResponseBody String deleteAllEmployees(){
        return employeeService.deleteAllEmployee();
    }

    @RequestMapping(value = "/employee/updateEmployee/{id}")
    public @ResponseBody ResponseEntity<String> updateEmployee(@RequestBody EmployeeModel employeeModel , @PathVariable Integer id){
        return ResponseEntity.status(201).body(employeeService.editEmployee(employeeModel , id));
    }

    @RequestMapping(value = "/employee/deleteById/{id}",method = RequestMethod.DELETE)
    public @ResponseBody String deleteById(@PathVariable Integer id){
        return Mensagens.getMensagem(employeeService.deleteEmployee(id));
    }
}
