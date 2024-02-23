package service.impl;

import entity.Product;
import service.ISearch;

import java.util.List;
import java.util.Scanner;

public class SearchYear implements ISearch {
    private static final Scanner scanner;

    static {
        scanner = new Scanner(System.in);
    }
    @Override
    public void search(List<Product> products) {
        System.out.println("Enter the vehicle year you want to search: ");
        int year = scanner.nextInt();
        scanner.nextLine();
        boolean found = false;
        System.out.println("List of vehicle years: ");
        for (Product product : products) {
            if (product.getYear() == year) {
                System.out.println(product.toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Cannot find vehicle by year! " + year);
        }
    }
}
