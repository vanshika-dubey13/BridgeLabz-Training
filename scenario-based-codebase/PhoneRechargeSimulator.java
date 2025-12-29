//Creating a class to create a phone recharge simulator

import java.util.Scanner;

public class PhoneRechargeSimulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = 0;
        char choice;

        // displaying menu
        do {
            System.out.println("\n--- Phone Recharge Simulator ---");
            System.out.println("Select Mobile Operator:");
            System.out.println("1. Jio");
            System.out.println("2. Airtel");
            System.out.println("3. VI");
            System.out.println("4. BSNL");
            System.out.print("Enter choice (1-4): ");
            int operator = sc.nextInt();

            // asking for balance ammount from user
            System.out.print("Enter recharge amount: Rs ");
            double amount = sc.nextDouble();

            balance += amount;

            System.out.println("\nRecharge Successful!");
            System.out.println("Operator Offers:");

            switch (operator) {
                case 1:
                    System.out.println("Jio Offer: 1.5GB/day + Unlimited Calls");
                    break;
                case 2:
                    System.out.println("Airtel Offer: 2GB/day + Free Hello Tunes");
                    break;
                case 3:
                    System.out.println("VI Offer: 1GB/day + Weekend Data Rollover");
                    break;
                case 4:
                    System.out.println("BSNL Offer: 1GB/day + 100 SMS/day");
                    break;
                default:
                    System.out.println("Invalid Operator Selected!");
            }

            System.out.println("Current Balance: Rs " + balance);

            System.out.print("\nDo you want to recharge again? (y/n): ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("\nThank you for using Phone Recharge Simulator!");
        sc.close();
    }
}
