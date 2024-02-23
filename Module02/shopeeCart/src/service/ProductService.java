package service;

import entity.Product;
import entity.ProductTree;
import entity.Variant;

import javax.sound.midi.MidiFileFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ProductService {
    protected static List<Product> products = new ArrayList<Product>();
    public static Scanner sc = new Scanner(System.in);
    private static int id = 0;
    private static int number = 0;
    private final static String name = "sanpham";
    private static int variantId = 0;

    protected static void plusProduct() {
        int id = addId();
        String name = addName();
        long price = setPrice();
        Product product = new Product(id, name, price);
        createListVariant(product);
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

    public static List<Product> getList() {
        return products;
    }

    public List<Product> getProductByPage(int pageIndex) {
        int starIndex = (pageIndex - 1) * pagesize;
        int endIndex = Math.min(starIndex + pagesize, products.size());
        return products.subList(starIndex, endIndex);
    }

    public static Product searchProductByName(String productName) {
        for (Product product : products) {
            if (product.getName().equals(productName)) {
                return product;
            }
        }
        return null;
    }

    public static void createListVariant(Product product) {
        List<Variant> variants = new ArrayList<>();
        final String[] size = {"S", "M", "L", "XL"};
        final String[] color = {"Black", "White", "Red", "Gray", "Blue", "Green"};
        int randomColorSize = ThreadLocalRandom.current().nextInt(1, color.length);
        int variantId;
        for (int sizeIndex = 0; sizeIndex < size.length; sizeIndex++) {
            for (int colorIndex = 0; colorIndex < randomColorSize; colorIndex++) {
                variantId = variantIdSetter();
                Variant variant = new Variant(variantId, size[sizeIndex], color[colorIndex]);
                variants.add(variant);
            }
        }
        product.setVariants(variants);
    }

    public static int variantIdSetter() {
        variantId++;
        return variantId;
    }

//    public static Product getProductByName(String productName) {
//        for (Product product : products) {
//            if (product.getName().equals(productName)) {
//                return product;
//            }
//        }
//        return null;
//    }

    public static void displayVariant(String productName) {
        Product product = searchProductByName(productName);
        ArrayList<String> sizeList = new ArrayList<>();
        ArrayList<String> colorList = new ArrayList<>();
        if (product != null) {
            List<Variant> variants = product.getVariants();
            sizeList.add(variants.get(0).getSize());
            colorList.add(variants.get(0).getColor());
            for (int index = 1; index < variants.size(); index++) {
                Variant variant = variants.get(index);
                String size = variant.getSize();
                String color = variant.getColor();
                if (!sizeList.contains(size)) {
                    sizeList.add(size);
                }
                if (!colorList.contains(color)) {
                    colorList.add(color);
                }
            }
        }
        System.out.println(sizeList);
        System.out.println(colorList);
    }

    public static Variant findVariant(String productName, String size, String color) {
        Product product = searchProductByName(productName);
        assert product != null;
        List<Variant> variants = product.getVariants();
        for (Variant variant : variants) {
            if ((Objects.equals(variant.getSize(), size)) && (Objects.equals(variant.getColor(), color))) {
                return variant;
            }
        }
        return null;
    }
public  static  String displayProductVariant(int variantId){
        Product product = findProductByVariantId(variantId);
        List<Variant> variants = product.getVariants();
        for (Variant variant : variants){
            if (variant.getVariantId() == variantId) {
                return variant.getSize() + " " + variant.getColor();
            }
        }
        return "";
}
public static Product findProductByVariantId(int variantId){
        for (Product product : products){
            List<Variant> variants = product.getVariants();
            for (Variant variant : variants){
                if (variant.getVariantId() == variantId){
                    return product;
                }
            }
        }
        return null;
}
    public static void addToTree() {
        ProductTree productTree = new ProductTree();
//        List<ProductTree> productTrees = new ArrayList<>();
        for (Product product : products) {
            if (productTree.getProduct() == null) {
                productTree.setProduct(product);
            } else if (productTree.getProduct().getPrice() > product.getPrice()) {
                ProductTree productTreeLeft = new ProductTree();
                productTreeLeft.setProduct(product);
                productTree.setLeft(productTreeLeft);
                System.out.println("Left" + productTreeLeft);
            } else if (productTree.getProduct().getPrice() < product.getPrice()) {
                ProductTree productTreeRight = new ProductTree();
                productTreeRight.setProduct(product);
                productTree.setRight(productTreeRight);
                System.out.println("Right" + productTreeRight);
            }


        }
    }
}
