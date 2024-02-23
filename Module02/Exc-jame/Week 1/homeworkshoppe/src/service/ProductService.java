package service;

import entity.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ProductService {
    protected static List<Product> products = new ArrayList<Product>();
    public static Scanner sc = new Scanner(System.in);
    private static int id = 0;
    private static int number = 0;
    private final static String name = "sanpham";

    protected static void plusProduct() {
        int id = addId();
        String name = addName();
        long price = setPrice();
        Product product = new Product(id, name, price);
        products.add(product);
    }

    public static int addId() {
        id++;
        return id;
    }

    public static String addName() {
        number++;
        return name + number;
    }

    public static long setPrice() {
        return randomPrice();
    }

    public static long randomPrice() {
        return nextLongBetween(10, 1000);
    }

    public static long nextLongBetween(long min, long max) {
        return ThreadLocalRandom.current().nextLong(min, max);
    }

    private int pagesize = 3;

    public List<Product> getProductByPage(int pageIndex) {
        int starIndex = (pageIndex - 1) * pagesize;
        int endIndex = Math.min(starIndex + pagesize, products.size());
        return products.subList(starIndex, endIndex);
    }

//    public static Product searchProductById(int id) {
//        for (Product product : products) {
//            if (product.getId() == id) {
//                return product;
//            }
//        }
//        return null;
//    }
}


