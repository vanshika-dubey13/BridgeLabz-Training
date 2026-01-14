package com.oopsscenariobased.PayXpress;

//subclass
public class InternetBill extends Bill {
	 //constructor
	 public InternetBill(double amount, String dueDate) {
	     super("Internet", amount, dueDate);
	 }

	//overriding method of interface
	 @Override
	 public void sendReminder() {
	     System.out.println("Internet Bill Reminder: Service will be suspended soon!");
	 }
}