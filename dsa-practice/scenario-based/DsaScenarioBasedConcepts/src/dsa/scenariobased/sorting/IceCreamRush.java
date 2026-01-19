package dsa.scenariobased.sorting;

import java.util.Scanner;

public class IceCreamRush {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of sales done : ");
        int size = sc.nextInt(); 
        String[] flavors = new String[size];
        int[] sales = new int[size];
        // Taking user input
        System.out.println("Enter ice cream flavors and their weekly sales:");

        for (int i = 0; i < size; i++) {
            System.out.print("Flavor " + (i + 1) + " name: ");
            flavors[i] = sc.next();
            sc.nextLine();
            System.out.print("\nSales for " + flavors[i] + ": ");
            sales[i] = sc.nextInt();
            sc.nextLine(); 
        }

        // Bubble Sort for descending order by sales
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (sales[j] < sales[j + 1]) {
                    int tempSales = sales[j];
                    sales[j] = sales[j + 1];
                    sales[j + 1] = tempSales;
                    String tempFlavor = flavors[j];
                    flavors[j] = flavors[j + 1];
                    flavors[j + 1] = tempFlavor;
                }
            }
        }

        // Displaying results
        System.out.println("\nFlavors sorted by popularity:");
        for (int i = 0; i < size; i++) {
            System.out.println(flavors[i] + " : " + sales[i] + " sales");
        }

        sc.close();
    }
}

