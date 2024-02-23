package com.example.winz_fast.service.impl;

import com.example.winz_fast.dao.IDepartmentDAO;
import com.example.winz_fast.dao.impl.DepartmentDAO;
import com.example.winz_fast.model.person.Department;
import com.example.winz_fast.service.IDepartmentService;

import java.util.List;

public class DepartmentService implements IDepartmentService {
    IDepartmentDAO departmentDAO = new DepartmentDAO();

    @Override
    public List<Department> getAllDepartment() {
        return departmentDAO.getAllDepartment();
    }
}
