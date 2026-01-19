package com.oopsscenariobased.bagnballorganizer;

import java.util.*;

public class BagBallOrganizerMain{
    private static Map<String, Bag> bags = new HashMap<>();
    private static Scanner sc = new Scanner(System.in);

    //main method
    public static void main(String[] args) {
        int choice;

        //displaying menu
        do {
            System.out.println("\n--- Bag-n-Ball Organizer ---");
            System.out.println("1. Add Bag");
            System.out.println("2. Add Ball to Bag");
            System.out.println("3. Remove Ball from Bag");
            System.out.println("4. Display Balls in a Bag");
            System.out.println("5. Display All Bags");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1 -> addBag();
                case 2 -> addBallToBag();
                case 3 -> removeBallFromBag();
                case 4 -> displayBallsInBag();
                case 5 -> displayAllBags();
                case 0 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice!");
            }
        } while (choice != 0);
    }

    private static void addBag() {
        System.out.print("Enter Bag ID: ");
        String id = sc.nextLine();
        System.out.print("Enter Bag Color: ");
        String color = sc.nextLine();
        System.out.print("Enter Bag Capacity: ");
        int capacity = sc.nextInt();

        bags.put(id, new Bag(id, color, capacity));
        System.out.println("Bag added successfully.");
    }

    private static void addBallToBag() {
        System.out.print("Enter Bag ID: ");
        String bagId = sc.nextLine();
        Bag bag = bags.get(bagId);

        if (bag == null) {
            System.out.println("Bag not found.");
            return;
        }

        System.out.print("Enter Ball ID: ");
        String ballId = sc.nextLine();
        System.out.print("Enter Ball Color: ");
        String color = sc.nextLine();
        System.out.print("Enter Ball Size (small/medium/large): ");
        String size = sc.nextLine();

        Ball ball = new Ball(ballId, color, size);
        if (bag.addBall(ball)) {
            System.out.println("Ball added to bag.");
        } else {
            System.out.println("Bag is full! Cannot add ball.");
        }
    }

    private static void removeBallFromBag() {
        System.out.print("Enter Bag ID: ");
        String bagId = sc.nextLine();
        Bag bag = bags.get(bagId);

        if (bag == null) {
            System.out.println("Bag not found.");
            return;
        }

        System.out.print("Enter Ball ID to remove: ");
        String ballId = sc.nextLine();

        if (bag.removeBall(ballId)) {
            System.out.println("Ball removed.");
        } else {
            System.out.println("Ball not found.");
        }
    }

    private static void displayBallsInBag() {
        System.out.print("Enter Bag ID: ");
        String bagId = sc.nextLine();
        Bag bag = bags.get(bagId);

        if (bag == null) {
            System.out.println("Bag not found.");
            return;
        }

        bag.displayBalls();
    }

    private static void displayAllBags() {
        if (bags.isEmpty()) {
            System.out.println("No bags available.");
            return;
        }

        for (Bag bag : bags.values()) {
            System.out.println(bag);
        }
    }
}
