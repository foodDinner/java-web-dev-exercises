package org.launchcode.java.demos.Restaurant;

import java.util.*;

public class Items {

    private String itemName;
    private String description;
    private String category;
    private boolean newItem;
    private Date lastUpdated;

    public Items (String itemName, String description, String category, boolean newItem, Date lastUpdated) {
        this.itemName = itemName;
        this.description = description;
        this.category = category;
        this.newItem = newItem;
        this.lastUpdated = lastUpdated;
    }


}
