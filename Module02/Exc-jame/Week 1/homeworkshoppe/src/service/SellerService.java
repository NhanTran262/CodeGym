package service;


import entity.Product;
import java.util.List;
import java.util.Scanner;
import static service.ProductService.plusProduct;
import static service.ProductService.products;

public class SellerService {
    public static Scanner sc = new Scanner(System.in);

    public static void addProduct() {
        for (int index = 1; index <= 20; index++) {
            plusProduct();
        }
    }

    public static void printList() {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public static Product getProduct(int index) {
        return products.get(index);
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


}
