import entity.Customer;
import service.ProductService;
import service.CustomerService;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        ProductService.createProductList();
        CustomerService.run();


    }
}