package com.company;

public class FootWear {
    private String color;
    private String Size;
    private String Brand;
    private String Type;

    public FootWear(String color, String size, String brand, String type) {
        this.color = color;
        Size = size;
        Brand = brand;
        Type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String size) {
        Size = size;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public FootWear() {

    }
}
