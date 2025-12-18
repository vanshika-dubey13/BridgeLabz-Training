import java.util.Scanner;

public class FactorsWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking number as input form user
        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();

        // Checking if number is positive
        if (num <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.println("Factors of " + number + " are:");

            int i = 1; // counter variable

            while (i <= num) {
                if (num % i == 0) {
                    System.out.println(i);
                }
                i++;         }
        }

        sc.close();
    }
}
