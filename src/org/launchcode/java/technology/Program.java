package org.launchcode.java.technology;

public class Program {
    public static void main(String[] args) {
        Laptop Lenovo = new Laptop("Windows","x64",1000);
        Laptop Mac = new Laptop("Mac","x64", 1200);
        System.out.println(Lenovo.getOS());
        System.out.println(Lenovo.getBatt());
        System.out.println(Lenovo.getID());

        System.out.println(Mac.getID());
    }
}
