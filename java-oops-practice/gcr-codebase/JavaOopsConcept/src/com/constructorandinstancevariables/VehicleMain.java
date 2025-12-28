package com.constructorandinstancevariables;

public class VehicleMain {
    public static void main(String[] args) {

        Vehicle v1 = new Vehicle("Rohit", "Car");
        Vehicle v2 = new Vehicle("Sneha", "Bike");

        // Display details before updating fee
        v1.displayVehicleDetails();
        System.out.println();
        v2.displayVehicleDetails();

        // Update registration fee (class method)
        Vehicle.updateRegistrationFee(6000.0);

        System.out.println("\nAfter updating registration fee:\n");

        // Fee updated for all vehicles
        v1.displayVehicleDetails();
        System.out.println();
        v2.displayVehicleDetails();
    }
}
