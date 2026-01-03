package com.oopsscenariobased.ridehailingapp;

//main method
public class RideHailAppMain {
    public static void main(String[] args) {

    	//creating objects for driver and vehicle
        Driver driver = new Driver("Rahul", "DL12345", 4.8);
        Vehicle vehicle = new Sedan("KA01AB1234");

        IRideService rideService = new RideService();
        rideService.bookRide(driver, vehicle, 12.5);
        rideService.endRide();
    }
}
