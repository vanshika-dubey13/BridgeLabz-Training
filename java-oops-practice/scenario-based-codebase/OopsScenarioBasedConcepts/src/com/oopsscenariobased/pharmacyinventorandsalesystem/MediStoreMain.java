package com.oopsscenariobased.pharmacyinventorandsalesystem;

import java.time.LocalDate;
import java.util.Scanner;


public class MediStoreMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Medicine med = new Tablet(
                "Paracetamol",
                50,
                LocalDate.of(2026, 5, 20)
        );

        int choice;
        do {
            System.out.println("\n--- MediStore Menu ---");
            System.out.println("1. Sell Medicine");
            System.out.println("2. Check Expiry");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter quantity to sell: ");
                    int qty = sc.nextInt();
                    med.sell(qty);
                    break;

                case 2:
                    med.checkExpiry();
                    break;

                case 3:
                    System.out.println("Thank you for using MediStore!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 3);

        sc.close();
    }
}
