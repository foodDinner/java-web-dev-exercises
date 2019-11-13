package org.launchcode.java.demos;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

/**
 * From "Java Web Development"
 */
public class Hello {
    public static void main(String[] args) {
//        System.out.println("Hello, World");
        int[] practiceArray = new int[]{1,1,2,3,5,8};
        for (int i : practiceArray) {
            System.out.println(i);
        }
        String weirdPhrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] phraseSplit = weirdPhrase.split(" ");
//        for (String letter : phraseSplit) {
//            System.out.println(letter);
//        }
        System.out.println(Arrays.toString(phraseSplit));
    }
}
