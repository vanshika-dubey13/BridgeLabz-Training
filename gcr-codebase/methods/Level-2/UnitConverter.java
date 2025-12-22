//Creating a class to convert distance units using static methods

import java.util.Scanner;
public class UnitConverter{


	//Creating a method to convert km to miles
	public static double convertKmToMiles(double km){
		double kmToMiles = 0.621371;
		return km * kmToMiles;
	}

	//Creating a method to convert miles to km
	public static double convertMilesToKm(double miles){
		double milesToKm = 1.60934;
		return miles * milesToKm;
	}

	//Creating a method to convert meters to feet
	public static double convertMetersToFeet(double m){
		double metersToFeet = 3.28084;
		return m * metersToFeet;
	}

	//Creating a method to convert feet to meters
	public static double convertFeetToMeters(double feet){
		double feetTometers = 0.3048;
		return feet * feetTometers;
	}

	public static void main(String[] args){
		int val =10;
		
		System.out.println(val +" km "+ " in miles : " +convertKmToMiles(val));
		System.out.println(val +" miles "+ " in km : " +convertMilesToKm(val));
		System.out.println(val +" m "+ " in feet : " +convertMetersToFeet(val));
		System.out.println(val +" feet "+ " in m : " +convertFeetToMeters(val));

	}
}
