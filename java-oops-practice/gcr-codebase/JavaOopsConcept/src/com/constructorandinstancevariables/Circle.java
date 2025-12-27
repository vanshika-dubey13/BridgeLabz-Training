package com.constructorandinstancevariables;

public class Circle {
	//creating attributes for circle
	double radius;
	
	
	//deafult constructor
	Circle(){
		radius = 3.7;
	}
	
	//parametrized constructor
	Circle(double radius){
		this.radius = radius;
	} 
	
	//method to display vales
	public void displayValues() {
		System.out.println("Rdius : " + radius);
	}
	
	public static void main(String[] args) {
		// using default
		Circle c1 = new Circle();
		System.out.println("Details of circle 1 : ");
		c1.displayValues();
		
		//parametrized
		Circle c2 = new Circle(7.9);
		System.out.println("\nDetails of circle 2 : ");
		c2.displayValues();

	}

}
