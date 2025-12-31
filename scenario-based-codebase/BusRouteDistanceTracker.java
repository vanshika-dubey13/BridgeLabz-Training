//Creating a class to implement Bus Route Distance Tracker.

import java.util.Scanner;

public class BusRouteDistanceTracker {

	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);
		// Total distance traveled
        	double totalDistance = 0.0;
		//variable to track whether passenger wants to continue trip 
        	boolean continueTrip = true;
	
        	System.out.println("Welcome to the Bus Route Distance Tracker ");

        	while (continueTrip) {
			// Ask user for distance to next stop
            		System.out.print("Enter distance to next stop (in km): ");
            		double distance = sc.nextDouble();
            		totalDistance += distance;

            		// Asking if the passenger wants to get off this stop
            		System.out.print("Do you want to get off at this stop? (yes/no): ");
            		String getOff = sc.next();

            		if (getOff.equalsIgnoreCase("yes")) {
                		System.out.println("You got off the bus.");
                		System.out.println("Total distance traveled: " + totalDistance + " km");
                		continueTrip = false;
            		} else {
                		// Asking if the passenger wants to continue the trip
                		System.out.print("Do you want to continue to the next stop? (yes/no): ");
                		String continueAnswer = sc.next();
                			if (continueAnswer.equalsIgnoreCase("no")) {
                    				System.out.println("Trip ended by passenger.");
                    				System.out.println("Total distance traveled: " + totalDistance + " km");
                    				continueTrip = false;
                			}
            		}
        	}

        	System.out.println("Thank you for using the Bus Route Distance Tracker!");
        	sc.close();
    	}
}
