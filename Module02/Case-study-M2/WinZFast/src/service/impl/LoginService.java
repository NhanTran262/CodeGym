package service.impl;

import constant.Constants;
import entity.Admin;
import entity.Customer;
import entity.Employee;
import entity.User;

import java.io.Serializable;
import java.util.Scanner;

import static service.impl.AdminService.adminLoginScreen;
import static service.impl.CustomerService.customerLoginScreen;
import static service.impl.EmployeeService.checkOutLoginEmployee;
import static service.impl.UserService.*;

public class LoginService implements Serializable {
    public static Scanner scanner;

    static {
        scanner = new Scanner(System.in);
    }

    public static void checkAdminLogin(User user) {
        if (user instanceof Admin) {
            adminLoginScreen();
        }
    }

    public static void checkEmployeeLogin(User user) {
        if (user instanceof Employee) {
            System.out.println("---EMPLOYEE---");
            checkOutLoginEmployee();
        }
    }

    public static void checkCustomerLogin(User user) {
        if (user instanceof Customer) {
            customerLoginScreen();
        }
    }

    public static void login() {
        System.out.println("--LOGIN--");
        System.out.println("Enter username: ");
        String username = scanner.nextLine();
        System.out.println("Enter password: ");
        String password = scanner.nextLine();
        User user = loginInByUser(username, password);
        if (user != null) {
            checkAdminLogin(user);
            checkEmployeeLogin(user);
            checkCustomerLogin(user);
        } else {
            System.out.println("Wrong login information.");
            login();
        }
    }

    public static void menuLogin() {
        loadToFile();
        displayCustomer();
        displayEmployee();
        System.out.println("<--Welcome to WinZ Fast-->");
        int choice;
        System.out.println("-----****-----" +
                "\n1.LOGIN." +
                "\n2.REGISTER." +
                "\n3.EXIT" +
                "\n-----****-----");
        System.out.println("Enter your choice: ");
        choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice) {
            case Constants.LOGIN:
                login();
                break;
            case Constants.REGISTER:
                CustomerService.registerCustomerAccount();
                break;
            case Constants.EXIT:
                scanner.close();
                System.exit(0);
                break;
            default:
                System.out.println("Account not found.");
                break;
        }

    }

}
