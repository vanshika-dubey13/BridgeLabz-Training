package com.oopsscenariobased.ridehailingapp;

public class RideService implements IRideService {

    private double fare; 
    private double baseFare = 50.0;

    @Override
    public void bookRide(Driver driver, Vehicle vehicle, double distance) {
        fare = baseFare + (distance * vehicle.getRatePerKm());

        System.out.println("Ride booked!");
        System.out.println("Driver: " + driver.getName());
        System.out.println("Vehicle: " + vehicle.getType());
        System.out.println("Estimated Fare: Rs. " + fare);
    }

    //overriding method of interface
    @Override
    public void endRide() {
        System.out.println("Ride ended. Total Fare: Rs. " + fare);
    }

    public double getFare() {
        return fare;
    }
}
