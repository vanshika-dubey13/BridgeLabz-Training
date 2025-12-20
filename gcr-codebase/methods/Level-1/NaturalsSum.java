//Creating a class to check for the natural number and sum of n natural numbers using a method 

import java.util.Scanner;
public class NaturalsSum{

	public static int sumOfNNaturals( int n ){
		int sum =0;
		//Checking if number is natural number then, calculating sum 
		if (n >= 0){
			sum = n * (n +1 ) / 2;
			return sum;
		}
		else{
			return 0 ;
		}
	}

	public static void main(String[] args){ 
	
	//Taking a number from user 
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number : ");
	int num = sc.nextInt();
	int ans = sumOfNNaturals(num);
	System.out.print("Sum of " + num + " natural numbers is : " + ans);
	sc.close();
	}
}