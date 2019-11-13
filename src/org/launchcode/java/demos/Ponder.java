package org.launchcode.java.demos;

import java.util.*;

public class Ponder {
    public static void main(String[] args) {

        HashMap<String, Integer> output = new HashMap<>();
        String phrase = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        String[] charsInPhrase = phrase.split("");

        for (String character : charsInPhrase) {
            if (!output.containsKey(character)) {
                int count = Collections.frequency(Arrays.asList(charsInPhrase), character);
                output.put(character, count);
            }
        }

        System.out.println(output);
    }
}
