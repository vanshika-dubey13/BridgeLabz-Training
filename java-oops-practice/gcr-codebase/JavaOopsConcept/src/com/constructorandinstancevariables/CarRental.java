package com.constructorandinstancevariables;

public class CarRental {
    // Attributes
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double totalCost;

    // Cost per day for different car models 
    private static final double carOnePrice = 500.0;
    private static final double carTwoPrice = 800.0;
    private static final double carThreePrice = 400.0;

    // Constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.totalCost = calculateTotalCost();
    }

    // Method to calculate total cost based on car model and rental days
    private double calculateTotalCost() {
        double costPerDay = 0.0;
        switch (carModel.toLowerCase()) {
            case "sedan":
                costPerDay = carOnePrice;
                break;
            case "suv":
                costPerDay = carOnePrice;
                break;
            case "hatchback":
                costPerDay = carThreePrice;
                break;
            default:
                System.out.println("Unknown car model. Using default cost $50/day.");
                costPerDay = 50;
        }
        return costPerDay * rentalDays;
    }

    // Method to display rental details
    public void displayRentalDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: $" + totalCost);
    }

    // Main method to test the class
    public static void main(String[] args) {
        CarRental rental1 = new CarRental("Alice", "SUV", 3);
        rental1.displayRentalDetails();

        System.out.println();

        CarRental rental2 = new CarRental("Bob", "Sedan", 5);
        rental2.displayRentalDetails();
    }
}
