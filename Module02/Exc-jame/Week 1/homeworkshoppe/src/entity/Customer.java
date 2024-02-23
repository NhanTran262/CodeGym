package entity;

public class Customer extends User{
    public Customer(int id, String userName, String password) {
        super(id, userName, password);
    }
    private Cart cart;
    private long wallet;

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }


    public long getWallet() {
        return wallet;
    }

    public void setWallet(long wallet) {
        this.wallet = wallet;
    }

    @Override
    public String toString() {
        return "Customer{" +

                " id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", cart=" + cart +
                ", wallet=" + wallet +
                '}';
    }

}
