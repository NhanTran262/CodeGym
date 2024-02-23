package entity;

import java.io.Serializable;

public class Address implements Serializable {
    private String apartmentNumber;
    private String street;
    private String city;

    public Address(String apartmentNumber, String street, String city) {
        this.apartmentNumber = apartmentNumber;
        this.street = street;
        this.city = city;
    }

    public Address() {

    }

    public String getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(String apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "apartmentNumber='" + apartmentNumber + '\'' +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
