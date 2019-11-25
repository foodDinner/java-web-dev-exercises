package org.launchcode.java.technology;

class Serial {
    static int serial = 00001;

    static int setSerial() {
        return serial++;
    }
}
