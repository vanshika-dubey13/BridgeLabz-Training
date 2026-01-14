package com.oopsscenariobased.PayXpress;

//Inheritance
public class ElectricityBill extends Bill {
	//constructor
	public ElectricityBill(double amount, String dueDate) {
		super("Electricity", amount, dueDate);
	}

	//overriding method of interface
	@Override
	public void sendReminder() {
		System.out.println("Electricity Bill Reminder: Pay immediately to avoid disconnection!");
	}
}