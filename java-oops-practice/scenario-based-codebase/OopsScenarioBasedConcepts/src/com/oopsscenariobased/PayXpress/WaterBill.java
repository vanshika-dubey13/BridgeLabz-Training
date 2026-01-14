package com.oopsscenariobased.PayXpress;

//subclass
public class WaterBill extends Bill {
	//constructor
	 public WaterBill(double amount, String dueDate) {
	     super("Water", amount, dueDate);
	 }

	 //overriding method of interface
	 @Override
	 public void sendReminder() {
	     System.out.println("Water Bill Reminder: Please clear dues at the earliest.");
	 }
}