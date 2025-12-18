//Created a class to convert Kilometer to Miles

import java.util.Scanner;

public class KmToMiles {
    public static void main(String[] args) {
        
	//Taking distance in km as input
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter distance in km : ");
	double km = sc.nextDouble();
	
	double mile = km * 1.6;	//1 mile = 1.6 km
 
	//Displaying km converted into miles
        System.out.println("The total miles is "+ km +"mile for the given "+ mile);
    }
}