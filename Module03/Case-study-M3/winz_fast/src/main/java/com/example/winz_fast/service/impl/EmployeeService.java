package com.example.winz_fast.service.impl;

import com.example.winz_fast.dao.IEmployeeDAO;
import com.example.winz_fast.dao.impl.EmployeeDAO;
import com.example.winz_fast.model.person.Employee;
import com.example.winz_fast.service.IEmployeeService;

import java.util.List;

public class EmployeeService implements IEmployeeService {
    IEmployeeDAO employeeDAO = new EmployeeDAO();

    @Override
    public List<Employee> getAllEmployee() {
        return employeeDAO.getAllEmployee();
    }

    @Override
    public boolean add(Employee employee) {
        return employeeDAO.add(employee);
    }

    @Override
    public boolean edit(Employee employee) {
        return employeeDAO.edit(employee);
    }

    @Override
    public boolean remove(int id) {
        return employeeDAO.remove(id);
    }

    @Override
    public Employee getEmployeeById(int id) {
        return employeeDAO.getEmployeeById(id);
    }
}
