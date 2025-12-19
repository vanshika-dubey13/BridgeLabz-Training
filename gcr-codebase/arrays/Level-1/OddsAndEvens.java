//Creating a class to save odd and even numbers into odd and even arrays between 1 to the number entered by the user. Finally, printing the odd and even numbers array


import java.util.Scanner;

public class OddsAndEvens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num < 1) {
            System.out.println("Error: Enter a positive number.");
            sc.close();
            return;
        }

	//Creating 2 arrays, odds storing odd elements and evens storing even elements
        int[] odds = new int[num / 2 + 1];
        int[] evens = new int[num / 2 + 1];
        int idxOdd = 0, idxEven = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                evens[idxEven++] = i;
            } else {
                odds[idxOdd++] = i;
            }
        }

        // Displaying odd numbers
        System.out.println("Odd array elements are:");
        for (int i = 0; i < idxOdd; i++) {
            System.out.println(odds[i]);
        }
        // Displaying even numbers
        System.out.println("Even array elements are:");
        for (int i = 0; i < idxEven; i++) {
            System.out.println(evens[i]);
        }

        sc.close();
    }
}
