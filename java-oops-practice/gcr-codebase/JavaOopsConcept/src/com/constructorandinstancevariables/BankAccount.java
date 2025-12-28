package com.constructorandinstancevariables;

public class BankAccount {

    // creating attributes
    public int accountNumber;

    // protected
    protected String accountHolder;
    // private
    private double balance;

    // parametrized constructor
    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Public method to access balance
    public double getBalance() {
        return balance;
    }

    // Public method to modify balance
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        }
    }
}
