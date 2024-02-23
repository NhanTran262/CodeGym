package entity;

import java.io.Serializable;

public class Variant implements Serializable {
    private int variantId;
    private String size;
    private String color;
    private long variantPrice;

    public int getVariantId() {
        return variantId;
    }

    public void setVariantId(int variantId) {
        this.variantId = variantId;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public long getVariantPrice() {
        return variantPrice;
    }

    public void setVariantPrice(long variantPrice) {
        this.variantPrice = variantPrice;
    }

    @Override
    public String toString() {
        return "Variant{" +
                "variantId=" + variantId +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", variantPrice=" + variantPrice +
                '}';
    }
}
