package com.encapsulation.bankingsystem;

//SavingsAccount with a fixed interest rate
class SavingsAccount extends BankAccount {

	//attribute // annual interest rate in %
	private double interestRate; 

	//constructor
	public SavingsAccount(String accountNo, String holderName, double balance, double interestRate) {
		super(accountNo, holderName, balance);
		this.interestRate = interestRate;
	}

	//overriding method of parent class
	@Override
	public double calculateInterest() {
		double interest = getBalance() * interestRate / 100;
		System.out.println("Savings Account Interest: " + interest);
		return interest;
		}
	}
