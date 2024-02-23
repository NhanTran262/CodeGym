package entity;

public class Variant {
    private int variantId;
    private String size;
    private String color;
    private long price;

    public Variant(int variantId, String size, String color, long price) {
        this.variantId = variantId;
        this.size = size;
        this.color = color;
        this.price = price;
    }

    public Variant(int variantId, String size, String color) {
        this.variantId = variantId;
        this.size = size;
        this.color = color;
    }

    public int getVariantId() {
        return variantId;
    }

    public void setVariantId(int id) {
        this.variantId = id;
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

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }
}
