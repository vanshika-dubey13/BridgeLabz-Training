package com.oopsscenariobased.loanapprovalautomation;

import java.util.Scanner;

//Main Class
public class LoanBuddyMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("--- Welcome to loan automation system --- ");
		System.out.print("Enter Name: ");
		String name = sc.nextLine();

		System.out.print("Credit Score: ");
		int creditScore = sc.nextInt();

		System.out.print("Monthly Income: ");
		double income = sc.nextDouble();

		System.out.print("Loan Amount: ");
		double loanAmount = sc.nextDouble();

		Applicant applicant = new Applicant(name, creditScore, income, loanAmount);

		//displaying types of loan menu
		System.out.println("\nSelect Loan Type:");
		System.out.println("1. Personal Loan");
		System.out.println("2. Home Loan");
		System.out.println("3. Auto Loan");

		int choice = sc.nextInt();

		System.out.print("Loan Term (months): ");
		int term = sc.nextInt();

		LoanApplication loan = null;

		switch (choice) {
		case 1:
			loan = new PersonalLoan(applicant, term);
			break;
		case 2:
			loan = new HomeLoan(applicant, term);
			break;
		case 3:
			loan = new AutoLoan(applicant, term);
			break;
		default:
			System.out.println("Invalid choice!");
			System.exit(0);
		}

		if (loan.approveLoan()) {
			System.out.println("\n Loan Approved!");
			System.out.printf("Monthly EMI: %.2f\n", loan.calculateEMI());
		}
		else {
			System.out.println("\n Loan Rejected due to eligibility criteria.");
		}

		sc.close();
	}
}
