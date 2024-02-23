package service.impl;

import entity.Product;
import service.ISearch;

import java.util.List;
import java.util.Scanner;

public class SearchName implements ISearch {
    private static final Scanner scanner;

    static {
        scanner = new Scanner(System.in);
    }

    @Override
    public void search(List<Product> products) {
        System.out.println("Enter the product name you want to search: ");
        String productName = scanner.nextLine();
        boolean found = false;
        System.out.println("List of vehicle names: ");
        for (Product product : products) {
            if (product.getProductName().equalsIgnoreCase(productName)) {
                System.out.println(product.toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Cannot find vehicle by name! " + productName);
        }
    }
}
