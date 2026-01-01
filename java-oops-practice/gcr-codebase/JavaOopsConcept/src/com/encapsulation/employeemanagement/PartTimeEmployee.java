package com.encapsulation.employeemanagement;

import java.util.ArrayList;
import java.util.List;


//PartTimeEmployee subclass
class PartTimeEmployee extends Employee {
	
	//attributes
	private int hoursWorked;
	private double hourlyRate;

	//constructor
	public PartTimeEmployee(int employeeId, String name, int hoursWorked, double hourlyRate) {
		super(employeeId, name, 0); // baseSalary not used
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
	}

	//overriding method of parent class 
	@Override
	public double calculateSalary() {
		return hoursWorked * hourlyRate;
	}
}

