package com.codegym.formlogin.dao;

import com.codegym.formlogin.model.Login;
import com.codegym.formlogin.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static final List<User> users;
    static {
        users=new ArrayList<>();
        users.add(new User("nhan","codegym123","Nhân","nhan@gmail.com",18));
        users.add(new User("thang","codegym123","Thắng","thang@gmail.com",20));
        users.add(new User("dat","codegym123","Đạt","dat@gmail.com",25));
    }
    public static User checkLogin(Login login){
        for (User user:users){
            if (user.getAccount().equals(login.getAccount())
            && user.getPassword().equals(login.getPassword())){
                return user;
            }
        }
        return null;
    }
}
