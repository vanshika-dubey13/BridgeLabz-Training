package com.constructorandinstancevariables;

class Vehicle {

    // Instance variables
    String ownerName;
    String vehicleType;

    // Class variable (same for all vehicles)
    static double registrationFee = 5000.0;

    // Constructor
    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method
    void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: Rs" + registrationFee);
    }

    // Class method
    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    // Main method to test the class
   
}
