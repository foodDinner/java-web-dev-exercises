package org.launchcode.java.demos.Restaurant;

import java.util.*;
import java.time.*;


public class Menu {

    public static void main(String[] args) {
        Items Apple = new Items("Apple", 5.00, "A juicy apple", "A la carte", true, LocalDate.of(2019, Month.AUGUST, 20));
        Items Orange = new Items("Orange", 3.00, "A citrus fruit", "A la carte", false, LocalDate.of(2019, Month.AUGUST, 1));
        ArrayList<Items> menuList = new ArrayList<>();
        menuList.add(Apple);
        menuList.add(Orange);
//        System.out.println(menuList.get(1).getName());

        for (Items item : menuList) {
            System.out.println("*****");
            System.out.println(item.getName());
            System.out.println(item.getCost());
            System.out.println(item.getDescription());
            System.out.println(item.getCategory());
            System.out.println(item.getIsNew());
            System.out.println(item.getDate());
            System.out.println("*****\n");
        }
        System.out.println(menuList);
    }
}
