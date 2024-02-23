package entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Cart implements Serializable {
    private int cartId;
    private long totalPrice;
    private static List<CartLineItem> cartLineItems = new ArrayList<>();

    public Cart(int cartId, List<CartLineItem> cartLineItems, long totalPrice) {
        this.cartId = cartId;
        this.cartLineItems = cartLineItems;
        this.totalPrice = totalPrice;
    }

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public long getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(long totalPrice) {
        this.totalPrice = totalPrice;
    }

    public static List<CartLineItem> getCartLineItems() {
        return cartLineItems;
    }

    public static void setCartLineItems(List<CartLineItem> cartLineItems) {
        Cart.cartLineItems = cartLineItems;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "cartId=" + cartId +
                ", cartLineItems" + cartLineItems +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
