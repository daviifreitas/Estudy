package com.api.employee.Enuns;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum Departments {
    FINANCIAL("Financial") ,
    SECURITY ("Security"),
    HEALTH("Health");

    private String departmentName;

    Departments(String departmentName) {
        this.departmentName = departmentName;
    }


    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
