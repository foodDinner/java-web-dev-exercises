package org.launchcode.java.technology;

public class Laptop extends Computer {
    private String os;

    public Laptop (String aOS, String aProcessorType, int aBatteryLife) {
        super(aProcessorType, aBatteryLife);
        os = aOS;
    }

    public String getOS() {
        return os;
    }
}
