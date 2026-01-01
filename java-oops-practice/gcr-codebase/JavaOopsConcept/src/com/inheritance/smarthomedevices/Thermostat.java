package com.inheritance.smarthomedevices;

//subclass
public class Thermostat extends Device {
	
	//attributes
    int temperatureSetting;

    // Constructor
    Thermostat(String deviceId, String status, int temperatureSetting) {
        super(deviceId, status); // Call superclass constructor
        this.temperatureSetting = temperatureSetting;
    }

    // Method to display device status
    public void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}
