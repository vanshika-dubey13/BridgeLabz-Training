package com.inheritance.smarthomedevices;

public class Device {

	//attributes
	String deviceId;
	String status;
	public Device(String deviceId, String status) {
		this.deviceId = deviceId;
		this.status = status;
	}

	// Method to display device status
	public	void displayStatus() {
		System.out.println("Device ID: " + deviceId);
		System.out.println("Status: " + status);
		//System.out.println("Temperature Setting: " + temperatureSetting + "°C");
	}
}