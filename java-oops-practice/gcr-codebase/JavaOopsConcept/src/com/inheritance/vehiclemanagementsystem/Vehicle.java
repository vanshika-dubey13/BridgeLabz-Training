package com.inheritance.vehiclemanagementsystem;

//Superclass Vehicle
class Vehicle {
	
	//attributes
	private String model;
	private int maxSpeed;

	// Constructor
	public Vehicle(String model, int maxSpeed) {
		this.model = model;
		this.maxSpeed = maxSpeed;
	}

	// Getter methods
	public String getModel() {
		return model;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	// Method to display vehicle details
	public void displayInfo() {
		System.out.println("Model: " + model);
		System.out.println("Max Speed: " + maxSpeed + " km/h");
	}
}