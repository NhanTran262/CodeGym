package com.example.winz_fast.model;

public class Contract {
    private int id;
    private String contractDate;
    private double deposits;
    private int employeeId;
    private int customerId;
    private int vehicleId;

    public Contract(int id, String contractDate, double deposits,
                    int employeeId, int customerId, int vehicleId) {
        this.id = id;
        this.contractDate = contractDate;
        this.deposits = deposits;
        this.employeeId = employeeId;
        this.customerId = customerId;
        this.vehicleId = vehicleId;
    }

    public Contract() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContractDate() {
        return contractDate;
    }

    public void setContractDate(String contractDate) {
        this.contractDate = contractDate;
    }

    public double getDeposits() {
        return deposits;
    }

    public void setDeposits(double deposits) {
        this.deposits = deposits;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }
}
