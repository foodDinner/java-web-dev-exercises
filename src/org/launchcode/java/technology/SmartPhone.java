package org.launchcode.java.technology;

public class SmartPhone extends Computer {
    private String os;


    public SmartPhone(String aOS, String aProcessorType, int aBatteryLife) {
        super(aProcessorType, aBatteryLife);
        os = aOS;
    }

    public String getOS() {
        return os;
    }
}
