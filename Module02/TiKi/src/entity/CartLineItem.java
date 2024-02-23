package entity;

import service.CartService;
import service.ProductService;

import java.io.Serializable;

public class CartLineItem implements Serializable {
    private Product product = new Product();
    private int cartLineItemId;
    private int quantity;
    private long subTotal;
    private int variantId;

    public CartLineItem(Product product, int quantity, int variantId) {
        this.product = product;
        this.quantity = quantity;
        this.variantId = variantId;
        this.subTotal = CartService.addingPriceToVariant(product,variantId);
    }

    public int getVariantId() {
        return variantId;
    }

    public void setVariantId(int variantId) {
        this.variantId = variantId;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getCartLineItemId() {
        return cartLineItemId;
    }

    public void setCartLineItemId(int cartLineItemId) {
        this.cartLineItemId = cartLineItemId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public long getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(long subTotal) {
        this.subTotal = subTotal;
    }

    @Override
    public String toString() {
        return "CartLineItem{" +
                "cartLineItemId=" + cartLineItemId +
                ", product=" + product.getProductName() +
                ", quantity=" + quantity +
                ", subTotal=" + subTotal +
                ", variant=" + ProductService.displayProductVariant(variantId) +
                '}';
    }
}
