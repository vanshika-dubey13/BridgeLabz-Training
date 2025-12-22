//Creating a class to take user input for 5 numbers and check whether a number is positive or negative. Further for positive numbers check if the number is even or odd. Finally compare the first and last elements of the array and display if they are equal, greater, or less

import java.util.Scanner;

public class NumberCheck {

    // Creating a method to check if number is positive
    public static boolean isPositive(int n) {
        return n >= 0;
    }

    // Creating a method to check if number is even
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    // Creating a method to compare two numbers
    public static int compare(int n1, int n2) {
        if (n1 > n2) {
            return 1;
        } else if (n1 == n2) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        // Taking a number array as user input
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            if (isPositive(num)) {
                System.out.print(num + " is Positive and ");
                if (isEven(num)) {
                    System.out.println("Even");
                } else {
                    System.out.println("Odd");
                }
            } else {
                System.out.println(num + " is Negative");
            }
        }

        // Comparing first and last element
        int ans = compare(numbers[0], numbers[numbers.length - 1]);
        if (ans == 1) {
            System.out.println("First element is greater than last element");
        } else if (ans == 0) {
            System.out.println("First and last elements are equal");
        } else {
            System.out.println("First element is less than last element");
        }

        sc.close();
    }
}
