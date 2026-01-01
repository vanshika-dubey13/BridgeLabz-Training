package com.inheritance.vehiclemanagementsystem;

//Subclass PetrolVehicle implementing Refuelable
public class PetrolVehicle extends Vehicle implements Refuelable {
	
	//attributes
	private int fuelTankCapacity; // in liters

	//constructor
	public PetrolVehicle(String model, int maxSpeed, int fuelTankCapacity) {
		super(model, maxSpeed);
		this.fuelTankCapacity = fuelTankCapacity;
	}
	//overriding method of parent class 
	@Override
	public void refuel() {
		System.out.println(getModel() + " is refueling. Tank capacity: " + fuelTankCapacity + " liters");
	}

	//overriding method of parent class 
	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Fuel Tank Capacity: " + fuelTankCapacity + " liters");
	}
}