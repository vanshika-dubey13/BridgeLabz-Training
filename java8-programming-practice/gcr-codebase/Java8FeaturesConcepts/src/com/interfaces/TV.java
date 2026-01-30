
package com.interfaces;

public class TV implements SmarrtDeviceControl{

	@Override
	public void turnOn() {
		System.out.println("TV is ON");
		
	}

	@Override
	public void turnOff() {
		System.out.println("TV is OFF");
		
	}

}

