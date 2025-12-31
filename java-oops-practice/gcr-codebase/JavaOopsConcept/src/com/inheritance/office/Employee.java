package com.inheritance.office;

//super class
public class Employee {
	
	//attributes
	protected String name;
	protected int id;
	protected double salary;

	//constructor
	public Employee(String name, int id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	//method to display details
	public void displayDetails() {
		System.out.println("Name: " + name);
		System.out.println("ID: " + id);
		System.out.println("Salary: Rs: " + salary);
	}
}
