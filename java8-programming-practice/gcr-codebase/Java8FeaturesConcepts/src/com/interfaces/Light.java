package com.interfaces;

public class Light implements SmarrtDeviceControl{

	@Override
	public void turnOn() {
		System.out.println("LIGHT is ON");
		
	}

	@Override
	public void turnOff() {
		System.out.println("LIGHT is OFF");
		
	}
	
}
