//Creating a class to find harshad number.
import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

	// storing original number
        int temp = number;
        int sum = 0;
        // Calculating sum of digits
        while (temp > 0) {
            int digit = temp % 10; 
            sum += digit;            
            temp /= 10;              
        }
        // Check divisibility
        if (num % sum == 0) {
            System.out.println(num + " is a Harshad Number.");
        } else {
            System.out.println(num + " is Not a Harshad Number.");
        }

        sc.close();
    }
}
