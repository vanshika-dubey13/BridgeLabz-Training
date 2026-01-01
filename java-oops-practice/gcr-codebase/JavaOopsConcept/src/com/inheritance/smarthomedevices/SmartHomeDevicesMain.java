package com.inheritance.smarthomedevices;

public class SmartHomeDevicesMain {
    public static void main(String[] args) {
        Thermostat thermostat = new Thermostat("TH-101", "ON", 22);
        thermostat.displayStatus();
    }
}
