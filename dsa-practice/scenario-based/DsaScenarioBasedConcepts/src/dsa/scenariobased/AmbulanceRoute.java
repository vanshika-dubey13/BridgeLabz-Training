package dsa.scenariobased;

import java.util.*;

public class AmbulanceRoute {

    static Scanner sc = new Scanner(System.in);
    static LinkedList<String> units = new LinkedList<>();
    static int currentIndex = 0;

    public static void main(String[] args) {

        // Initial circular hospital units
        units.add("Emergency");
        units.add("Radiology");
        units.add("Surgery");
        units.add("ICU");

        int choice;
        do {
            System.out.println("\n===== Ambulance Route System =====");
            System.out.println("1. Show Hospital Units");
            System.out.println("2. Redirect Patient");
            System.out.println("3. Rotate to Next Unit");
            System.out.println("4. Remove Unit (Maintenance)");
            System.out.println("5. Add New Unit");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> showUnits();
                case 2 -> redirectPatient();
                case 3 -> rotateUnit();
                case 4 -> removeUnit();
                case 5 -> addUnit();
                case 0 -> System.out.println("System closed.");
                default -> System.out.println("Invalid choice!");
            }

        } while (choice != 0);
    }

    // Display circular linked list
    static void showUnits() {
        if (units.isEmpty()) {
            System.out.println("No hospital units available.");
            return;
        }

        System.out.println("Hospital Units (Circular):");
        for (int i = 0; i < units.size(); i++) {
            if (i == currentIndex)
                System.out.println("-> " + units.get(i) + " (Current)");
            else
                System.out.println("   " + units.get(i));
        }
    }

    // Simulate patient redirection
    static void redirectPatient() {
        if (units.isEmpty()) {
            System.out.println("No units available for emergency!");
            return;
        }

        System.out.print("Enter available unit name: ");
        String availableUnit = sc.nextLine();

        int start = currentIndex;
        boolean found = false;

        do {
            if (units.get(currentIndex).equalsIgnoreCase(availableUnit)) {
                System.out.println("Patient redirected to: " + units.get(currentIndex));
                found = true;
                break;
            }
            currentIndex = (currentIndex + 1) % units.size();
        } while (currentIndex != start);

        if (!found) {
            System.out.println("No available unit found. Patient keeps circulating!");
        }
    }

    // Rotate ambulance to next unit
    static void rotateUnit() {
        if (units.isEmpty()) {
            System.out.println("No units to rotate.");
            return;
        }

        currentIndex = (currentIndex + 1) % units.size();
        System.out.println("Ambulance moved to: " + units.get(currentIndex));
    }

    // Remove unit under maintenance
    static void removeUnit() {
        if (units.isEmpty()) {
            System.out.println("No units to remove.");
            return;
        }

        System.out.print("Enter unit to remove: ");
        String unit = sc.nextLine();

        if (units.remove(unit)) {
            currentIndex = currentIndex % units.size();
            System.out.println(unit + " removed (Under Maintenance).");
        } else {
            System.out.println("Unit not found.");
        }
    }

    // Add new hospital unit
    static void addUnit() {
        System.out.print("Enter new unit name: ");
        String unit = sc.nextLine();
        units.add(unit);
        System.out.println(unit + " added to hospital route.");
    }
}
