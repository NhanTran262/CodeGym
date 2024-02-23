package com.employee.service;

import com.employee.entity.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public interface EmployeeService {
    List<Employee> getAllEmployeeByBranchId(Long id);

    Optional<Employee> getEmployeeById(Long id);

    void deleteById(Long id);

    void save(Employee employee);

    List<Employee> getEmployees();
}
