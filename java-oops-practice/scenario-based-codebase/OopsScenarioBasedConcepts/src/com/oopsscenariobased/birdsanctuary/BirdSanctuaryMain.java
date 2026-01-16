package com.oopsscenariobased.birdsanctuary;

import java.util.Scanner;

public class BirdSanctuaryMain {
    public static void main(String[] args) {

        BirdSanctuary sanctuary = new BirdSanctuary();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nWelcome to EcoWing Bird Sanctuary");
            System.out.println("1. Add Bird");
            System.out.println("2. Display All Birds");
            System.out.println("3. Display Flying Birds");
            System.out.println("4. Display Swimming Birds");
            System.out.println("5. Delete Bird by ID");
            System.out.println("6. Sanctuary Report");
            System.out.println("7. Show Developer Info (Reflection)");
            System.out.println("8. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1 -> {
                    System.out.print("Enter Bird ID: ");
                    String id = sc.next();

                    System.out.print("Enter Bird Name: ");
                    String name = sc.next();

                    System.out.print("Enter Bird Type (Eagle/Duck/Penguin/Kiwi): ");
                    String type = sc.next();

                    switch (type.toLowerCase()) {
                        case "eagle" -> sanctuary.addBird(new Eagle(id, name));
                        case "duck" -> sanctuary.addBird(new Duck(id, name));
                        case "penguin" -> sanctuary.addBird(new Penguin(id, name));
                        case "kiwi" -> sanctuary.addBird(new Kiwi(id, name));
                        default -> {
                            System.out.println("Invalid bird type!");
                            continue;
                        }
                    }

                    System.out.println("Bird added successfully!");
                }

                case 2 -> sanctuary.displayAll();
                case 3 -> sanctuary.displayFlyable();
                case 4 -> sanctuary.displaySwimmable();

                case 5 -> {
                    System.out.print("Enter Bird ID to delete: ");
                    sanctuary.removeById(sc.next());
                    System.out.println("Bird removed if ID existed.");
                }

                case 6 -> sanctuary.sanctuaryReport();
                case 7 -> sanctuary.showDeveloperInfo();
                case 8 -> {
                    System.out.println("Exiting Sanctuary System...");
                    System.exit(0);
                }

                default -> System.out.println("Invalid choice!");
            }
        }
    }
}
