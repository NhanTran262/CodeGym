package service.impl;

import constant.Constants;
import constant.EDepartment;
import constant.EPosition;
import entity.Employee;
import entity.Product;
import entity.User;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static service.impl.LoginService.menuLogin;
import static service.impl.ProductService.*;
import static service.impl.UserService.*;

public class EmployeeService implements Serializable {
    public static Scanner scanner;
    private static List<User> users;
    private static int productId;

    static {
        scanner = new Scanner(System.in);
        users = new ArrayList<>();
        productId = UserService.getUserId();
    }

    public static void checkOutLoginEmployee() {
        System.out.println("Enter department (ACCOUNTANT,PERSONNEL,SALE): ");
        EDepartment department = EDepartment.valueOf(scanner.nextLine().toUpperCase());
        System.out.println("Enter position (MANAGER,STAFF): ");
        EPosition position = EPosition.valueOf(scanner.nextLine().toUpperCase());
        System.out.println("Enter employee name: ");
        String employeeName = scanner.nextLine();
        boolean isEmployeeInPosition = isEmployeeInPosition(department, position, employeeName);
        if (isEmployeeInPosition) {
            System.out.println(employeeName + " is in the " + department +
                    " department as a " + position);
            handleSaleStaff();
        } else {
            System.out.println(employeeName + " is not in the " + department +
                    " department as a " + position);
        }
        checkOutLoginEmployee();
    }

    public static void handleSaleStaff() {
        System.out.println("Enter Employee Name: ");
        String staffName = scanner.nextLine();
        User staff = findSaleStaffByName(staffName);
        if (staff == null) {
            System.out.println("You are not a staff member in the Sale Department.");
            handleSaleStaff();
        }
        assert staff != null;
        System.out.println("Welcome " + staff.getName() + "!");
        employeeLoginScreen();
    }

    public static void addProductByStaffSale() {
        System.out.println("Enter Product Name: ");
        String productName = scanner.nextLine();
        System.out.println("Enter brand: ");
        String brand = scanner.nextLine();
        System.out.println("Enter year: ");
        int year = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter price: ");
        long price = scanner.nextLong();
        scanner.nextLine();
        addProductToList(productId, productName, brand, year, price);
        displayListProduct();
        employeeLoginScreen();
    }

    public static void employeeLoginScreen() {
        loadToFile();
        int flag;
        System.out.println("-----****-----" +
                "\n1.ADD PRODUCT BY STAFF SALE." +
                "\n2.SEARCH PRODUCT" +
                "\n3.EDIT PRODUCT BY STAFF SALE." +
                "\n4.DELETE PRODUCT BY STAFF SALE." +
                "\n5.LOGOUT" +
                "\n-----****-----");
        System.out.println("Enter your choice: ");
        flag = scanner.nextInt();
        scanner.nextLine();
        switch (flag) {
            case Constants.ADD_PRODUCT_BY_STAFF_SALE:
                addProductByStaffSale();
                break;
            case Constants.SEARCH_PRODUCT:
                searchProduct();
                break;
            case Constants.EDIT_PRODUCT_BY_STAFF_SALE:
                break;
            case Constants.DELETE_PRODUCT_BY_STAFF_SALE:
                break;
            case Constants.LOGOUT2:
                menuLogin();
                break;
        }
    }

}
