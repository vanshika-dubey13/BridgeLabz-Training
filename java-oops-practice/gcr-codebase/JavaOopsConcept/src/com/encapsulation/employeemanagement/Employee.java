package com.encapsulation.employeemanagement;

//Abstract Class for Employee
abstract class Employee {
	
	//attributes
	private int employeeId;
	private String name;
	private double baseSalary;

	//constructor
	public Employee(int employeeId, String name, double baseSalary) {
		this.employeeId = employeeId;
		this.name = name;
		this.baseSalary = baseSalary;
	}

	// Getters and Setters
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		if (employeeId > 0) this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != null && !name.isEmpty()) this.name = name;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		if (baseSalary >= 0) this.baseSalary = baseSalary;
	}

	// Shared concrete method
	public void displayDetails() {
		System.out.println("ID: " + employeeId + ", Name: " + name + ", Base Salary: " + baseSalary);
	}

	// Abstract method
	public abstract double calculateSalary();
	}


