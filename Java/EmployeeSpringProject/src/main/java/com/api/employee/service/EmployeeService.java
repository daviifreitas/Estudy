package com.api.employee.service;

import com.api.employee.Repository.IEmployeeRepository;
import com.api.employee.model.EmployeeModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private IEmployeeRepository repository ;

    public EmployeeService(IEmployeeRepository repository ){
        this.repository = repository ;
    }

    public List<EmployeeModel> employeeList (){
        return repository.findAll();
    }

    public EmployeeModel createEmployee(EmployeeModel employeeToCreate){
        return repository.save(employeeToCreate);
    }

    public String editEmployee(EmployeeModel employeeForEdit, Integer idOfTheEmployeeToEdit){
        if(repository.existsById(idOfTheEmployeeToEdit)){
            repository.save(employeeForEdit);
            return "The employee has updated !!!" ;
        }
        return "The invalid id !!!";
    }

    public String findEmployeeById(Integer id){
        return repository.findById(id).isPresent() ? String.format("The employee is : \n %s", repository.findById(id).get())
                : "We don't locate the employee!\nYour id is incorrect !!!!";
    }

    public String deleteEmployee(Integer id){
        if(repository.existsById(id)){
            repository.deleteById(id);
            return "The employee are deleted with sucess !!!";
        }
        return "Your id is invalid !!!!";
    }

    public String deleteAllEmployee(){
        repository.deleteAll();
        return "The all employees are deleted !!!!";
    }
}
