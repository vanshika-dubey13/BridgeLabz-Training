package com.oopsscenariobased.PayXpress;

import java.util.Scanner;

//Main class
public class PayXpressMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//displaying menu
		System.out.println("=== PayXpress Utility Bill Payment System ===");
		System.out.println("1. Electricity\n2. Internet\n3. Water");
		System.out.print("Select bill type: ");
		int choice = sc.nextInt();

		System.out.print("Enter bill amount: ");
		double amount = sc.nextDouble();

		System.out.print("Enter due date (DD/MM/YYYY): ");
		sc.nextLine();
		String dueDate = sc.nextLine();

		Bill bill = null;

		// Runtime Polymorphism
		switch (choice) {
			case 1:
				bill = new ElectricityBill(amount, dueDate);
				break;
			case 2:
				bill = new InternetBill(amount, dueDate);
				break;
			case 3:
				bill = new WaterBill(amount, dueDate);
				break;
			default:
				System.out.println("Invalid choice!");
				System.exit(0);
		}

		bill.sendReminder();
		
		System.out.print("Enter days late (0 if on time): ");
		int daysLate = sc.nextInt();

		if (daysLate > 0) {
			double total = bill.calculateLateFee(daysLate);
			System.out.println("Total amount with late fee: Rs. " + total);
		}

		System.out.print("Do you want to pay now? (yes/no): ");
		sc.nextLine();
		String payChoice = sc.nextLine();

		if (payChoice.equalsIgnoreCase("yes")) {
			bill.pay();
		}

		sc.close();
	}
}
