package com.inheritance.bankaccounttypes;

//subclass
public class SavingsAccount extends BankAccount {
    
	//attributes
	double interestRate;

	//constructor
    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    //displaying details
    void displayAccountType() {
        System.out.println("Account Type: Savings Account");
    }
}
