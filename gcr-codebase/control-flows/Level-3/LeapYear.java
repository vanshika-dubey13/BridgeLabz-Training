//Creating a class to check leap year

import java.util.Scanner;
public class LeapYear{
	public static void main(String[] args){ 
	
	//Taking a year
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a year : ");
	int year = sc.nextInt();
	
		if ( (year % 4 == 0) && (year % 100 != 0) || (year % 400 ==0){
			System.out.print(" Leap year");
		}
		else{
			System.out.print("Not  Leap year");

		}	
	}
}