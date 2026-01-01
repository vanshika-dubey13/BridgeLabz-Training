package com.inheritance.transportsystem;

class Car extends Vehicle {
	
	//attributes
    private int seatCapacity;

    //constructor
    public Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    //overriding method of parent class 
    @Override
    public void displayInfo() {
        System.out.println("Car:");
        super.displayInfo();
        System.out.println("Seat Capacity: " + seatCapacity);
    }
}
