package dsa.scenariobased;

import java.util.*;

//creating a class to simulate train companion - compartment navigation
public class TrainCompanion {

    static Scanner sc = new Scanner(System.in);
    //storing list of compartments
    static LinkedList<String> compartments = new LinkedList<>();
    static int currentIndex = 0;

    public static void main(String[] args) {

        int choice;
        //displaying menu
        do {
            System.out.println("\n===== TrainCompanion Menu =====");
            System.out.println("1. Add Compartment");
            System.out.println("2. Remove Compartment");
            System.out.println("3. Move Forward");
            System.out.println("4. Move Backward");
            System.out.println("5. Show Current Compartment");
            System.out.println("6. Show Adjacent Compartments");
            System.out.println("7. Show All Compartments");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> addCompartment();
                case 2 -> removeCompartment();
                case 3 -> moveForward();
                case 4 -> moveBackward();
                case 5 -> showCurrent();
                case 6 -> showAdjacent();
                case 7 -> showAll();
                case 0 -> System.out.println("Journey ended.");
                default -> System.out.println("Invalid choice!");
            }

        } while (choice != 0);
    }

    //method to insert a compartment
    public static void addCompartment() {
        System.out.print("Enter compartment/service name: ");
        String name = sc.nextLine();
        compartments.add(name);
        System.out.println(name + " compartment is added.");
    }

    //method to remove a compartment
    public static void removeCompartment() {
        if (compartments.isEmpty()) {
            System.out.println("No compartments to remove.");
            return;
        }

        System.out.print("Enter compartment name to remove: ");
        String name = sc.nextLine();

        if (compartments.remove(name)) {
            currentIndex = Math.max(0, Math.min(currentIndex, compartments.size() - 1));
            System.out.println(name + " removed.");
        } else {
            System.out.println("Compartment not found.");
        }
    }

    //method to traverse the compartments in forward direction
    public static void moveForward() {
        if (currentIndex < compartments.size() - 1) {
            currentIndex++;
            System.out.println("Moved to: " + compartments.get(currentIndex));
        } else {
            System.out.println("Already at last compartment.");
        }
    }

    //method to traverse the compartments in backward direction
    public static void moveBackward() {
        if (currentIndex > 0) {
            currentIndex--;
            System.out.println("Moved to: " + compartments.get(currentIndex));
        } else {
            System.out.println("Already at first compartment.");
        }
    }

    //method to show current compartment
    public static void showCurrent() {
        if (compartments.isEmpty()) {
            System.out.println("No compartments available.");
        } else {
            System.out.println("Current Compartment: " + compartments.get(currentIndex));
        }
    }

    //method to display adjacent compartments
    public static void showAdjacent() {
        if (compartments.isEmpty()) {
            System.out.println("No compartments available.");
            return;
        }

        System.out.println("Adjacent Compartments:");

        if (currentIndex > 0)
            System.out.println("Previous: " + compartments.get(currentIndex - 1));
        else
            System.out.println("Previous: None");

        System.out.println("Current: " + compartments.get(currentIndex));

        if (currentIndex < compartments.size() - 1)
            System.out.println("Next: " + compartments.get(currentIndex + 1));
        else
            System.out.println("Next: None");
    }

    //method to display all compartments
    public static void showAll() {
        if (compartments.isEmpty()) {
            System.out.println("No compartments added.");
            return;
        }

        System.out.println("Train Compartments:");
        for (int i = 0; i < compartments.size(); i++) {
            if (i == currentIndex)
                System.out.println("-> " + compartments.get(i) + " (Current)");
            else
                System.out.println("   " + compartments.get(i));
        }
    }
}
