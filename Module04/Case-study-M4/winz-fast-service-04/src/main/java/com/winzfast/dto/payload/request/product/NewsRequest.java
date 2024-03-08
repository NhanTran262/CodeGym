package com.winzfast.dto.payload.request.product;

import com.winzfast.entity.Specification;

import java.time.LocalDateTime;
import java.util.Date;


public class NewsRequest {
    private Long id;
    private String title;
    private String thumbnail;
    private LocalDateTime productDate;
    private String price;
    private int view;
    private Long user;
    private Specification specification;
    private String brand;
    private String carModel;
    private String engine;
    private int year;
    private String fuel;
    private String origin;
    private String gear;
    private int numberOfSeat;
    private Long product;

    public NewsRequest(Long id, String title, String thumbnail, LocalDateTime productDate, String price, int view, Long user, Specification specification, String brand, String carModel, String engine, int year, String fuel, String origin, String gear, int numberOfSeat, Long product) {
        this.id = id;
        this.title = title;
        this.thumbnail = thumbnail;
        this.productDate = productDate;
        this.price = price;
        this.view = view;
        this.user = user;
        this.specification = specification;
        this.brand = brand;
        this.carModel = carModel;
        this.engine = engine;
        this.year = year;
        this.fuel = fuel;
        this.origin = origin;
        this.gear = gear;
        this.numberOfSeat = numberOfSeat;
        this.product = product;
    }

    public NewsRequest() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public byte[] getThumbnail() {
        return thumbnail.getBytes();
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public LocalDateTime getProductDate() {
        return productDate;
    }

    public void setProductDate(LocalDateTime productDate) {
        this.productDate = productDate;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getView() {
        return view;
    }

    public void setView(int view) {
        this.view = view;
    }

    public Long getUser() {
        return user;
    }

    public void setUser(Long user) {
        this.user = user;
    }


    public Specification getSpecification() {
        return specification;
    }

    public void setSpecification(Specification specification) {
        this.specification = specification;
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

    public Long getProduct() {
        return product;
    }

    public void setProduct(Long product) {
        this.product = product;
    }
}
