package com.encapsulation.vehiclerental;

abstract class Vehicle {
	
	//attributes
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    //constructor
    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    //getters and setters
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    // Abstract method to calculate rental cost
    public abstract double calculateRentalCost(int days);
}
