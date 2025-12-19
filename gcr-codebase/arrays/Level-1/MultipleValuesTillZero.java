//Creating a class to take user input for the age of all 10 students in a class and check ingwhether the student can vote depending on his/her age is greater or equal to 18.

import java.util.Scanner;

public class MultipleValuesTillZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Creating array and variables
        double[] values = new double[10];
        double total = 0.0;
        int index = 0;
        while (true) {
            System.out.print("Enter a number : ");
            double input = sc.nextDouble();
            // Breaking if input is 0 or negative
            if (input <= 0 || index == 10) {
                break;
            }
            // Storing value and incrementing the index
            values[index] = input;
            index++;
        }
        // Displaying numbers and calculating total
        System.out.println("Numbers entered: ");
        for (int i = 0; i < index; i++) {
            System.out.print(values[i] + ",");
            total = total + values[i];
        }

        // Displaying result as sum
        System.out.println("Sum of all numbers: " + total);

        sc.close();
    }
}
