package com.example.winz_fast.service.impl;

import com.example.winz_fast.dao.IUserDAO;
import com.example.winz_fast.dao.impl.UserDAO;
import com.example.winz_fast.model.person.User;
import com.example.winz_fast.service.IUserService;

import java.util.List;

public class UserService implements IUserService {
    IUserDAO userDAO = new UserDAO();
    @Override
    public List<User> getAllUser() {
        return userDAO.getAllUser();
    }

    @Override
    public boolean add(User user) {
        return false;
    }

    @Override
    public boolean edit(User user) {
        return false;
    }

    @Override
    public boolean remove(int id) {
        return false;
    }

    @Override
    public User getUserByUsername(String username) {
        return userDAO.getUserByUsername(username);
    }

    @Override
    public boolean checkLogin(String username, String password) {
        User user = userDAO.getUserByUsername(username);
        if (user != null){
            if (user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }
}
