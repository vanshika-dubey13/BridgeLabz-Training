package com.encapsulation.ridehailingapp;

//subclass
public class Car extends Vehicle {

    //constructor
	public Car(int vehicleId, String driverName) {
        super(vehicleId, driverName, 15.0);
    }

  //overriding method of parent class
    @Override
    public double calculateFare(double distance) {
        return distance * ratePerKm + 50; // base charge
    }
}
