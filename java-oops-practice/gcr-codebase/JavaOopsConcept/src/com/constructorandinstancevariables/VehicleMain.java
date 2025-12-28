package com.constructorandinstancevariables;

public class VehicleMain {
    public static void main(String[] args) {

        Vehicle v1 = new Vehicle("Amar", "Car");
        Vehicle v2 = new Vehicle("Rashmi", "Bike");

        // Displaying details before updating fee
        v1.displayVehicleDetails();
        System.out.println();
        v2.displayVehicleDetails();

        // Updating registration fee (class method)
        Vehicle.updateRegistrationFee(6000.0);

        System.out.println("\nAfter updating registration fee:\n");

        // Displaying updated for all vehicles
        v1.displayVehicleDetails();
        System.out.println();
        v2.displayVehicleDetails();
    }
}
