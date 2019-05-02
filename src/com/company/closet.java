package com.company;

import java.util.ArrayList;
import java.util.List;

public class closet {

    private List<Jackets> jacketsList;
    private List<Pants> pantsList;
    private List<FootWear> footWearsList;
    private List<Shirts> shirtsList;

    public closet() {
        jacketsList = new ArrayList<>();
        pantsList = new ArrayList<>();
        footWearsList = new ArrayList<>();
        shirtsList = new ArrayList<>();
    }

    public List<Jackets> getJacketsList() {
        return jacketsList;
    }

    public void setJacketsList(List<Jackets> jacketsList) {
        this.jacketsList = jacketsList;
    }

    public List<Pants> getPantsList() {
        return pantsList;
    }

    public void setPantsList(List<Pants> pantsList) {
        this.pantsList = pantsList;
    }

    public List<FootWear> getFootWearsList() {
        return footWearsList;
    }

    public void setFootWearsList(List<FootWear> footWearsList) {
        this.footWearsList = footWearsList;
    }

    public List<Shirts> getShirtsList() {
        return shirtsList;
    }

    public void setShirtsList(List<Shirts> shirtsList) {
        this.shirtsList = shirtsList;
    }
}
