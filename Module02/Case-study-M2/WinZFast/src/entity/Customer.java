package entity;

import entity.User;

import java.io.Serializable;

public class Customer extends User implements Serializable {
    private final int idCard;
    private final Address address;
    public Customer(int userId, String username, String password, String name,int idCard,Address address) {
        super(userId, username, password, name);
        this.idCard = idCard;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", idCard=" + idCard +
                ", address=" + address +
                "} " + super.toString();
    }
}
