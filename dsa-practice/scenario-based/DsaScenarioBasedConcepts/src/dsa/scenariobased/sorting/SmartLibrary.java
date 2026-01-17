package dsa.scenariobased.sorting;

import java.util.Scanner;

public class SmartLibrary {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of borrowed books: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] books = new String[n];
        // Taking user input for books title
        for (int i = 0; i < n; i++) {
            System.out.print("Enter book title " + (i + 1) + ": ");
            books[i] = sc.nextLine();
        }

        // Insertion Sort (Alphabetical Order)
        for (int i = 1; i < n; i++) {
            String key = books[i];
            int j = i - 1;

            // Shift elements greater than key
            while (j >= 0 && books[j].compareToIgnoreCase(key) > 0) {
                books[j + 1] = books[j];
                j--;
            }
            books[j + 1] = key;
        }

        // Display results
        System.out.println("\nBorrowed Books (Alphabetically Sorted):");
        for (String book : books) {
            System.out.print(book +" ");
        }

        sc.close();
    }
}
