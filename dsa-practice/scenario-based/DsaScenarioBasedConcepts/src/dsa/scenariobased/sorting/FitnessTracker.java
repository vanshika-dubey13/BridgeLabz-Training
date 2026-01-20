package dsa.scenariobased.sorting;

import java.util.Scanner;

public class FitnessTracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of person : ");
        int size = sc.nextInt(); 
        String[] personName = new String[size];
        int[] steps = new int[size];
        // Taking user input
        System.out.println("Enter person name and their step count :");
        for (int i = 0; i < size; i++) {
            System.out.print("Person " + (i + 1) + " name: ");
            personName[i] = sc.next();
            sc.nextLine();
            System.out.print("\nStep count for " +(i+1)  + ": ");
            steps[i] = sc.nextInt();
            sc.nextLine(); 
        }

        // Bubble Sort for descending order
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (steps[j] < steps[j + 1]) {
                    int tempSales = steps[j];
                    steps[j] = steps[j + 1];
                    steps[j + 1] = tempSales;
                    String tempFlavor = personName[j];
                    personName[j] = personName[j + 1];
                    personName[j + 1] = tempFlavor;
                }
            }
        }

        // Displaying results
        System.out.println("\nPerson sorted by number of steps:");
        for (int i = 0; i < size; i++) {
            System.out.println(personName[i] + " : " + steps[i] + " steps");
        }

        sc.close();
    }
}

