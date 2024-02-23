package com.example.winz_fast.service;

import com.example.winz_fast.model.person.Employee;

import java.util.List;

public interface IEmployeeService {
    List<Employee> getAllEmployee();

    boolean add(Employee employee);

    boolean edit(Employee employee);

    boolean remove(int id);

    Employee getEmployeeById(int id);
}
