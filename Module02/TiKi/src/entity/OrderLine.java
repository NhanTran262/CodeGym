package entity;

import java.io.Serializable;

public class OrderLine extends CartLineItem implements Serializable {
    public OrderLine(Product product, int quantity, int variantId) {
        super(product, quantity, variantId);
    }
}
