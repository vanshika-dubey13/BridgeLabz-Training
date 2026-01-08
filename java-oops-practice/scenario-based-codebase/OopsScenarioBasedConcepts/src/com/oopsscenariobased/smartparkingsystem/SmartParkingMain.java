package com.oopsscenariobased.smartparkingsystem;

import java.util.Scanner;

public class SmartParkingMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ParkingSlot slot = new ParkingSlot(101, "Car");

        while (true) {
        	//displaying menu
            System.out.println("""
                    
                    ===== ParkEase Menu =====
                    1. Park Vehicle
                    2. Calculate Charges
                    3. Check Slot Availability
                    4. Exit
                    Enter your choice:
                    """);

            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    if (slot.isAvailable()) {
                        slot.occupySlot();
                        System.out.println("Vehicle parked in Slot " + slot.getSlotId());
                    } else {
                        System.out.println("Slot already occupied!");
                    }
                }

                case 2 -> {
                    System.out.println("Enter vehicle type (Car/Bike/Truck): ");
                    String type = sc.next();
                    System.out.println("Enter parking hours: ");
                    int hours = sc.nextInt();

                    Vehicle vehicle = switch (type.toLowerCase()) {
                        case "car" -> new Car("C-123");
                        case "bike" -> new Bike("B-456");
                        case "truck" -> new Truck("T-789");
                        default -> null;
                    };

                    if (vehicle != null) {
                        System.out.println("Total Charges: Rs. " + vehicle.calculateCharges(hours));
                    } else {
                        System.out.println("Invalid vehicle type!");
                    }
                }

                case 3 -> {
                    System.out.println(
                            slot.isAvailable()
                                    ? "Slot is Available"
                                    : "Slot is Occupied"
                    );
                }

                case 4 -> {
                    System.out.println("Exiting ParkEase. Thank you!");
                    sc.close();
                    return;
                }

                default -> System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
