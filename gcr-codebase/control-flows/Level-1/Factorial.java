//Creating a class to calculate factorial of a number using for loop

import java.util.Scanner;
public class Factorial{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		int fact = 1;

		//Calculating factorial using for loop
		for(int i=num; i>=1; i--){
			fact = fact * i;
		}

		//Displaying the result
		System.out.println("Factorial of " + num +" is " + fact);
		sc.close();
	} 
}