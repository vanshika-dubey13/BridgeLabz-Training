//Creating a class o find the sum of n natural numbers using while loop compare the result with the formulae n*(n+1)/2 and show the result from both computations was correct. 


import java.util.Scanner;
public class SumOfNaturalsCompare{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		int sum = 0;
	
		//Calculating sum of n natural no's using for loop
		for(int i=num; i>=1; i--){
			sum = sum + i;
		}
		//Calculating sum of n natural no's using formula
		int formulaSum = num * (num + 1)/2;
		
		//Displaying results computed using for loop and formula
		System.out.println("Sum using for loop : " + sum);
		System.out.println("Sum using formula : " + formulaSum);
		sc.close();

	 }
}