package com.oopsscenariobased.restaurantorderingsystem;

import java.util.Scanner;

public class FoodLoopMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        VegItem v1 = new VegItem("Paneer Burger", 150);
        VegItem v2 = new VegItem("Veg Pizza", 250);
        NonVegItem n1 = new NonVegItem("Chicken Burger", 200);
        NonVegItem n2 = new NonVegItem("Chicken Pizza", 350);

        Order order = new Order();

        int choice;
        do {
        	
        	//displaying menu
            System.out.println("\n==== FOODLOOP MENU ====");
            System.out.println("1. Display Menu");
            System.out.println("2. Add Item to Order");
            System.out.println("3. Place Order");
            System.out.println("4. Cancel Order");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    v1.display();
                    v2.display();
                    n1.display();
                    n2.display();
                    break;

                case 2:
                    System.out.println("1. Paneer Burger");
                    System.out.println("2. Veg Pizza");
                    System.out.println("3. Chicken Burger");
                    System.out.println("4. Chicken Pizza");
                    System.out.print("Select item: ");
                    int itemChoice = sc.nextInt();

                    switch (itemChoice) {
                        case 1: order.addItem(v1); break;
                        case 2: order.addItem(v2); break;
                        case 3: order.addItem(n1); break;
                        case 4: order.addItem(n2); break;
                        default: System.out.println("Invalid item!");
                    }
                    break;

                case 3:
                    order.placeOrder();
                    break;

                case 4:
                    order.cancelOrder();
                    break;

                case 5:
                    System.out.println("Thank you for using FoodLoop!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 5);

        sc.close();
    }
}
