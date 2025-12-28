package com.constructorandinstancevariables;

public class Vehicle {

    // creating Instance variables
    private String ownerName;
    private String vehicleType;

    // creating Class variable (shared by all vehicles)
    private static double registrationFee = 5000.0;

    // parametrized constructor
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // creating Instance method
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
    }

    // Class method to update the registration fee
    public static void updateRegistrationFee(double newFee) {
        if (newFee > 0) {
            registrationFee = newFee;
        }
    }
}
