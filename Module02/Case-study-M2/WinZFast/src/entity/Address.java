package entity;

import java.io.Serializable;

public class Address implements Serializable {
    private String city;
    private String district;
    private String number;



    public Address() {

    }
    public Address number(String number) {
        this.number= number;
        return this;
    }

    public Address district(String district) {
        this.district= district;
        return this;
    }

    public Address city(String city) {
        this.city = city;
        return this;
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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", district='" + district + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
