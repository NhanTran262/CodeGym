package service;

import entity.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class CustomerService {
    private static List<Customer> customers = new ArrayList<>();
    private static List<Product> products = ProductService.getList();
    private static List<CartItem> cartItems = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);

    //    public static void register() {
//        Cart cart = CartService.createCart();
//        Customer customer = new Customer();
//        customer.setCart(cart);
//        customer.setId(1);
//        customer.setUsername("Kietlon");
//        customer.setPassword("12345");
//        customers.add(customer);
//    }
    public static void register() {
        int customerId = 1;
//        int cartId = CartService.addingId();
        boolean validCredentials = false;
        do {
            Customer customer = new Customer();
            customer.setCart(cart);
            customer.setId(customerId);
            System.out.println("Username: ");
            String username = sc.nextLine();
            System.out.println("Password: ");
            String password = sc.nextLine();

            if (isValidInput(username) && isValidInput(password)) {
                customer.setUsername(username);
                customer.setPassword(password);
                customers.add(customer);
                customerId++;
                validCredentials = true;
            } else {
                System.out.println("Invalid characters in username or password. Please try again.");
            }
        } while (!validCredentials);

    }

    private static boolean isValidInput(String input) {
        String invalidCharacters = "~`!@#$%^&*()_-+=[{}]\\|;:'\",<.>?/  ";
        for (char c : input.toCharArray()) {
            if (invalidCharacters.contains(String.valueOf(c))) {
                return false;
            }
        }
        return true;
    }

    public static void login() {
        System.out.println("Login");
        System.out.println("Username: ");
        String username = sc.nextLine();
        System.out.println("Password: ");
        String password = sc.nextLine();
        Customer customer = loggingIn(username, password);
        if (customer != null) {
            menu(customer);
        } else {
            System.out.println("Login not found.");
        }
    }

    public static Customer loggingIn(String username, String password) {
        for (Customer customer : customers) {
            if ((customer.getUsername().equals(username)) && (customer.getPassword().equals(password))) {
                return customer;
            }
        }
        return null;
    }

    public static void menu(Customer customer) {
        char menu;
        while (true) {
            System.out.println("1.Product view:");
            System.out.println("2.Add product to cart:");
            System.out.println("3.Review your order:");
            menu = sc.next().charAt(0);
            sc.nextLine();
            switch (menu) {
                case '1':
                    printPage();
                    break;
                case '2':
                    buyProduct(customer);
                    break;
                case '3':
                    CartService.printCart(customer);
                    break;
                default:
                    System.out.println("Not found");
                    break;
            }


        }
    }

    public static void printPage() {
        String input;
        do {
            ProductService productService = new ProductService();
            System.out.println("Please! Enter the page you want to see: ");
            int pageIndex = sc.nextInt();
            sc.nextLine();
            List<Product> products = productService.getProductByPage(pageIndex);
            System.out.println("Page: " + pageIndex);
            for (Product product : products) {
                System.out.println(product);
            }
            System.out.println("Do you want to see the next page (Y/N): ");
            input = sc.nextLine();
        } while (input.equalsIgnoreCase("Y"));
        System.out.println("");
    }

    public static void addToCart(String productName) {

        System.out.println("Product has size and color:");
        ProductService.displayVariant(productName);
        System.out.println("Please! Choose size: ");
        String size = sc.nextLine();
        System.out.println("Please! Choose color: ");
        String color = sc.nextLine();
        System.out.println("Enter quantity: ");
        int quantity = sc.nextInt();
        sc.nextLine();
        Variant variant = ProductService.findVariant(productName, size, color);
        int variantId = variant.getVariantId();
        Product product = ProductService.searchProductByName(productName);
        if (product != null) {
            CartItem cartItem = new CartItem(product, quantity, variantId);
            cartItems.add(cartItem);

            System.out.println("Product added to cart successfully!");
        } else {
            System.out.println("Product not found!");
        }

    }

    public static void printCustomerList() {
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }

    public static void buyProduct(Customer customer) {
        String input;
        do {
            System.out.println("Enter product name: ");
            String productName = sc.nextLine();
            addToCart(productName);
            System.out.println("Do you want to add another product? (Y/N): ");
            input = sc.nextLine();
        } while (input.equalsIgnoreCase("Y"));
        System.out.println();
        int cartId = CartService.addingId();
        long totalPrice = CartService.getTotalPrice(cartItems);
        Cart cart = new Cart(cartId, cartItems, totalPrice);
        customer.setCart(cart);



    }


    public static Customer findByCustomerId(int customerId) {
        for (Customer customer : customers) {
            if (customer.getId() == customerId) {
                return customer;
            }
        }
        return null;
    }
}

