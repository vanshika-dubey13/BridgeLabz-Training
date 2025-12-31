package com.inheritance.office;

//ubclass
public class Developer extends Employee {
	
	//attributes
	private String programmingLanguage;

	public Developer(String name, int id, double salary, String programmingLanguage) {
		super(name, id, salary);
		this.programmingLanguage = programmingLanguage;
	}

	//overriding method of parent class 
	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Programming Language: " + programmingLanguage);
	}
}
