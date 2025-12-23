import java.util.Scanner;

public class NumberChecker5 {

    // Method to calculate sum of proper divisors
    public static int sumOfDivisors(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    // Method to check perfect number
    public static boolean isPerfect(int n) {
        return sumOfDivisors(n) == n;
    }

    // Method to check abundant number
    public static boolean isAbundant(int n) {
        return sumOfDivisors(n) > n;
    }

    // Method to check deficient number
    public static boolean isDeficient(int n) {
        return sumOfDivisors(n) < n;
    }

    // Method to calculate factorial
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Method to check strong number
    public static boolean isStrong(int n) {
        int temp = n;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }

        return sum == n;
    }

    // Main method to test the utility
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = scanner.nextInt();

        System.out.println("Number: " + n);
        System.out.println("Perfect Number? " + isPerfect(n));
        System.out.println("Abundant Number? " + isAbundant(n));
        System.out.println("Deficient Number? " + isDeficient(n));
        System.out.println("Strong Number? " + isStrong(n));

        scanner.close();
    }
}
