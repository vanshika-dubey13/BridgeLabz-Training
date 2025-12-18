import java.util.Scanner;

//Creating a class to find factors of a number

public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking number as user input
        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();

        // Checking if number is positive
        if (num <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.println("Factors of " + number + " are:");

            // Loop to find factors
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    System.out.println(i);
                }
            }
        }

        sc.close();
    }
}
