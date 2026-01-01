package com.inheritance.transportsystem;

class Truck extends Vehicle {
	
	//attributes
    private double loadCapacity; // in tons

    //constructor
    public Truck(int maxSpeed, String fuelType, double loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

  //overriding method of parent class 
    @Override
    public void displayInfo() {
        System.out.println("Truck:");
        super.displayInfo();
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
}
