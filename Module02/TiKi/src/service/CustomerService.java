package service;
import entity.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class CustomerService implements Serializable {
    protected static List<Customer> customers;
    private static final String FILE_CUSTOMER;
    private static final String FILE_ORDER;
    private static final Scanner scanner;
    private static int customerId;

    static {
        customers = new ArrayList<>();
        FILE_CUSTOMER = "src/file_customer/customer_data.txt";
        FILE_ORDER = "src/file_order/order_data.txt";
        scanner = new Scanner(System.in);
        customerId = 2000;
    }

    public static void run() {
        loadFromFile();
        String menu;
        while (true) {
            System.out.println("1.Register.\n2.Login.\n3.Exit.");
            menu = scanner.nextLine();
            switch (menu) {
                case "1":
                    registerCustomer();
                    break;
                case "2":
                    loginCustomer();
                    break;
                case "3":
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid input.");
                    break;
            }
        }

    }

    public static void registerCustomer() {
        customerId++;
        System.out.println("Enter the username to register: ");
        String username = scanner.nextLine();
        System.out.println("Enter the password to register: ");
        String password = scanner.nextLine();
        long balance = 10000000;
        Address address = addAddress();
        Customer customer = new Customer(customerId, username, password, balance, address);
        customers.add(customer);
        saveToFile();
    }

    public static void saveToFile() {
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(FILE_CUSTOMER));
            objectOutputStream.writeObject(customers);
            objectOutputStream.close();
        } catch (IOException e) {
            System.out.println("Filed to save user data to file.");
            throw new RuntimeException(e);
        }
    }

    public static void loadFromFile() {
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(FILE_CUSTOMER));
            customers = (List<Customer>) objectInputStream.readObject();
            objectInputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("No previous user data found.");
            throw new RuntimeException(e);
        }
        for (Customer customer:customers){
            System.out.println(customer);
        }
    }

    public static void printBill(Order order) {
        try {
            FileWriter fileWriter = new FileWriter(FILE_ORDER,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(order.toString());
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static void loginCustomer() {
        System.out.println("\tLOGIN");
        System.out.println("Username: ");
        String username = scanner.nextLine();
        System.out.println("Password: ");
        String password = scanner.nextLine();
        Customer customer = loginInByCustomer(username, password);
        if (customer != null) {
            goToMenu(customer);
        } else {
            System.out.println("Wrong login information");
            return;
        }
    }

    public static Customer loginInByCustomer(String username, String password) {
        for (Customer customer : customers) {
            if ((customer.getUsername().equals(username)) && (customer.getPassword().equals(password))) {
                return customer;
            }
        }
        return null;
    }

    public static void goToMenu(Customer customer) {

        String menu;
        while (true) {
            System.out.println("1.View page.\n2.Add product to cart.\n3.Review your order.\n4.Your order.\n5.Invoice.\n6.Logout.\n7.Exit");
            menu = scanner.nextLine();
            switch (menu) {
                case "1":
                    displayPage();
                    break;
                case "2":
                    buyProduct(customer);
                    break;
                case "3":
                    CartService.displayCart(customer);
                    break;
                case "4":
                    CartService.order(customer);
                    break;
                case "5":
//                    printInvoice();
                    break;
                case "6":
                    run();
                    break;
                case "7":
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
    }

    public static void addToCart(List<CartLineItem> cartLineItems) {
        System.out.println("Enter product name: ");
        String productName = scanner.nextLine();
        System.out.println("Product size and color:");
        ProductService.displayVariant(productName);
        System.out.println("Choose size: ");
        String size = scanner.nextLine();
        System.out.println("Choose color: ");
        String color = scanner.nextLine();
        Variant variant = ProductService.findVariant(productName, size, color);
        int variantId = variant.getVariantId();
        Product product = ProductService.getProductByName(productName);
        if (product != null) {
            System.out.println("Enter quantity: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();
            CartLineItem cartLineItem = new CartLineItem(product, quantity, variantId);
            cartLineItems.add(cartLineItem);
            System.out.println("Product added to cart successfully!");
        } else {
            System.out.println("Product not found!");
        }
    }

    public static void buyProduct(Customer customer) {
        List<CartLineItem> cartLineItems = new ArrayList<>();
        System.out.println("Welcome to the shopping cart!");
        String input;
        do {
            addToCart(cartLineItems);
            System.out.println("Do you want to add another product? (Y/N)");
            input = scanner.nextLine();
        } while (input.equalsIgnoreCase("Y"));
        int cartId = CartService.addingCartId();
        long totalPrice = CartService.getTotalPrice(cartLineItems);
        Cart cart = new Cart(cartId, cartLineItems, totalPrice);
        customer.setCart(cart);
    }

    public static void displayPage() {

        String input;
        do {
            ProductService productService = new ProductService();
            System.out.println("Enter the page you want to see: ");
            int pageIndex = scanner.nextInt();
            scanner.nextLine();
            List<Product> products = productService.getProductByPage(pageIndex);
            System.out.println("Page: " + pageIndex);
            for (Product product : products) {
                System.out.println(product);
            }
            System.out.println("Do you want to see the next page? (Y/N)");
            input = scanner.nextLine();
        } while (input.equalsIgnoreCase("Y"));
        System.out.println(" ");
    }

    public static Address addAddress() {
        Address address = new Address("21K", "Nguyễn Văn Trỗi", "TP.Hồ Chí Minh");
        return address;
    }

    public static Customer getCustomerById(int customerId) {
        for (Customer customer : customers) {
            if (customer.getUserId() == customerId) {
                return customer;
            }
        }
        return null;
    }

}

