//Creating a class to create Calculator.

import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        System.out.print("Enter operator (+, -, *, /): ");
        String operation = sc.next();
        System.out.print("Enter number of times to run loop: ");
        int num = sc.nextInt();

        for (int i = 1; i < num; i++) {
            switch (operation) {
                case "+":
                    System.out.println("Result: " + (num1 + num2));
                    break;
                case "-":
                    System.out.println("Result: " + (num1 - num2));
                    break;
                case "*":
                    System.out.println("Result: " + (num1 * num2));
                    break;
                case "/":
                    if (num2 != 0) {
                        System.out.println("Result: " + (num1 / num2));
                    } else {
                        System.out.println("Error: Division by zero!");
                    }
                    break;
                default:
                    System.out.println("Invalid Operator");
            }
        }

        sc.close();
    }
}
