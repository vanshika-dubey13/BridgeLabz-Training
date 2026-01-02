package com.oopsscenariobased.vehiclerentalapp;

//subclass
public class Truck extends Vehicle {

	//constructor
    public Truck(String vehicleId, String brand) {
        super(vehicleId, brand, 1500);
    }

  //overriding method of parent class
    @Override
    public double calculateRent(int days) {
        double loadCharge = 500;
        return (baseRate * days) + loadCharge;
    }
}