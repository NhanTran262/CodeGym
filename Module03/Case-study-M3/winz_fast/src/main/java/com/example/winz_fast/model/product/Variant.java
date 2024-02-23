package com.example.winz_fast.model.product;

public class Variant {
    private int variant_id;
    private String model;
    private String color;

    public Variant(int variant_id, String model, String color) {
        this.variant_id = variant_id;
        this.model = model;
        this.color = color;
    }

    public Variant() {
    }

    public int getVariant_id() {
        return variant_id;
    }

    public void setVariant_id(int variant_id) {
        this.variant_id = variant_id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
