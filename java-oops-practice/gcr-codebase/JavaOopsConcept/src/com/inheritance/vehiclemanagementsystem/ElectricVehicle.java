package com.inheritance.vehiclemanagementsystem;

//Subclass ElectricVehicle
public class ElectricVehicle extends Vehicle {
	
	//attribute
	private int batteryCapacity; // in kWh

	//constructor
	public ElectricVehicle(String model, int maxSpeed, int batteryCapacity) {
		super(model, maxSpeed);
		this.batteryCapacity = batteryCapacity;
	}

	public void charge() {
		System.out.println(getModel() + " is charging. Battery capacity: " + batteryCapacity + " kWh");
	}

	//overriding method of parent class 
	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
	}
}









