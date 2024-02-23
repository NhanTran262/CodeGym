package util;

import constant.EPosition;
import entity.Employee;
import entity.Product;
import service.impl.EmployeeService;
import service.impl.ProductService;
import service.impl.UserService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserService.createAdminAccount();
        view.run();

//
    }
}
