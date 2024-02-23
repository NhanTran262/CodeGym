package com.example.demo4.service.impl;

import com.example.demo4.model.User;

import java.util.List;

public interface IUserService {
    List<User> getAllUser();
    User getOneUser(int id);
    boolean addNewUser(User user);
    boolean editUser(User user);
    boolean removeUser(int id);
}
