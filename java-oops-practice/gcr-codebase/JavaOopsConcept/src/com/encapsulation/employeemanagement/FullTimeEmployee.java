package com.encapsulation.employeemanagement;

//FullTimeEmployee subclass
class FullTimeEmployee extends Employee {
	
	//attribute
	private double bonus;

	//constructor
	public FullTimeEmployee(int employeeId, String name, double baseSalary, double bonus) {
		super(employeeId, name, baseSalary);
		this.bonus = bonus;
	}

	//getters and setters for bonus
	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		if (bonus >= 0) this.bonus = bonus;
	}

	//overriding method of parent class 
	@Override
	public double calculateSalary() {
		return getBaseSalary() + bonus;
	}
}

