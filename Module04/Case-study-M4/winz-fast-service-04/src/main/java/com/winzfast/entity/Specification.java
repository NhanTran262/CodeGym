package com.winzfast.entity;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "specifications")
@Data

public class Specification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "brand", length = 50)
    private String brand;
    @Column(name = "car_model", length = 50)
    private String carModel;
    @Column(name = "engine", length = 50)
    private String engine;
    @Column(name = "year", length = 10)
    private int year;
    @Column(name = "fuel", length = 10)
    private String fuel;
    @Column(name = "origin",length = 50)
    private String origin;
    @Column(name = "gear", length = 50)
    private String gear;
    @Column(name = "number_of_seat")
    private int numberOfSeat;
    @Column(name = "is_deleted")
    private boolean isDelete;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    public Specification(Long id, String brand, String carModel, String engine, int year, String fuel, String origin, String gear, int numberOfSeat, boolean isDelete, Product product) {
        this.id = id;
        this.brand = brand;
        this.carModel = carModel;
        this.engine = engine;
        this.year = year;
        this.fuel = fuel;
        this.origin = origin;
        this.gear = gear;
        this.numberOfSeat = numberOfSeat;
        this.isDelete = isDelete;
        this.product = product;
    }

    public Specification() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getGear() {
        return gear;
    }

    public void setGear(String gear) {
        this.gear = gear;
    }

    public int getNumberOfSeat() {
        return numberOfSeat;
    }

    public void setNumberOfSeat(int numberOfSeat) {
        this.numberOfSeat = numberOfSeat;
    }

    public boolean isDelete() {
        return isDelete;
    }

    public void setDelete(boolean delete) {
        isDelete = delete;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
