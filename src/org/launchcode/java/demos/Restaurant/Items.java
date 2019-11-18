package org.launchcode.java.demos.Restaurant;

import java.util.*;

public class Items {

    private String itemName;
    private String description;
    private String category;
    private boolean newItem;
    private int lastUpdated;

    public Items (String itemName, String description, String category, boolean newItem, int lastUpdated) {
        this.itemName = itemName;
        this.description = description;
        this.category = category;
        this.newItem = newItem;
        this.lastUpdated = lastUpdated;
    }

    public String getName() {
        return itemName;
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

    public int getDate() {
        return lastUpdated;
    }

}
