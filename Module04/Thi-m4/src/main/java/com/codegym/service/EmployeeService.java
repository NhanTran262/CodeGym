package com.codegym.service;

import com.codegym.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    List<Employee> getAllEmployeeByBranchId(Long id);

    Optional<Employee> getEmployeeById(Long id);

    void delete(Long id);

    void save(Employee employee);

    List<Employee> getAllEmployee();

}
