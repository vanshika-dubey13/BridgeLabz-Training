//Creating a class to calculate University fee details

import java.util.Scanner;
public class HeightCalculator{
	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter height in cm : ");
	int cm = sc.nextInt();

	int feet =  cm * 12 ;

	double inch = 2.54 * cm ;
	 
	
	//Displaying total fees student needs to pay after applying discount
	System.out.println("Your Height in cm is " + cm +" while in feet is "  + feet );
	}
}