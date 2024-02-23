package service.impl;

import constant.Constants;
import constant.EDepartment;
import constant.EPosition;
import entity.Employee;
import entity.User;

import java.io.Serializable;
import java.util.*;

import static service.impl.LoginService.menuLogin;
import static service.impl.UserService.*;

public class AdminService implements Serializable {

    public static Scanner scanner;
    private static int userId;

    static {
        scanner = new Scanner(System.in);
        userId = UserService.getUserId();
    }

    public static void adminLoginScreen() {
        int flag;
        System.out.println("-----****-----" +
                "\n1.CREATE EMPLOYEE." +
                "\n2.VIEW EMPLOYEE." +
                "\n3.VIEW CUSTOMER." +
                "\n4.EDIT EMPLOYEE INFO." +
                "\n5.DELETE EMPLOYEE." +
                "\n6.LOGOUT." +
                "\n-----****-----");
        System.out.println("Enter your choice: ");
        flag = scanner.nextInt();
        scanner.nextLine();
        switch (flag) {
            case Constants.CREATE_EMPLOYEE:
                createEmployeeAccount();
                break;
            case Constants.VIEW_EMPLOYEE:
                displayEmployee();
                adminLoginScreen();
                break;
            case Constants.VIEW_CUSTOMER:
                displayCustomer();
                adminLoginScreen();
                break;
            case Constants.EDIT_EMPLOYEE_INFO:
                editEmployeeInfo();
                break;
            case Constants.DELETE_EMPLOYEE:
                deleteEmployeeAccount();
                break;
            case Constants.LOGOUT:
                menuLogin();
                break;
            default:
                System.out.println("Out");
                break;
        }
    }

    public static void createEmployeeAccount() {
        userId++;
        System.out.println("Enter the username to register: ");
        String username = scanner.nextLine();
        if (!isUsernameDuplicate(username)) {
            System.out.println("Enter the password to register: ");
            String password = scanner.nextLine();
            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            System.out.println("Enter employee department (ACCOUNTANT,PERSONNEL,SALE): ");
            EDepartment department = EDepartment.valueOf(scanner.nextLine().toUpperCase());
            System.out.println("Enter employee position (MANAGER,STAFF): ");
            EPosition position = EPosition.valueOf(scanner.nextLine().toUpperCase());
            System.out.println("Enter employee salary: ");
            long salary = scanner.nextLong();
            scanner.nextLine();
            addUserEmployeeToList(userId, username, password, name, department, position, salary);
            System.out.println("Successfully Created.");
            adminLoginScreen();
        } else {
            System.out.println("Username already existed! ");
            createEmployeeAccount();
        }
    }

    private static void editEmployeeInfo() {

    }

    private static void deleteEmployeeAccount() {
    }


}
