package service;

import entity.Product;

import java.util.List;
import java.util.Scanner;

import static service.ProductService.plusProduct;
import static service.ProductService.products;

public class SellerService {
public static Scanner sc = new Scanner(System.in);
    public static void addProduct() {
        for (int index = 1; index <= 3; index++) {
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


}
