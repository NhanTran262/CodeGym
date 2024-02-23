package com.example.winz_fast.model;

public class DetailContract {
    private int id;
    private int contractId;
    private int quantity;

    public DetailContract(int id, int contractId, int quantity) {
        this.id = id;
        this.contractId = contractId;
        this.quantity = quantity;
    }

    public DetailContract() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getContractId() {
        return contractId;
    }

    public void setContractId(int contractId) {
        this.contractId = contractId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
