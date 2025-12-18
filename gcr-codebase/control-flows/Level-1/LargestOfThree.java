//Creating a class to find largest of 3 numbers

import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input three numbers
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = sc.nextInt();

        // Checking  which number is the largest
        boolean isFirstLargest = (num1 >= num2) && (num1 >= num3);
        boolean isSecondLargest = (num2 >= number1) && (num2 >= num3);
        boolean isThirdLargest = (num3 >= num1) && (num3 >= num2);

        // Output results
        System.out.println("Is the first number the largest? " + isFirstLargest);
        System.out.println("Is the second number the largest? " + isSecondLargest);
        System.out.println("Is the third number the largest? " + isThirdLargest);

        sc.close();
    }
}
