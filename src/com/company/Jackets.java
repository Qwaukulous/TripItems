package com.company;

public class Jackets {
    private String color;
    private String material;
    private String patterns;
    private String pokets;
    private String size;

    public Jackets() {

    }

    public Jackets(String color, String material, String patterns, String pokets, String size) {
        this.color = color;
        this.material = material;
        this.patterns = patterns;
        this.pokets = pokets;
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getPatterns() {
        return patterns;
    }

    public void setPatterns(String patterns) {
        this.patterns = patterns;
    }

    public String getPokets() {
        return pokets;
    }

    public void setPokets(String pokets) {
        this.pokets = pokets;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
