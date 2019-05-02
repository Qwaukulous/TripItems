package com.company;

public class Shirts {
    private String color;
    private String size;
    private String fabric;
    private String pattern;


    public Shirts() {
    }

    public Shirts(String color, String size, String fabric, String pattern) {
        this.color = color;
        this.size = size;
        this.fabric = fabric;
        this.pattern = pattern;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getFabric() {
        return fabric;
    }

    public void setFabric(String fabric) {
        this.fabric = fabric;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }
}


