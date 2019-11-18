package org.launchcode.java.demos.Restaurant;

import java.util.*;


public class Menu {
    public static void main(String[] args) {
        Items Apple = new Items("Apple", "A juicy apple", "A la carte", true, 2019/10/19);
        Items Orange = new Items("Orange", "A citrus fruit", "A la carte", false, 2019/10/05);
        ArrayList<Items> menuList = new ArrayList<>();
        menuList.add(Apple);
        menuList.add(Orange);
//        System.out.println(menuList.get(1).getName());

        for (Items item : menuList) {
            System.out.println("*****");
            System.out.println(item.getName());
            System.out.println(item.getDescription());
            System.out.println(item.getCategory());
            System.out.println(item.getIsNew());
            System.out.println(item.getDate());
            System.out.println("*****\n");
        }
    }

}
