package com.inheritance.office;

//Manager subclass
public class Manager extends Employee {
	
	//attributes
	private int teamSize;

	public Manager(String name, int id, double salary, int teamSize) {
		super(name, id, salary);
		this.teamSize = teamSize;
	}

	//overriding method of parent class 
	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Team Size: " + teamSize);
	}
}
