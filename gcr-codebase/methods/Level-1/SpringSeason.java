//Creating a class to check whether date falls in Spring Season using a method


import java.util.Scanner;
public class SpringSeason{
	
	//Creating a method which returns true if it is spring season or not
	public static boolean isItSpringSeason( int m , int d ){
		if (m >= 3 && m <=6){
		if( (m == 3 && d >=20) || (m == 6 && d <=20) ) {
			return true;
			}
		else{
			return false;
			}
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args){ 
	
	//Taking month and day from user 
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter month : ");
	int month = sc.nextInt();
	System.out.print("Enter day : ");
	int day = sc.nextInt();

	if( isItSpringSeason(month, day) == true){
		System.out.print("Its a Spring Season");
		}
	else{
		System.out.print("Its not a Spring Season");
		}
	sc.close();	
	}
}