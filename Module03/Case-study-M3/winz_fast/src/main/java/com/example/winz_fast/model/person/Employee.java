package com.example.winz_fast.model.person;

public class Employee {
    private int id;
    private String name;
    private String dateOfBirth;
    private String idCard;
    private String phoneNumber;
    private String email;
    private String employeeAddress;
    private int levelId;
    private int positionId;
    private int departmentId;
    private double salary;
    private String username;

    public Employee(int id, String name, String dateOfBirth, String idCard,
                    String phoneNumber, String email, String employeeAddress,
                    int levelId, int positionId, int departmentId, double salary, String username) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.idCard = idCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.employeeAddress = employeeAddress;
        this.levelId = levelId;
        this.positionId = positionId;
        this.departmentId = departmentId;
        this.salary = salary;
        this.username = username;
    }

    public Employee(String name, String dateOfBirth, String idCard,
                    String phoneNumber, String email, String employeeAddress,
                    int levelId, int positionId, int departmentId, double salary, String username) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.idCard = idCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.employeeAddress = employeeAddress;
        this.levelId = levelId;
        this.positionId = positionId;
        this.departmentId = departmentId;
        this.salary = salary;
        this.username = username;
    }

    public Employee(int id, String name, String dateOfBirth, String idCard,
                    String phoneNumber, String email, String employeeAddress,
                    int levelId, int positionId, int departmentId, double salary) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.idCard = idCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.employeeAddress = employeeAddress;
        this.levelId = levelId;
        this.positionId = positionId;
        this.departmentId = departmentId;
        this.salary = salary;
    }

    public Employee() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String address) {
        this.employeeAddress = employeeAddress;
    }

    public int getLevelId() {
        return levelId;
    }

    public void setLevelId(int levelId) {
        this.levelId = levelId;
    }

    public int getPositionId() {
        return positionId;
    }

    public void setPositionId(int positionId) {
        this.positionId = positionId;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
