package com.oopsscenariobased.vehiclerentalapp;

//subclass
public class Bike extends Vehicle {

	//constructor
    public Bike(String vehicleId, String brand) {
        super(vehicleId, brand, 300);
    }

    //overriding method of parent class
    @Override
    public double calculateRent(int days) {
        return baseRate * days;
    }
}
