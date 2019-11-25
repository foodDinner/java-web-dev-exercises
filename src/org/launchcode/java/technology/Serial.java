package org.launchcode.java.technology;

class Serial {
    static int serial = 00001;

    public static int setSerial() {
        return serial++;
    }
}
