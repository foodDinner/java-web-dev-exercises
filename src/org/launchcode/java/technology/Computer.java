package org.launchcode.java.technology;

public abstract class Computer {
    private String processorType;
    private boolean containsMetal = true;
    private int batteryLife;
    private int ID;


    public Computer(String aProcessorType, int aBatteryLife) {
        processorType = aProcessorType;
        batteryLife = aBatteryLife;
        ID = Serial.setSerial();
    }

    public String getProc() {
        return processorType;
    }

    public int getBatt() {
        return batteryLife;
    }

    public void setBatt(int battLife) {
        batteryLife = battLife;
    }

    public void setProc(String processor) {
        processorType = processor;
    }

    public int getID() {
        return ID;
    }

}
