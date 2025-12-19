//Creating a class to find the factors of a number taken as user input, storing the factors in an array, and displaying the factors


import java.util.Scanner;
public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking input from user
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        // Defining Initial array size
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;
        // Finding factors of number
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                // Checking If array is full then resizing it
                if (index == maxFactor) {
                    maxFactor = maxFactor * 2;
                    int[] temporary = new int[maxFactor];
                    // Copying old elements to new array
                    for (int j = 0; j < factors.length; j++) {
                        temporary[j] = factors[j];
                    }
                    factors = temporary;
                }
                // Storing factor in array
                factors[index] = i;
                index++;
            }
        }

        // Displaying factors
        System.out.println("Factors of " + num + " are:");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }

        sc.close();
    }
}
