package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input;
        double radius;
        double area;

        input = new Scanner(System.in);
        System.out.println("Enter the radius of a circle: ");
        radius = input.nextDouble();
        input.close();
//        area = Circle.getArea(radius);
        System.out.println(Circle.getArea(radius));
    }
}
