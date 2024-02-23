package com.example.demo4.service.impl;

import com.example.demo4.dao.IUserDAO;
import com.example.demo4.dao.impl.userDAO;
import com.example.demo4.model.User;

import java.util.List;

public class UserService implements IUserService {
    private IUserDAO userDAO = new userDAO();

    @Override
    public List<User> getAllUser() {
        return userDAO.getAllUser();
    }

    @Override
    public User getOneUser(int id) {
        return null;
    }

    @Override
    public boolean addNewUser(User user) {
        return false;
    }

    @Override
    public boolean editUser(User user) {
        return false;
    }

    @Override
    public boolean removeUser(int id) {
        return false;
    }
}
