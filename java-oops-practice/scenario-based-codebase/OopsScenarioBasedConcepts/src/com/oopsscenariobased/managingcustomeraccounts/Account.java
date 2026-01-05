package com.oopsscenariobased.managingcustomeraccounts;

public abstract class Account implements ITransaction {

    protected String accountNumber;   
    private double balance;           

    // Constructor without opening balance
    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    // Constructor with opening balance
    public Account(String accountNumber, double openingBalance) {
        this.accountNumber = accountNumber;
        this.balance = openingBalance;
    }

    //overriding method of parent class
    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    //overriding method of parent class
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    //overriding method of parent class
    @Override
    public double checkBalance() {
        return balance;
    }

    // Protected access for subclasses
    protected double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    public abstract double calculateInterest();
}
