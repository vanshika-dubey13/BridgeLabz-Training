import java.util.Scanner;

public class BasicCalculator {

    // Function to add two numbers
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    // Function to subtract two numbers
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // Function to multiply two numbers
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // Function to divide two numbers
    public static double divide(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Error! Division by zero is not allowed.");
	    return -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Printing a welcome message and prompt user for operation choice
        System.out.println("Welcome to the Basic Calculator!");
        System.out.println("Select an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        // Get user's operation choice
        int choice = sc.nextInt();

        // Asking the user for two numbers
        System.out.print("Enter the first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble();

        double result = 0;

        // Perform the chosen operation
        switch (choice) {
            case 1:
                result = add(num1, num2);
                System.out.println("The result of addition is: " + result);
                break;
            case 2:
                result = subtract(num1, num2);
                System.out.println("The result of subtraction is: " + result);
                break;
            case 3:
                result = multiply(num1, num2);
                System.out.println("The result of multiplication is: " + result);
                break;
            case 4:
                result = divide(num1, num2);
                if (!Double.isNaN(result)) {
                    System.out.println("The result of division is: " + result);
                }
                break;
            default:
                System.out.println("Invalid choice! Please select a valid operation.");
        }

        sc.close();
    }
}
