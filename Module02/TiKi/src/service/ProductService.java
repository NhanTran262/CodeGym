package service;

import entity.Product;
import entity.Variant;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ProductService implements Serializable {
    protected static List<Product> products = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    private static int productId = 1000;
    private static int number = 0;
    private static String productName = "sanpham";
    private static int variantId = 4000;

    public static void plusProduct() {
        int productId = addProductId();
        String productName = addProductName();
        long price = setPrice();
        Product product = new Product(productId, productName, price);
        createVariantList(product);
        products.add(product);
    }

    public static int addProductId() {
        productId++;
        return productId;
    }

    public static String addProductName() {
        number++;
        return productName + number;
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

    public static void createProductList() {
        for (int index = 1; index <= 100; index++) {
            plusProduct();
        }
    }

    public static List<Product> getProductByPage(int pageIndex) {
        int pageSize = 20;
        int startIndex = (pageIndex - 1) * pageSize;
        int endIndex = Math.min(startIndex + pageSize, products.size());
        return products.subList(startIndex, endIndex);
    }

    public static Product getProductByName(String productName) {
        for (Product product : products) {
            if (product.getProductName().equals(productName)) {
                return product;
            }
        }
        return null;
    }

    public static void displayProductList() {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public static List<Product> getList() {
        return products;
    }

    public static void createVariantList(Product product) {
        List<Variant> variants = product.getVariants();
        final String[] size = {"S", "M", "L", "XL"};
        final String[] color = {"Black", "White", "Red", "Blue", "Green", "Purple"};
        int randomColorSize = ThreadLocalRandom.current().nextInt(1, color.length);
        for (int sizeIndex = 0; sizeIndex < size.length; sizeIndex++) {
            for (int colorIndex = 0; colorIndex < randomColorSize; colorIndex++) {
                Variant variant = new Variant();
                variant.setVariantId(variantIdSetter());
                variant.setVariantPrice(randomPriceForVariants());
                variant.setSize(size[sizeIndex]);
                variant.setColor(color[colorIndex]);
                variants.add(variant);
            }
        }
        product.setVariants(variants);
    }

    public static int variantIdSetter() {
        return variantId++;
    }

    public static long randomPriceForVariants() {
        return ThreadLocalRandom.current().nextLong(-10, 10);
    }

    public static void displayVariant(String productName) {
        Product product = getProductByName(productName);
        ArrayList<String> sizeList = new ArrayList<>();
        ArrayList<String> colorList = new ArrayList<>();
        if (product != null) {
            List<Variant> variants = product.getVariants();
            sizeList.add(variants.get(0).getSize());
            colorList.add(variants.get(0).getColor());
            for (int index = 0; index < variants.size(); index++) {
                if (!sizeList.contains(variants.get(index).getSize())) {
                    sizeList.add(variants.get(index).getSize());
                }
                if (!colorList.contains(variants.get(index).getColor())) {
                    colorList.add(variants.get(index).getColor());
                }
            }
        }
        System.out.println(sizeList);
        System.out.println(colorList);
    }

    public static Variant findVariant(String productName, String size, String color) {
        Product product = getProductByName(productName);
        assert product != null;
        List<Variant> variants = product.getVariants();
        for (Variant variant : variants) {
            if ((Objects.equals(variant.getSize(), size)) && (Objects.equals(variant.getColor(), color))) {
                return variant;
            }
        }
        return null;
    }

    public static String displayProductVariant(int variantId) {
        Product product = findProductByVariantId(variantId);
        List<Variant> variants = product.getVariants();
        for (Variant variant : variants) {
            if (variant.getVariantId() == variantId) {
                return variant.getSize() + " " + variant.getColor();
            }
        }
        return "";
    }

    public static Product findProductByVariantId(int variantId) {
        for (Product product : products) {
            List<Variant> variants = product.getVariants();
            for (Variant variant : variants) {
                if (variant.getVariantId() == variantId) {
                    return product;
                }
            }
        }
        return null;
    }

    public static Variant findVariantByVariantId(Product product, int variantId) {
        List<Variant> variants = product.getVariants();
        for (Variant variant : variants) {
            if (variant.getVariantId()==variantId){
                return variant;
            }
        }
        return null;
    }

}
