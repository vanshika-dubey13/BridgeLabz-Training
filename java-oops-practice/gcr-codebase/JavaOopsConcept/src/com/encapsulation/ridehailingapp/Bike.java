package com.encapsulation.ridehailingapp;

//subclass
public class Bike extends Vehicle {

	//constructor
    public Bike(int vehicleId, String driverName) {
        super(vehicleId, driverName, 8.0);
    }

  //overriding method of parent class
    @Override
    public double calculateFare(double distance) {
        return distance * ratePerKm;
    }
}
