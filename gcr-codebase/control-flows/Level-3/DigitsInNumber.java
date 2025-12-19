//Creating a class to count number of digits in a number.

import java.util.Scanner;

public class DigitsInNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        int count = 0;
        if (num == 0) {
            count = 1;
        } else {
            while (num != 0) {
                 num = num / 10;
                count++;
            }
        }

        //  Displaying result
        System.out.println("The number of digits is: " + count);

        sc.close(); 
    }
}
 