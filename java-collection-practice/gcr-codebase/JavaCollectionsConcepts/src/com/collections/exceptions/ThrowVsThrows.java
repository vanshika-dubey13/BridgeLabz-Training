package com.collections.exceptions;

public class ThrowVsThrows {

	//method to calculate interest
    public static double calculateInterest(double amount, double rate, int years)
            throws IllegalArgumentException {

        if (amount < 0 || rate < 0) {
            //explicitly throwing exception
            throw new IllegalArgumentException();
        }
        return (amount * rate * years) / 100;
    }

    //main method
    public static void main(String[] args) {
        try {
            double interest = calculateInterest(5000, 5, 2);
            System.out.println("Calculated Interest: " + interest);

        }
        catch (IllegalArgumentException e) {
            System.out.println("Invalid input: Amount and rate must be positive");
        }
    }
}
