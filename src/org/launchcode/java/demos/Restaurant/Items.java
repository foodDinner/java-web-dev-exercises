package org.launchcode.java.demos.Restaurant;

import java.util.*;
import java.time.*;

public class Items {

    private String itemName;
    private double cost;
    private String description;
    private String category;
    private boolean newItem;
    private LocalDate lastUpdated;

    public Items (String itemName, double cost, String description, String category, boolean newItem, LocalDate lastUpdated) {
        this.itemName = itemName;
        this.cost = cost;
        this.description = description;
        this.category = category;
        this.newItem = newItem;
        this.lastUpdated = lastUpdated;
    }

//    public Items(String itemName, double cost, String description, String category) {
//        this.itemName = itemName;
//        this.cost = cost;
//        this.description = description;
//        this.category = category;
//    }

    public Items (String name, double cost) {
        this(name, cost, "lol", "edible",true,LocalDate.now());
    }


    public String getName() {
        return itemName;
    }

    public double getCost() {
        return cost;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public boolean getIsNew() {
        return newItem;
    }

    public LocalDate getDate() {
        return lastUpdated;
    }

     public void updateItemInfo(String aName, double aCost, String aDescription) {
        itemName = aName;
        cost = aCost;
        description = aDescription;
        lastUpdated = LocalDate.now();
    }

    @Override
    public String toString() {
        return "Items{" +
                "itemName='" + itemName + '\'' +
                ", cost=" + cost +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", newItem=" + newItem +
                ", lastUpdated=" + lastUpdated +
                '}';
    }
}
