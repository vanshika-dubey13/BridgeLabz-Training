import java.util.Scanner;

public class MaximumOfThree {

    // Method to take three integers as input
    public static int[] getThreeNumbers() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        return new int[] { num1, num2, num3 };
    }

    // Method to find the maximum of three integers
    public static int findMaximumOfThree(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static void main(String[] args) {
        int[] numbers = getThreeNumbers();
        int maximum = findMaximum(numbers[0], numbers[1], numbers[2]);

        System.out.println("The maximum number is: " + maximum);
    }
}
