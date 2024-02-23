package service.impl;

import constant.Constants;
import entity.Product;
import service.ISearch;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static service.impl.CustomerService.customerLoginScreen;
import static service.impl.SearchProductFactory.createISearch;
import static service.impl.UserService.*;

public class ProductService implements Serializable {
    private static final Scanner scanner;
    private static final List<Product> products;
    private static final Product product;
    private static int productId;
    private static ISearch searchProduct;

    static {
        product = new Product();
        products = new ArrayList<>();
        scanner = new Scanner(System.in);
        productId = 2000;
    }

    public static void creatProduct() {
        Product product = new Product(1, "CX5", "Mazda", 2012, 500000000);
        Product product1 = new Product(2, "S4 ", "Mec", 2020, 1000000000);
        products.add(product);
        products.add(product1);
    }

    public ProductService(ISearch iSearch) {
        this.searchProduct = iSearch;
    }

    public static Product createProduct(int productId, String productName, String brand, int year, long price) {
        return new Product(productId, productName, brand, year, price);
    }

    public static void addProductToList(int productId, String productName, String brand, int year, long price) {
        productId++;
        Product product = createProduct(productId, productName, brand, year, price);
        products.add(product);
//        saveToFile(data);
        System.out.println("Product added successfully! ");
    }

    public static void displayListProduct() {
        for (Product product : products) {
            System.out.println(product.toString());
        }
    }

    public static void searchProduct() {
        loadToFile();
        System.out.println("-----****-----" +
                "\nHow would you like to search? " +
                "\n1.SEARCH BY NAME. " +
                "\n2.SEARCH BY BRAND." +
                "\n3.SEARCH BY YEAR." +
                "\n4.GO BACK" +
                "\n-----****-----");
        int search = scanner.nextInt();
        scanner.nextLine();
        ISearch iSearch = null;
        switch (search) {
            case Constants.SEARCH_NAME:
                iSearch = createISearch(Constants.SEARCH_NAME);
                break;
            case Constants.SEARCH_BRAND:
                iSearch = createISearch(Constants.SEARCH_BRAND);
                break;
            case Constants.SEARCH_YEAR:
                iSearch = createISearch(Constants.SEARCH_YEAR);
                break;
        }
        iSearch.search(products);
    }

}

