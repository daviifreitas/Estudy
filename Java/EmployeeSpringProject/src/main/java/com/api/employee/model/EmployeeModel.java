package com.api.employee.model;

import com.api.employee.Enuns.Departments;

import javax.persistence.*;

@Entity
@Table(name = "Employee")
public class EmployeeModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id ;

    @Column(name ="nome")
    private String name ;

    @Column(name = "department")
    @Enumerated(EnumType.STRING)
    private Departments department;

    @Column(name = "salary")
    private double salary;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Departments getDepartment() {
        return department;
    }

    public void setDepartment(Departments department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
