package com.encapsulation.ridehailingapp;

//abstract class
public abstract class Vehicle implements GPS {

	//attributes
    protected int vehicleId;
    protected String driverName;
    protected double ratePerKm;

    // Encapsulated data
    private String currentLocation;

    public Vehicle(int vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
        this.currentLocation = "Unknown";
    }

    // Abstract method
    public abstract double calculateFare(double distance);

    // Concrete method
    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Rate per Km: ₹" + ratePerKm);
    }

    //  (getter/setter)
    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    
    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }
}
