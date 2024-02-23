package com.codegym.model;

public class MedicalDeclaration {
    private int id;
    private String name;
    private String dayOfBirth;
    private String gender;
    private String country;
    private String idCard;
    private String travelInformation;
    private String license;
    private String numberOfSeat;
    private String starDay;
    private String endDay;
    private String travelHistory;
    private Address address;
    private String phoneNumber;
    private String email;

    public MedicalDeclaration(int id, String name, String dayOfBirth, String gender, String country, String idCard,
                              String travelInformation, String license, String numberOfSeat, String starDay, String endDay,
                              String travelHistory, Address address, String phoneNumber, String email) {
        this.id = id;
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.gender = gender;
        this.country = country;
        this.idCard = idCard;
        this.travelInformation = travelInformation;
        this.license = license;
        this.numberOfSeat = numberOfSeat;
        this.starDay = starDay;
        this.endDay = endDay;
        this.travelHistory = travelHistory;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public MedicalDeclaration() {
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

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getTravelInformation() {
        return travelInformation;
    }

    public void setTravelInformation(String travelInformation) {
        this.travelInformation = travelInformation;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getNumberOfSeat() {
        return numberOfSeat;
    }

    public void setNumberOfSeat(String numberOfSeat) {
        this.numberOfSeat = numberOfSeat;
    }

    public String getStarDay() {
        return starDay;
    }

    public void setStarDay(String starDay) {
        this.starDay = starDay;
    }

    public String getEndDay() {
        return endDay;
    }

    public void setEndDay(String endDay) {
        this.endDay = endDay;
    }

    public String getTravelHistory() {
        return travelHistory;
    }

    public void setTravelHistory(String travelHistory) {
        this.travelHistory = travelHistory;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
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
}
