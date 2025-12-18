//Creating a class to calculate quotient and remainder of 2 numbers

import java.util.Scanner;
public class QuotientAndRemainder{
	public static void main(String[] args){

	//Taking input using Scanner
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter first number : ");
	int num1 = sc.nextInt();
	System.out.println("Enter second number : ");
	int num2 = sc.nextInt();

	//Calculating quotient and remainder
	int quotient = num1 / num2;
	int remainder = num1 % num2;

	//Displaying output
	System.out.println("The Quotient is " + quotient + " and Reminder is " + remainder + " of two number " + num1 + " and " +num2);

	}
}