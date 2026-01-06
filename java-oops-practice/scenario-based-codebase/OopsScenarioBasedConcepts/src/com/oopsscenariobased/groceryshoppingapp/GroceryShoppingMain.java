package com.oopsscenariobased.groceryshoppingapp;
import java.util.*;

public class GroceryShoppingMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Cart cart = new Cart();

        int choice;

        do {
            System.out.println("\n=== SwiftCart Menu ===");
            System.out.println("1. Add Perishable Product");
            System.out.println("2. Add Non-Perishable Product");
            System.out.println("3. View Bill");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    Product milk = new PerishableProduct("Milk", 50);
                    System.out.print("Enter quantity: ");
                    int q1 = sc.nextInt();
                    cart.addProduct(milk, q1);
                    System.out.println("Perishable product added.");
                    break;

                case 2:
                    Product rice = new NonPerishableProduct("Rice", 100);
                    System.out.print("Enter quantity: ");
                    int q2 = sc.nextInt();
                    cart.addProduct(rice, q2);
                    System.out.println("Non-Perishable product added.");
                    break;

                case 3:
                    cart.generateBill();
                    break;

                case 4:
                    System.out.println("Thank you for shopping with SwiftCart!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 4);

        sc.close();
    }
}
