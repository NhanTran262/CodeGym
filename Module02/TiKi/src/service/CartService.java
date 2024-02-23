package service;

import entity.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CartService implements Serializable {
    private static Scanner scanner;
    private static List<Product> products;
    private static List<CartLineItem> cartLineItems;
    private static int cartId;
    private static int orderId;

    static {
        scanner = new Scanner(System.in);
        products = ProductService.getList();
        cartLineItems = new ArrayList<>();
        cartId = 3000;
        orderId = 4000;
    }

    public static int addingCartId() {
        cartId++;
        return cartId;
    }

    public static long getTotalPrice(List<CartLineItem> cartLineItems) {
        long totalPice = 0L;
        for (CartLineItem cartLineItem : cartLineItems) {
            totalPice += cartLineItem.getSubTotal();
        }
        return totalPice;
    }

    public static void displayCart(Customer customer) {
        Cart cart = customer.getCart();
        List<CartLineItem> cartLineItems = cart.getCartLineItems();
        for (CartLineItem cartLineItem : cartLineItems) {
            System.out.println(cartLineItem);
        }
        System.out.println("Total Price: " + getTotalPrice(cart.getCartLineItems()));
    }

    public static long addingPriceToVariant(Product product, int variantId) {
        Variant variant = ProductService.findVariantByVariantId(product, variantId);
        if (variant != null) {
            return variant.getVariantPrice() + product.getPrice();
        }
        return product.getPrice();
    }

    public static void order(Customer customer) {
        int orderId = orderIdAuto();
        long total = customer.getCart().getTotalPrice() + 15;
        Cart cart = customer.getCart();
        List<CartLineItem> cartLineItems = cart.getCartLineItems();
        List<OrderLine> orderLines = new ArrayList<>();
        for (CartLineItem cartLineItem : cartLineItems) {
            OrderLine orderLine = new OrderLine(cartLineItem.getProduct(), cartLineItem.getQuantity(), cartLineItem.getVariantId());
            orderLines.add(orderLine);
        }
        Order order = new Order(orderLines, customer.getAddress(), orderId, total, customer.getUserId());
        System.out.println("Your Order: " + order);
        String input;
        do {
            System.out.println("Close the order? (Y/N)");
            input = scanner.nextLine();
            orderDone(customer);
        } while (input.equalsIgnoreCase("Y"));
        CustomerService.goToMenu(customer);
    }

    public static int orderIdAuto() {
        return orderId++;
    }

    public static void orderDone(Customer customer) {
        Cart cart = new Cart(customer.getCart().getCartId(), new ArrayList<>(), 0);
        customer.setCart(cart);
        CustomerService.goToMenu(customer);
    }
}