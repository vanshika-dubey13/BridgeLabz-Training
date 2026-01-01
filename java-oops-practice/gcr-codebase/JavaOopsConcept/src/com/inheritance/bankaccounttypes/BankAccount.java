package com.inheritance.bankaccounttypes;

//superclass
class BankAccount {
	
	//attributes
    String accountNumber;
    double balance;

    //constructor
    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}
