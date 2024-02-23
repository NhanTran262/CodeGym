package com.example.winz_fast.service;

import com.example.winz_fast.model.person.User;

import java.util.List;

public interface IUserService {
    List<User> getAllUser();

    boolean add(User user);

    boolean edit(User user);

    boolean remove(int id);

    User getUserByUsername(String username);

    boolean checkLogin(String username, String password);
}
