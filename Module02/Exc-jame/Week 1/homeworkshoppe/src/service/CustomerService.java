package service;

import entity.CartItem;
import entity.Customer;
import entity.Product;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static service.ProductService.products;

public class CustomerService {
    List<Customer> customers = new ArrayList<>();
    static List<CartItem> cartItems = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);
    public static void addToCart(String nameProduct) {

        Product product = null;
        for (Product product1 : products) {
            if (product1.getNameProduct().equalsIgnoreCase(nameProduct)) {
                product = product1;
                break;
            }
        }
        if (product != null) {
            System.out.println("Enter quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine();
            CartItem newItem = new CartItem(product, quantity);
            cartItems.add(newItem);

            System.out.println("Product added to cart successfully!");
        } else {
            System.out.println("Product not found!");
        }
    }

    public static void buyItem() {
        CustomerService customerService = new CustomerService();
        System.out.println("Welcome to the shopping cart!");
        String input;
        do {
            System.out.println("Enter product name: ");
            String productName = sc.nextLine();
            customerService.addToCart(productName);
            System.out.println("Do you want to add another product? (Y/N): ");
            input = sc.nextLine();
        } while (input.equalsIgnoreCase("Y"));
        System.out.println();
        customerService.printCart();
        double totalPrice = customerService.getTotalPrice();
        System.out.println("Total Price: " + totalPrice);
        sc.close();
    }
    public  double getTotalPrice() {
        double totalPrice=0;
        for (CartItem item : cartItems) {
            totalPrice += item.getSubtotal();
        }
        return totalPrice;
    }

    public static void printCart() {
        if (!cartItems.isEmpty()) {
            System.out.println("Your shopping cart contains: ");
            for (CartItem item : cartItems) {
                System.out.println(item.getProduct() + " - Quantity: " + item.getQuantity() + " - Subtotal: $" + item.getSubtotal());
            }
        } else {
            System.out.println("Your shopping cart is empty.");
        }
    }
}