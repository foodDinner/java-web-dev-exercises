package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input;
        double radius;
//        double area;

        input = new Scanner(System.in);
        System.out.println("Enter the radius of a circle: ");
        radius = input.nextDouble();
//        input.close();
//        area = Circle.getArea(radius);
        if (radius < 0) {
            while (radius < 0) {
                System.out.println("Enter a positive number.");
                System.out.println("Enter the radius of a circle: ");
                radius = input.nextDouble();
            }
        }

        if (Double.isNaN(radius)) {
            System.out.println("Enter a radius.");
        } else {
            System.out.println(Circle.getArea(radius));

        }
    }
}