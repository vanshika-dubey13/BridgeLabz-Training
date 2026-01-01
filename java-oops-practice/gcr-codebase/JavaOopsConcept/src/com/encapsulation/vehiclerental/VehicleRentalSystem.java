package com.encapsulation.vehiclerental;

import java.util.ArrayList;

//main method
public class VehicleRentalSystem {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("C101", 100, "CAR12345"));
        vehicles.add(new Bike("B201", 50, "BIKE54321"));
        vehicles.add(new Truck("T301", 200, "TRUCK98765"));

        int rentalDays = 5;

        //displaying result
        for (Vehicle v : vehicles) {
            System.out.println("Vehicle Number: " + v.getVehicleNumber());
            System.out.println("Type: " + v.getType());
            System.out.println("Rental Cost for " + rentalDays + " days: " + v.calculateRentalCost(rentalDays));

            if (v instanceof Insurable insurableVehicle) { // Pattern matching in Java 16+
                System.out.println("Insurance Cost: " + insurableVehicle.calculateInsurance());
                System.out.println(insurableVehicle.getInsuranceDetails());
            }

            System.out.println("----------------------------");
        }
    }
}
