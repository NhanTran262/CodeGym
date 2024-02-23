package entity;

import service.ProductService;


public class CartItem {
    private Product product;
    private int quantity;
    private long subtotal;
    private int variantId;

    public CartItem(Product product, int quantity, int variantId) {
        this.product = product;
        this.quantity = quantity;
        this.subtotal = quantity * product.getPrice();
        this.variantId = variantId;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public long getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(long subtotal) {
        this.subtotal = subtotal;
    }

    @Override
    public String toString() {
        return "CartItem{" +
                "product=" + product +
                ", quantity=" + quantity +
                ", subtotal=" + subtotal +
                ", variant= "+ ProductService.displayProductVariant(variantId) +
                '}';
    }
}
