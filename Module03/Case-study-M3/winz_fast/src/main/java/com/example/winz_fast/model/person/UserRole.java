package com.example.winz_fast.model.person;

public class UserRole {
    private int roleId;
    private String userName;

    public UserRole(int roleId, String userName) {
        this.roleId = roleId;
        this.userName = userName;
    }

    public UserRole() {
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
