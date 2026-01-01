package com.encapsulation.bankingsystem;

//subclass
class CurrentAccount extends BankAccount {

	//constructor
	 public CurrentAccount(String accountNo, String holderName, double balance) {
	     super(accountNo, holderName, balance);
	 }

	 //overriding method of parent class
	 @Override
	 public double calculateInterest() {
	     double interest = getBalance() * 0.01; 
	     System.out.println("Current Account Interest: " + interest);
	     return interest;
	 }
	}
