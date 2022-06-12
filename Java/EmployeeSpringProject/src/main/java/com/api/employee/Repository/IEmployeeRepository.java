package com.api.employee.Repository;

import com.api.employee.model.EmployeeModel;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IEmployeeRepository extends CrudRepository<EmployeeModel, Integer> {
    List<EmployeeModel> findAll();
}
