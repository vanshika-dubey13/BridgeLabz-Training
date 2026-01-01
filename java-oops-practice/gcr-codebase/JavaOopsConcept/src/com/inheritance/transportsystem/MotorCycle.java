package com.inheritance.transportsystem;

class Motorcycle extends Vehicle {
	
	//attributes
    private boolean hasSidecar;

    //constructor
    public Motorcycle(int maxSpeed, String fuelType, boolean hasSidecar) {
        super(maxSpeed, fuelType);
        this.hasSidecar = hasSidecar;
    }

  //overriding method of parent class 
    @Override
    public void displayInfo() {
        System.out.println("Motorcycle:");
        super.displayInfo();
        System.out.println("Has Sidecar: " + hasSidecar);
    }
}
