//Creating a class to convert distance units using static methods

import java.util.Scanner;
public class UnitConverter{


	//Creating a method to convert yards to feet
	public static double convertYardsToFeet(double yards){
		double yards2feet = 3;
		return yards * yards2feet;
	}

	//Creating a method to convert feet to yards
	public static double convertFeetToYards(double feet){
		double feet2yards = 0.333333;
		return feet * feet2yards;
	}

	//Creating a method to convert meters to inches
	public static double convertMetersToInches(double meter){
		double meters2inches = 39.3701;
		return meter * meters2inches;
	}

	//Creating a method to convert inches to meters
	public static double convertInchesToMeters(double inches){
		double inches2meters = 0.0254;
		return inches * inches2meters;
	}
	//Creating a method to convert inches to cm
	public static double convertInchesToCentiMeters(double inches){
		double inches2cm = 2.54;
		return inches * inches2cm;
	}


	public static void main(String[] args){
		int val =10;
		
		System.out.println(val +" yards "+ " in feet : " +convertYardsToFeet(val));
		System.out.println(val +" feet "+ " in yards : " +convertFeetToYards(val));
		System.out.println(val +" m "+ " in inches : " +convertMetersToInches(val));
		System.out.println(val +" inches "+ " in m : " +convertInchesToMeters(val));
		System.out.println(val +" inches "+ " in cm : " +convertInchesToCentiMeters(val));

	}
}
