//Creating a class to check for the natural number and sum of n natural numbers 



import java.util.Scanner;
public class NaturalsSum{
	public static void main(String[] args){ 
	
	//Taking a number from user 
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number : ");
	int num = sc.nextInt();
	int sum =0;
	
	//Checking if number is natural number
	if (num >= 0){
		sum = num * (num +1 ) / 2;
		System.out.print("The sum of " + num+  " natural numbers is " + sum); 
		}
	else {
		System.out.print("The number " + num + " is not a natural number");

		}
	}
}