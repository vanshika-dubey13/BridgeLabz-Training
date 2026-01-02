package com.oopsscenariobased.vehiclerentalapp;

public abstract class Vehicle implements Rentable {
	//attributes
    protected String vehicleId;
    protected String brand;
    protected double baseRate;

    //constructor
    public Vehicle(String vehicleId, String brand, double baseRate) {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.baseRate = baseRate;
    }

    //displaying vehicle details
    public String getVehicleId() {
        return vehicleId;
    }

    public String getBrand() {
        return brand;
    }

    public double getBaseRate() {
        return baseRate;
    }
}
