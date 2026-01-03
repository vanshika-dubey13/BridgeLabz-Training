package com.oopsscenariobased.ridehailingapp;

//superclass
public class Vehicle {
	
	//attributes
    protected String vehicleNumber;
    protected int capacity;
    protected String type;
    protected double ratePerKm;

    //constructor
    public Vehicle(String vehicleNumber, int capacity, String type, double ratePerKm) {
        this.vehicleNumber = vehicleNumber;
        this.capacity = capacity;
        this.type = type;
        this.ratePerKm = ratePerKm;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }
}
