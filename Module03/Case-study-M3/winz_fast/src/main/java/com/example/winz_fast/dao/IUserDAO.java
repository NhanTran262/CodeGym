package com.example.winz_fast.dao;

import com.example.winz_fast.model.person.User;

import java.util.List;

public interface IUserDAO {
    List<User> getAllUser();

    boolean add(User user);

    boolean edit(User user);

    boolean remove(int id);

    User getUserByUsername(String username);

}
