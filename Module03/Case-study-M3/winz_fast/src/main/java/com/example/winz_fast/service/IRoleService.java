package com.example.winz_fast.service;

import com.example.winz_fast.model.person.Role;

import java.util.List;

public interface IRoleService {
    List<Role> getAllRole();

    Role getRoleFromUser(String username);
}
