//Creating a program to calculate power of a number.

import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking Input as number and power
        System.out.print("Enter a positive integer (base number): ");
        int num = sc.nextInt();
        System.out.print("Enter a positive integer (power): ");
        int power = sc.nextInt();

        // Checking validity
        if (num <= 0 || power < 0) {
            System.out.println("Please enter positive integers for number and power.");
        } else {
            int result = 1; // initial value

            // Looping to calculate power
            for (int i = 1; i <= power; i++) {
                result = result * num;
            }

            // Displaying result
            System.out.println(num + " raised to the power " + power + " is: " + result);
        }

        sc.close();
    }
}
