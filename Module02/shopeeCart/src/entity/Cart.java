package entity;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private int cartId;
    private long totalPrice;
    private static List<CartItem> cartItems = new ArrayList<>();

    public Cart(int cartId, List<CartItem> cartItems, long totalPrice) {
        this.cartId = cartId;
        this.totalPrice = totalPrice;
        this.cartItems = cartItems;
    }

    public Cart() {

    }


    public int getCartId() {
        return cartId;
    }

    public void setCartId(int id) {
        this.cartId = cartId;
    }

    public long getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(long totalPrice) {
        this.totalPrice = totalPrice;
    }

    public static List<CartItem> getCartItems() {
        return cartItems;
    }

    public List<CartItem> setCartItems(List<CartItem> cartItems) {
        Cart.cartItems = cartItems;
        return cartItems;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "id=" + cartId +
                ", totalPrice=" + totalPrice +
                ", cartItems=" + cartItems +
                '}';
    }
}
