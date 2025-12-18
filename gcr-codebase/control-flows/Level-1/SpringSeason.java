//Creating a class to check whether date falls in Spring Season.


import java.util.Scanner;
public class SpringSeason{
	public static void main(String[] args){ 
	
	//Taking month and day from user 
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter month : ");
	int month = sc.nextInt();
	System.out.print("Enter day : ");
	int day = sc.nextInt();
		
	//Checking if it is spring season
	if (month >= 3 && month <=6){
		if( (month == 3 && day >=20) || (month == 6 && day <=20) )
			System.out.print("Its a Spring Season");
		else{
			System.out.print("Not a Spring Season");
		}
			}
	else {
		System.out.print("Not a Spring Season");

		}
	}
}