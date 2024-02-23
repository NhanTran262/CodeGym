package com.example.winz_fast.dao;

import com.example.winz_fast.model.person.Employee;

import java.util.List;

public interface IEmployeeDAO {
    List<Employee> getAllEmployee();

    boolean add(Employee employee);

    boolean edit(Employee employee);

    boolean remove(int id);

    Employee getEmployeeById(int id);
}
