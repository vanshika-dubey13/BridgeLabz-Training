package com.constructorandinstancevariables;

public class VehicleMain {
	 public static void main(String[] args) {

	        Vehicle v1 = new Vehicle("Alina", "Car");
	        Vehicle v2 = new Vehicle("David", "Motorcycle");

	        v1.displayVehicleDetails();
	        System.out.println();

	        // Update registration fee
	        Vehicle.updateRegistrationFee(6000.0);

	        v2.displayVehicleDetails();
	    }
}
