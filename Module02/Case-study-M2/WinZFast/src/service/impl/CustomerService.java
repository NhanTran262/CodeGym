package service.impl;

import constant.Constants;
import entity.Address;

import java.io.Serializable;
import java.util.Scanner;

import static service.impl.LoginService.menuLogin;
import static service.impl.ProductService.displayListProduct;
import static service.impl.ProductService.searchProduct;
import static service.impl.UserService.*;

public class CustomerService implements Serializable {
    public static Scanner scanner;
    private static int userId;


    static {
        scanner = new Scanner(System.in);
        userId = UserService.getUserId();

    }

    public static void customerLoginScreen() {
        int flag;
        System.out.println("-----****-----" +
                "\n1.VIEW PRODUCT" +
                "\n2.FIND PRODUCT." +
                "\n3.BUY PRODUCT." +
                "\n4.LOGOUT." +
                "-----****-----");
        System.out.println("Enter your choice: ");
        flag = scanner.nextInt();
        scanner.nextLine();
        switch (flag) {
            case Constants.VIEW_PRODUCT:
                displayListProduct();
                break;
            case Constants.FIND_PRODUCT:
                searchProduct();
                break;
            case Constants.BUY_PRODUCT:
                buyProduct();
                break;
            case Constants.LOGOUT1:
                menuLogin();
                break;
        }
    }

    private static void buyProduct() {
    }

    public static void registerCustomerAccount() {
        System.out.println("--REGISTER--");
        userId++;
        System.out.println("Enter the username to register: ");
        String username = scanner.nextLine();
        if (!isUsernameDuplicate(username)) {
            System.out.println("Enter the password to register: ");
            String password = scanner.nextLine();
            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            System.out.println("Enter the ID Card: ");
            int idCard = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter address: ");
            Address address = createAddress();
            addUserCustomerToList(userId, username, password, name, idCard, address);
            menuLogin();
        } else {
            System.out.println("Username already existed! ");
            registerCustomerAccount();
        }
    }
}