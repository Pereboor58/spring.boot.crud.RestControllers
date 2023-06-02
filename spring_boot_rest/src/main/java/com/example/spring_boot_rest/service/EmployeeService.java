package com.example.spring_boot_rest.service;

import com.example.spring_boot_rest.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    Employee getEmployee(int id);

    void deleteEmployee(int id);
    List<Employee> findAllByName(String name);
}
