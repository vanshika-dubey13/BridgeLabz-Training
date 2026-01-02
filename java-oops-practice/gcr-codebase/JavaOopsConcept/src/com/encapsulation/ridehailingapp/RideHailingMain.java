package com.encapsulation.ridehailingapp;

public class RideHailingMain {

    public static void main(String[] args) {

        Vehicle v1 = new Car(201, "Amit");
        Vehicle v2 = new Bike(202, "Ravi");
        Vehicle v3 = new Auto(203, "Suresh");

        v1.updateLocation("City Center");
        v2.updateLocation("Railway Station");
        v3.updateLocation("Bus Stand");

        calculateRideFare(v1, 10);
        calculateRideFare(v2, 10);
        calculateRideFare(v3, 10);
    }

    // Polymorphic method
    public static void calculateRideFare(Vehicle vehicle, double distance) {
        vehicle.getVehicleDetails();
        System.out.println("Current Location: " + vehicle.getCurrentLocation());
        System.out.println("Distance: " + distance + " km");
        System.out.println("Total Fare: ₹" + vehicle.calculateFare(distance));
        System.out.println("----------------------------------");
    }
}
