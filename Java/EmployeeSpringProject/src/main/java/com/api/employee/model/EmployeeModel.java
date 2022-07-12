package com.api.employee.model;

import com.api.employee.Enuns.Departments;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.*;

@Data

@Entity
@Table(name = "Employee")
public class EmployeeModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id ;


    @Size(min = 3, message = "O nome deve ter pelo menos 3 caracteres")
    @NotBlank(message = "O nome é obrigatório!")
    @Column(name ="nome", nullable = false)
    private String name ;

    @NotBlank(message = "O departamento é obrigatório!")
    @Column(name = "department", nullable = false)
    @Enumerated(EnumType.STRING)
    private Departments department;

    @Min(value = 1200 , message = "O valor minímo que pagamos é de 1200 !!!\nPor favor ,corriga esse valor !")
    @Max(value = 10000, message = "Você está passando o teto salariál da nossa empresa !!!!")
    @NotBlank(message = "O salário é obrigatório !")
    @Column(name = "salary", nullable = false)
    private double salary;

}
