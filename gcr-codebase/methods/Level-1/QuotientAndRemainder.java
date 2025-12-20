//Creating a class to calculate quotient and remainder of 2 numbers using a method 

import java.util.Scanner;
public class QuotientAndRemainder{


	public static int[] findRemainderAndQuotient(int number, int divisor) 
	{
		int ans []= new int[2];
        	//Calculating quotient and remainder
		int quotient = number / divisor;
		int remainder = number % divisor;

		//Storing quotient and remainder in array
		ans [0]=  quotient;
		ans [1] = remainder;
		return ans;	
	}


	public static void main(String[] args){

	//Taking input using Scanner
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter first number : ");
	int num1 = sc.nextInt();
	System.out.println("Enter second number : ");
	int num2 = sc.nextInt();

	

	//Displaying output
	int ans[]  = findRemainderAndQuotient( num1, num2 );
	//Displaying result in form of arr
	System.out.println("Quotient is : " + ans[0]);
	System.out.println("Remainder is : " + ans[1]);

	}
}