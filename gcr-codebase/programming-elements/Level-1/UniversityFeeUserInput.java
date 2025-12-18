//Creating a class to calculate University fee details

import java.util.Scanner;
public class UniversityFeeUserInput{
	public static void main(String[] args){

	// Creating Scanner object to take input from user
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Student University fee : ");
	int fee = sc.nextInt();
	System.out.println("Enter discount percent: ");
	int discountPercent = sc.nextInt(); ;


	//Calculating discount and fee to be paid
	int discount = fee - (fee * discountPercent / 100 ) ;
	int feeToPay = fee - discount ;

	
	//Displaying total fees student needs to pay after applying discount
	System.out.println("The discount amount is INR " + discount +" and final discounted fee is INR "  + feeToPay );
	sc.close();
	}
}