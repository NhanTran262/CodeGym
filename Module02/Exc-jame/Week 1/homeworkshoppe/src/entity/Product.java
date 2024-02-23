package entity;

public class Product {
    private int id;
    private String name;
    private long price;

    public Product(int id, String nameProduct, long price) {
        this.id = id;
        this.name = nameProduct;
        this.price = price;
    }

    public String getNameProduct() {
        return name;
    }

    public void setNameProduct(String nameProduct) {
        this.name = nameProduct;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", nameProduct='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
