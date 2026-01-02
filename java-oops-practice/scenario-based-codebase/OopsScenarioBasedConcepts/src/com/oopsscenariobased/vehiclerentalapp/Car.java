package com.oopsscenariobased.vehiclerentalapp;

//subclass
public class Car extends Vehicle {

	//constructor
    public Car(String vehicleId, String brand) {
        super(vehicleId, brand, 800);
    }

  //overriding method of parent class
    @Override
    public double calculateRent(int days) {
        double insuranceCharge = 200;
        return (baseRate * days) + insuranceCharge;
    }
}