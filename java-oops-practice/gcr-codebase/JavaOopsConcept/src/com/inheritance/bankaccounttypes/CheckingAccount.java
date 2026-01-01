package com.inheritance.bankaccounttypes;

//subclass
public class CheckingAccount extends BankAccount {
	
	//attribute
    double withdrawalLimit;

    //constructor
    CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    //displaying values
    void displayAccountType() {
        System.out.println("Account Type: Checking Account");
    }
}
