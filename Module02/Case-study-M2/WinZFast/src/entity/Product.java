package entity;

import java.io.Serializable;

public class Product implements Serializable {
    private int productId;
    private String productName;
    private String brand;
    private int year;
    private long price;


    public Product(int productId, String productName, String brand, int year, long price) {
        this.productId = productId;
        this.productName = productName;
        this.brand = brand;
        this.year = year;
        this.price = price;

    }

    public Product() {

    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", brand='" + brand + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
