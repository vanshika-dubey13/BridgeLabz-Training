package com.inheritance.transportsystem;

//superclass
class Vehicle {
	
	//attributes
    protected int maxSpeed;
    protected String fuelType;

    //constructor
    public Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    //displaying details
    public void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed + " km/h");
        System.out.println("Fuel Type: " + fuelType);
    }
}
