package service;

import entity.Cart;
import entity.CartItem;
import entity.Customer;
import entity.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CartService {
    private static List<Product> products = ProductService.getList();
    public static Scanner sc = new Scanner(System.in);
    private static List<CartItem> cartItems = new ArrayList<>();
    private static int cartId = 4000;
    private static int orderId = 1;

    public static int addingId() {
        return cartId++;
    }

    public static long getTotalPrice(List<CartItem> cartItems) {
        long totalPrice = 0L;
        for (CartItem cartItem : CartService.cartItems) {
            totalPrice += cartItem.getSubtotal();
        }
        return totalPrice;
    }

    public static void printCart(Customer customer) {
        Cart cart = customer.getCart();
        List<CartItem> cartItems = Cart.getCartItems();
        for (CartItem cartItem : cartItems){
            System.out.println(cartItem);
        }
        System.out.println("TotalPrice: "+getTotalPrice(cart.setCartItems(cartItems)));
    }

}
