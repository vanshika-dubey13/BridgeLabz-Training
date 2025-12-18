import java.util.Scanner;

//Creating a class to find greatest factor

public class GreatestFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();

        int greatestFactor = 1;
        for (int i = num - 1; i >= 1; i--) {
            if (num % i == 0) {
                greatestFactor = i;
                break;             }
        }

        // Displaying result
        System.out.println("The greatest factor of " + number + " (besides itself) is: " + greatestFactor);

        sc.close();
    }
}
