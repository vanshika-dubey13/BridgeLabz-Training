//Creating a class o find the sum until the user enters 0 or a negative number using while loop and break statement


import java.util.Scanner;
public class SumOfNumbers2{
	public static void main(String [] args){
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a value : ");
	double userValue = sc.nextDouble();
	//double type = 0.0;
	double sum = 0.0;
	
	while(userValue != 0.0 ){
		sum = sum + userValue;
		System.out.println("Enter a new value : ");
		//Taking a new value everytime until user enters a negative or 0 value
		userValue = sc.nextDouble();
		if( userValue < 0 ){
			break;
			}
		}
	System.out.println("Sum : "+ sum);
	 
	}
}