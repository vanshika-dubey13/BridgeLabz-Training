//Creating a class o find the sum of n natural numbers using while loop compare the result with the formulae n*(n+1)/2 and show the result from both computations was correct. 


import java.util.Scanner;
public class SumOfNaturalsComparison{
	
	//Creating a method to calculate sum of n natural numbers using recursion
	public static int sumUsingRecursion(int n){
		if( n==1 ) {
		    return 1;
		}
		return n + sumUsingRecursion(n-1);
	}

	//Creating a method to calculate sum of n natural numbers using formula
	public static int sumUsingFormula(int n){
		return n * (n+1)/2;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();

		//Chceking if number entered is natural number
		if( num<=0 ) {
			System.out.print("Enter a natural number ");
		}
		else{
			int recursiveSum = sumUsingRecursion(num);
            		int formulaSum = sumUsingFormula(num);

			//Displaying results
			System.out.println("Sum using recursion : " + recursiveSum);
			System.out.println("Sum using formula : " + formulaSum);

			//Comparing results
			if (recursiveSum == formulaSum){
				System.out.println("Both the results are correct and equal");
			}
			else{
				System.out.println("Results are not equal");
			}
		}
		sc.close();

	 }
}