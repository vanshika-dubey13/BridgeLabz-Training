//Creating a class to convert distance units using static methods

import java.util.Scanner;
public class UnitConverterTemperature{


	//Creating a method to convert farhenheit to celsius
	public static double convertFarhenheitToCelsius(double farhenheit){
		double farhenheit2celsius = (farhenheit - 32) * 5 / 9;
		return farhenheit * farhenheit2celsius;
	}

	//Creating a method to convert celsius to farhenheit
	public static double convertCelsiusToFarhenheit(double celsius){
		double celsius2farhenheit = (celsius * 9 / 5) + 32;
		return celsius * celsius2farhenheit;
	}

	//Creating a method to convert pounds to kilograms
	public static double convertPoundsToKilograms(double pounds){
		double pounds2kilograms = 0.453592;
		return pounds * pounds2kilograms;
	}

	//Creating a method to convert kilograms to pounds
	public static double convertKilogramsToPounds(double kilograms){
		double kilograms2pounds = 2.20462; 
		return kilograms * kilograms2pounds;
	}
	//Creating a method to convert gallons to liters
	public static double convertGallonsToLiters(double gallons){
		double gallons2liters = 3.78541;
		return gallons * gallons2liters;
	}
	//Creating a method to convert liters to gallons
	public static double convertliters2gallons(double liters){
		double liters2gallons = 0.264172; 
		return liters * liters2gallons;
	}


	public static void main(String[] args){
		int val =10;
		
		System.out.println(val +" farhenheit "+ " in celsius : " +convertFarhenheitToCelsius(val));
		System.out.println(val +" celsius "+ " in farhenheit : " +convertCelsiusToFarhenheit(val));
		System.out.println(val +" pounds "+ " in kg : " +convertPoundsToKilograms(val));
		System.out.println(val +" kg "+ " in pounds : " +convertKilogramsToPounds(val));
		System.out.println(val +" gallons "+ " in liters : " +	convertGallonsToLiters(val));
		System.out.println(val +" liters "+ " in gallons : " +convertliters2gallons(val));

	}
}
