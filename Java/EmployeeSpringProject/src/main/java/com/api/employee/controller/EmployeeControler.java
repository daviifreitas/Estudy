package com.api.employee.controller;

import com.api.employee.Mensagens.Mensagens;
import com.api.employee.Repository.IEmployeeRepository;
import com.api.employee.model.EmployeeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/employee")
public class EmployeeControler {
    @Autowired
    private IEmployeeRepository forUseCRUDMethods;

    @PostMapping
    public @ResponseBody ResponseEntity<String> createEmployee(@RequestBody EmployeeModel createEmployee){

        forUseCRUDMethods.save(createEmployee);

        String messageWhichCreateANewUser = Mensagens.getMensagem("Employee create with sucessful !!!");
        return ResponseEntity.status(201).body(messageWhichCreateANewUser);
    }

    @RequestMapping(value = "/employee/findById/{id}", method = RequestMethod.GET)
    public @ResponseBody EmployeeModel findEmployeeById(@PathVariable Integer id){

        if(forUseCRUDMethods.findById(id).isPresent()){
            Mensagens.getMensagem("The employee is : ");
            return forUseCRUDMethods.findById(id).get();
        } return null ;
    }

    @RequestMapping(value = "/employee/findAll", method = RequestMethod.GET)
    public @ResponseBody ResponseEntity<List<EmployeeModel>> findAllEmployees(){
        List<EmployeeModel> listOfAllUsers = forUseCRUDMethods.findAll();
        return ResponseEntity.status(200).body(listOfAllUsers);
    }

    @RequestMapping(value = "/employee/deleteAll",method = RequestMethod.DELETE)
    public @ResponseBody String deleteAllEmployees(){

        forUseCRUDMethods.deleteAll();
        return Mensagens.getMensagem("All employees are delete with sucess !!!");
    }

    @RequestMapping(value = "/employee/updateEmployee/{id}")
    public @ResponseBody ResponseEntity<String> updateEmployee(@RequestBody EmployeeModel employeeModel , @PathVariable Integer id){
        if(forUseCRUDMethods.findById(id).isPresent()){
            forUseCRUDMethods.save(employeeModel);
            String messageAboutModifyUser = Mensagens.getMensagem("Employee updated with sucessful !");
            return ResponseEntity.status(201).body(messageAboutModifyUser);
        }
        String messageAboutModifyUser = Mensagens.getMensagem("Your id is invalid !!!");
        return ResponseEntity.status(201).body(messageAboutModifyUser);
    }

    @RequestMapping(value = "/employee/deleteById/{id}",method = RequestMethod.DELETE)
    public @ResponseBody String deleteById(@PathVariable Integer id){

        String informationsAboutTheuserWhichWillbeDeleted = forUseCRUDMethods.findById(id).toString();
        forUseCRUDMethods.deleteById(id);
        return Mensagens.getMensagem("The user are deleted with sucess !".concat("\n"+informationsAboutTheuserWhichWillbeDeleted));
    }
}
