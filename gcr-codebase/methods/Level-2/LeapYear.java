//Creating a class to check leap year

import java.util.Scanner;
public class LeapYear{

	public static boolean isLeapYear(int year){
		//Georgian calendar condition
		if ( year< 1582 ){
			return false;
		}
		//Leap year condition
		if ( (year % 4 == 0) && (year % 100 != 0) || (year % 400 ==0)){
			return true;
		}
		else{
			return false;
		}	
	}

	public static void main(String[] args){ 
	
		//Taking a year as user input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a year : ");
		int year = sc.nextInt();
		//Checking if year if leap
		if(isLeapYear(year)){
			System.out.println(year + " is a Leap Year");
		}	
		else {
            		System.out.println(year + " is not a Leap Year");
        	}
		sc.close();
	}
}
