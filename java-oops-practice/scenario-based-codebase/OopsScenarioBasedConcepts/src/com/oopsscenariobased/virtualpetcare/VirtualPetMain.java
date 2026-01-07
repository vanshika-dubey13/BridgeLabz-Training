package com.oopsscenariobased.virtualpetcare;

import java.util.Scanner;

//main class
public class VirtualPetMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pet pet = null;

        //displaying menu
        System.out.println("--- Welcome to PetPal ---");
        System.out.println("Choose a pet:");
        System.out.println("1. Dog\n2. Cat\n3. Bird");

        //asking pet choice from user
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter pet name: ");
        String name = sc.nextLine();
        System.out.print("Enter pet age: ");
        int age = sc.nextInt();

        switch (choice) {
            case 1:
                pet = new Dog(name, age);
                break;
            case 2:
                pet = new Cat(name, age);
                break;
            case 3:
                pet = new Bird(name, age);
                break;
            default:
                System.out.println("Invalid choice!");
                System.exit(0);
        }

        int menu;
        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Feed");
            System.out.println("2. Play");
            System.out.println("3. Sleep");
            System.out.println("4. Make Sound");
            System.out.println("5. Show Status");
            System.out.println("6. Exit");

            menu = sc.nextInt();

            switch (menu) {
                case 1:
                    pet.feed();
                    break;
                case 2:
                    pet.play();
                    break;
                case 3:
                    pet.sleep();
                    break;
                case 4:
                    pet.makeSound();
                    break;
                case 5:
                    pet.showStatus();
                    break;
                case 6:
                    System.out.println("Goodbye! 👋");
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        } while (menu != 6);

        sc.close();
    }
}
