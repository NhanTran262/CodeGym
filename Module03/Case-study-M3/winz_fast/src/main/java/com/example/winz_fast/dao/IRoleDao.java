package com.example.winz_fast.dao;

import com.example.winz_fast.model.person.Role;

import java.util.List;

public interface IRoleDao {
    List<Role> getAllRole();

    Role getRoleFromUser(String usernameReq);
}
