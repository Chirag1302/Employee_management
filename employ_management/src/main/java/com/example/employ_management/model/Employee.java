package com.example.employ_management.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id
    private String id;

    private String employeeId;

    private String firstName;

    private String lastName;

    private String email;

    private String department;

    private String designation;

    private Double salary;

    private LocalDate joiningDate;
}
