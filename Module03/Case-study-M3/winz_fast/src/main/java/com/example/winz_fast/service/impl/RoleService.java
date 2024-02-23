package com.example.winz_fast.service.impl;

import com.example.winz_fast.dao.IRoleDao;
import com.example.winz_fast.dao.impl.RoleDAO;
import com.example.winz_fast.model.person.Role;
import com.example.winz_fast.service.IRoleService;

import java.util.List;

public class RoleService implements IRoleService {
IRoleDao roleDao = new RoleDAO();
    @Override
    public List<Role> getAllRole() {
        return roleDao.getAllRole();
    }

    @Override
    public Role getRoleFromUser(String username) {
        return roleDao.getRoleFromUser(username);
    }
}
