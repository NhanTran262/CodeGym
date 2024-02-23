package com.example.winz_fast.model.product;

public class Vehicle {
    private int vehicle_id;
    private String vehicle_name;
    private int brand_id;
    private int variant_id;
    private double price;
    private String status;

    public Vehicle(int vehicle_id, String vehicle_name, int brand_id,
                   int variant_id, double price, String status) {
        this.vehicle_id = vehicle_id;
        this.vehicle_name = vehicle_name;
        this.brand_id = brand_id;
        this.variant_id = variant_id;
        this.price = price;
        this.status = status;
    }

    public Vehicle(String vehicle_name, int brand_id, int variant_id, double price, String status) {
        this.vehicle_name = vehicle_name;
        this.brand_id = brand_id;
        this.variant_id = variant_id;
        this.price = price;
        this.status = status;
    }

    public Vehicle() {
    }

    public int getVehicle_id() {
        return vehicle_id;
    }

    public void setVehicle_id(int vehicle_id) {
        this.vehicle_id = vehicle_id;
    }

    public String getVehicle_name() {
        return vehicle_name;
    }

    public void setVehicle_name(String vehicle_name) {
        this.vehicle_name = vehicle_name;
    }

    public int getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(int brand_id) {
        this.brand_id = brand_id;
    }

    public int getVariant_id() {
        return variant_id;
    }

    public void setVariant_id(int variant_id) {
        this.variant_id = variant_id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
