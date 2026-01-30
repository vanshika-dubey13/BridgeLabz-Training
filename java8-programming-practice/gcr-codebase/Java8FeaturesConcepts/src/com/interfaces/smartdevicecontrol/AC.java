package com.interfaces;

public class AC implements SmarrtDeviceControl{

	@Override
	public void turnOn() {
		System.out.println("AC is ON");
		
	}

	@Override
	public void turnOff() {
		System.out.println("AC is OFF");
		
	}

}
