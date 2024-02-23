package entity;

import java.io.Serializable;

public class Customer extends User implements Serializable {
    private Cart cart;
    private long balance;
    private Address address;

    public Customer(int userId, String username, String password, long balance, Address address) {
        super(userId, username, password);
        this.balance = balance;
        this.address = address;

    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "Id=" + this.getUserId() +
                ", Username=" + this.getUsername() +
                ", Password=" + this.getPassword() +
                ", cart=" + cart +
                "} ";
    }
}
