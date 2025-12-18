import java.util.Scanner;

public class SumOfNumbers{
	public static void main(String [] args){
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a value : ");
	double userValue = sc.nextDouble();
	//double type = 0.0;
	double sum = 0.0;
	
	while(userValue != 0.0 ){
		sum = sum + userValue;
		System.out.println("Enter a new value : ");
		userValue = sc.nextDouble();
		}
	System.out.println("Sum : "+ sum);
	 
	}
}