//Creating a program to check if number is prime or not.

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input number
        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();

        boolean isPrime = true;
        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
		// divisible by another number
                    isPrime = false; 
                    break;         
                }
            }
        }

        // Displaying result
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        sc.close();
    }
}
