//creating a class to implement Parking Lot Gate System.

import java.util.Scanner;

public class ParkingLotGateSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Total parking slots
        int parkingCapacity = 5;
        // Currently parked cars
        int occupied = 0;
        // tracks prg running status(whether user wants to terminate the prg)
        boolean running = true;

        while (running && occupied < parkingCapacity) {
            System.out.println("\n-----------------------");
            System.out.println("\n--- Parking Lot Menu ---");
            System.out.println("1. Park Car");
            System.out.println("2. Exit Car");
            System.out.println("3. Show Occupancy");
            System.out.println("4. Exit System");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                // when user wants to prak the car
                case 1:
                    if (occupied < parkingCapacity) {
                        occupied++;
                        System.out.println("\nCar parked successfully.");
                    } else {
                        System.out.println("\nParking Lot is Full!");
                    }
                    break;

                // when user wants to exit their car from parking lot
                case 2:
                    if (occupied > 0) {
                        occupied--;
                        System.out.println("\nCar exited successfully.");
                    } else {
                        System.out.println("\nParking Lot is Empty!");
                    }
                    break;

                // when user wants to see parking lot availability status
                case 3:
                    System.out.println("\nOccupied Slots: " + occupied);
                    System.out.println(" \nAvailable Slots: " + (parkingCapacity - occupied));
                    break;

                // when user wants to terminate the prg
                case 4:
                    running = false;
                    System.out.println("\nExiting Parking System...");
                    break;

                default:
                    System.out.println("\nInvalid choice. Try again.");
            }
        }

        // if parking lot is already full, user is not allowed to park their car
        if (occupied == parkingCapacity) {
            System.out.println("\n Parking Lot is FULL. No more cars allowed.");
        }

        sc.close();
    }
}
