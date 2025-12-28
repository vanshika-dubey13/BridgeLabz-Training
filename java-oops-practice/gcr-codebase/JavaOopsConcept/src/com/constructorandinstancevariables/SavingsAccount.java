package com.constructorandinstancevariables;

public class SavingsAccount extends BankAccount {

    // Parametrized constructor
    public SavingsAccount(int accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    // Method to  access to public and protected members
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
    }
}
