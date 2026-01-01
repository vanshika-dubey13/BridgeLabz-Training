package com.inheritance.bankaccounttypes;

//main class
public class BankSystemMain {
    public static void main(String[] args) {
    	
    	//creating objects for subclasses
        SavingsAccount savingsAcc = new SavingsAccount("SA101", 10000, 4.5);
        CheckingAccount checkingAcc = new CheckingAccount("CA202", 15000, 5000);
        FixedDepositAccount fd = new FixedDepositAccount("FD303", 50000, 24);

        //displaying results
        savingsAcc.displayAccountType();
        checkingAcc.displayAccountType();
        fd.displayAccountType();
    }
}
