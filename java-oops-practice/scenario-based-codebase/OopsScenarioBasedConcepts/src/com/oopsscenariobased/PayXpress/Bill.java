package com.oopsscenariobased.PayXpress;

//Abstract Class
abstract class Bill implements IPayable {
	
	//attributes
	private boolean isPaid;        
	protected String type;
	protected double amount;
	protected String dueDate;

	// Constructor
	public Bill(String type, double amount, String dueDate) {
		this.type = type;
		this.amount = amount;
		this.dueDate = dueDate;
		this.isPaid = false;
	}

	// method to calculate late fee calculation
	public double calculateLateFee(int daysLate) {
		double penalty = daysLate * 20; 
		return amount + penalty;
	}

	//overriding method pay() of interface
	@Override
	public void pay() {
		if (!isPaid) {
			isPaid = true;
			System.out.println(type + " bill paid successfully.");
		}
		else {
			System.out.println(type + " bill already paid.");
		}
	}

	public boolean isPaid() {
		return isPaid;
	}

	public abstract void sendReminder();	
	}

