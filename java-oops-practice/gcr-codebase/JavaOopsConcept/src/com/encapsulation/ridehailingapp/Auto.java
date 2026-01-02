package com.encapsulation.ridehailingapp;

//subclass
public class Auto extends Vehicle {

	//constructor
    public Auto(int vehicleId, String driverName) {
        super(vehicleId, driverName, 10.0);
    }

    //overriding method of parent class
    @Override
    public double calculateFare(double distance) {
        return distance * ratePerKm + 20; // auto surcharge
    }
}
