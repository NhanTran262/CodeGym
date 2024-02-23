package com.codegym.model;

public class Address {
    private int id;
    private String city;
    private String district;
    private String ward;
    private String currentResidence;

    public Address(int id, String city, String district, String ward, String currentResidence) {
        this.id = id;
        this.city = city;
        this.district = district;
        this.ward = ward;
        this.currentResidence = currentResidence;
    }

    public Address() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }

    public String getCurrentResidence() {
        return currentResidence;
    }

    public void setCurrentResidence(String currentResidence) {
        this.currentResidence = currentResidence;
    }
}
