import service.CartService;
import service.CustomerService;
import service.ProductService;
import service.SellerService;

public class Main {
    public static void main(String[] args) {
        System.out.println("Wellcome to the e-commerce site Shopee!");
        SellerService.addProduct();
        SellerService.printList();
        SellerService.printPage();
        CustomerService.buyItem();
        CustomerService.printCart();
    }
}