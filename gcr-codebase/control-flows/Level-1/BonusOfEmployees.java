// Creating a class to find the bonus of employees based on their years of service.

import java.util.Scanner;
public class BonusOfEmployees{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		//Taking salary and yearOfService as user input
		System.out.print("Enter salary : ");
		int salary = sc.nextInt(); 
		System.out.print("Enter yearOfService : ");
		int yearOfService = sc.nextInt(); 

		//Zara gives a bonus of 5% to employees whose year of service > 5years.
		if ( yearOfService > 5) {
		int bonus =  ( salary * 5 /100);
		System.out.print("Bonus amount is : " + bonus );
		}
		else{
		System.out.print("No Bonus" );

		}
	sc.close();

	}
}