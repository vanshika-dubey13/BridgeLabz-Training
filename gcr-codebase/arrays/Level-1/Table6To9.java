//Creating a class to to print a multiplication table of a number if num is 6 to 9

import java.util.Scanner;

public class Table6To9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

	int[] multiplicationResult = new int[10];

	//Displaying table only if number lies between 6 to 9
        if( num >=6 && num <=9){
          // Storing the results in array
        for (int i = 1; i <= multiplicationResult.length; i++) {
            multiplicationResult[i - 1] = num * i;
        }
}
        // Displayig the multiplication table
        System.out.println("Multiplication Table of " + num + ":");
        for (int i = 1; i <= multiplicationResult.length; i++) {
            System.out.println(num + " * " + i + " = " + multiplicationResult[i - 1]);
        }

        sc.close();
    }
}
