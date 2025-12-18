//Creating a class to calculate factorial of a number using while loop

import java.util.Scanner;
public class FactorialUsingWhile{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		int fact = 1;

		//Calculating factorial using for loop
		while(num >=1 ){
			fact = fact * num;
			num=num-1;
		}

		//Displaying the result
		System.out.println("Factorial is " + fact);
		sc.close();
	} 
}