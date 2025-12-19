//Creating a class to to print a multiplication table of a number.

import java.util.Scanner;
public class Table {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Creating an Array to store multiplication results
        int[] table = new int[10];
        // Storing the  results in array
        for (int i = 1; i <= table.length; i++) {
            table[i - 1] = num * i;
        }

        // Displayig the multiplication table
        System.out.println("Multiplication Table of " + num + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + table[i - 1]);
        }

        sc.close();
    }
}
