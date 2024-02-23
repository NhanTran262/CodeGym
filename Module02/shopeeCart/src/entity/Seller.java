package entity;

public class Seller extends User {

    public Seller(int id, String username, String password) {
        super(id, username, password);
    }
    private Product product;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "Seller{" +
                "product=" + product +
                '}';
    }
}
