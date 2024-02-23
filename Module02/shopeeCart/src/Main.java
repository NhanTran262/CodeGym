import entity.ProductTree;
import service.CartService;
import service.CustomerService;
import service.ProductService;
import service.SellerService;

public class Main {


    public static void main(String[] args) {
        SellerService.addProduct();
        SellerService.printList();
//        SellerService.printPage();
        CustomerService.register();
        CustomerService.printCustomerList();
        CustomerService.buyProduct();
        CustomerService.printCustomerList();

//        ProductService.addToTree();
    }
}