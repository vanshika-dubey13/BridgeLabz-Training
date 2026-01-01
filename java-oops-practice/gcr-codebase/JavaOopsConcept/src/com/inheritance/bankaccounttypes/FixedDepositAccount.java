package com.inheritance.bankaccounttypes;

//subclass
public class FixedDepositAccount extends BankAccount {
	
	//attributes
    int tenure; // tenure in months

    //constructor
    FixedDepositAccount(String accountNumber, double balance, int tenure) {
        super(accountNumber, balance);
        this.tenure = tenure;
    }

    //displaying details
    void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
    }
}
