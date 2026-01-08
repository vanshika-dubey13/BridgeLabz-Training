package com.oopsscenariobased.travelitineraryplanner;

import java.util.Scanner;

//Main Class
public class TourMateMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("===== TourMate Travel Planner =====");
		System.out.println("1. Domestic Trip");
		System.out.println("2. International Trip");
		System.out.print("Choose trip type: ");
		int choice = sc.nextInt();

		System.out.print("Enter destination: ");
		String destination = sc.next();

		System.out.print("Enter duration (days): ");
		int duration = sc.nextInt();

		System.out.print("Enter transport cost: ");
		double tCost = sc.nextDouble();
		
		System.out.print("Enter hotel cost: ");
		double hCost = sc.nextDouble();

		System.out.print("Enter activity cost: ");
		double aCost = sc.nextDouble();

		Transport transport = new Transport(tCost);
		Hotel hotel = new Hotel(hCost);
		Activity activity = new Activity(aCost);

		Trip trip = null;

		// Switch Case for Trip Type
		switch (choice) {
			case 1:
				trip = new DomesticTrip(destination, duration, transport, hotel, activity);
				break;
			case 2:
				trip = new InternationalTrip(destination, duration, transport, hotel, activity);
				break;
			default:
				System.out.println("Invalid choice!");
				System.exit(0);
		}

		trip.book();
		System.out.println("Total Budget: Rs. " + trip.totalBudget());

		sc.close();
	}
}
