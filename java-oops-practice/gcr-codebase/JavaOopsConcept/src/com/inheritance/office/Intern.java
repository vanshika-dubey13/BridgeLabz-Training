package com.inheritance.office;

//Intern subclass
public class Intern extends Employee {
	
	//attributes
	private int durationMonths;

	public Intern(String name, int id, double salary, int durationMonths) {
		super(name, id, salary);
		this.durationMonths = durationMonths;
	}

	//overriding method of parent class 
	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Internship Duration: " + durationMonths + " months");
	}
}
