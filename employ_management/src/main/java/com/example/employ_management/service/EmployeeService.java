package com.example.employ_management.service;

import com.example.employ_management.model.Employee;

import java.util.List;

public interface EmployeeService {

    Employee createEmployee(Employee employee);

    List<Employee> getAllEmployees();

    Employee getEmployeeById(String id);

    Employee updateEmployee(String id, Employee employee);

    void deleteEmployee(String id);
}