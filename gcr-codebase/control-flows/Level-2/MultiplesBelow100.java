import java.util.Scanner;

//Creating a class to find MultiplesBelow100

public class MultiplesBelow100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a positive integer less than 100: ");
        int num = sc.nextInt();

        // Checking validity
        if (num <= 0 || num >= 100) {
            System.out.println("Please enter a positive integer less than 100.");
        } else {
            System.out.println("Multiples of " + number + " below 100 are:");

            // Looping backward from 100 to 1
            for (int i = 100; i >= 1; i--) {
                if (i % num == 0) {   // checking if i is a multiple of number
                    System.out.println(i);
                }
            }
        }

        sc.close();
    }
}
