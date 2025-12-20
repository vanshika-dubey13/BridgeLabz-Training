//Creating a class to check whether a number is positive, negative, or zero.


import java.util.Scanner;
public class  CheckingNumber{

	//Checking whether a number is positive, negative, or zero.
	public static void NumberChecking( int n ){
		if (n > 0){
			System.out.println( n +" is positive ");					}
		else if (n < 0){
			System.out.println( n +" is negative");						}
		else {
			System.out.println(n +" is zero");
		} 
	}


	public static void main(String[] args){
		//Taking a number through user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		NumberChecking(num);
		sc.close();
	}
}