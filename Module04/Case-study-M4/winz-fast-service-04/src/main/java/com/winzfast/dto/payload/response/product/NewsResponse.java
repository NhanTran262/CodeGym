package com.winzfast.dto.payload.response.product;

import java.time.LocalDateTime;
import java.util.Date;


public class NewsResponse {

    private String title;
    private byte[] thumbnail;
    private LocalDateTime  productDate;
    private String price;
    private int view;
    private Long user;
    private String brand;
    private String carModel;
    private String engine;
    private int year;
    private String fuel;
    private String origin;
    private String gear;
    private int numberOfSeat;
    private Long product;
    private String message;
    private boolean success;
    public NewsResponse (String message){

    }

    public NewsResponse(String title, byte[] thumbnail, LocalDateTime productDate, String price, int view, Long user, String brand, String carModel, String engine, int year, String fuel, String origin, String gear, int numberOfSeat, Long product, String message, boolean success) {
        this.title = title;
        this.thumbnail = thumbnail;
        this.productDate = productDate;
        this.price = price;
        this.view = view;
        this.user = user;
        this.brand = brand;
        this.carModel = carModel;
        this.engine = engine;
        this.year = year;
        this.fuel = fuel;
        this.origin = origin;
        this.gear = gear;
        this.numberOfSeat = numberOfSeat;
        this.product = product;
        this.message = message;
        this.success = success;
    }

    public NewsResponse() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public byte[] getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(byte[] thumbnail) {
        this.thumbnail = thumbnail;
    }

    public LocalDateTime  getProductDate() {
        return productDate;
    }

    public void setProductDate(LocalDateTime  productDate) {
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

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
