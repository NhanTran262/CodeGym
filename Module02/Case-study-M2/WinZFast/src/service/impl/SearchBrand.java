package service.impl;

import entity.Product;
import service.ISearch;

import java.util.List;
import java.util.Scanner;

public class SearchBrand implements ISearch {
    private static final Scanner scanner;

    static {
        scanner = new Scanner(System.in);
    }

    @Override
    public void search(List<Product> products) {
        System.out.println("Enter the vehicle brand you want to search: ");
        String brand = scanner.nextLine();
        boolean found = false;
        System.out.println("List of vehicle brands: ");
        for (Product product : products) {
            if (product.getBrand().equalsIgnoreCase(brand
            )) {
                System.out.println(product.toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Cannot find vehicle by brand! " + brand);
        }
    }
}

