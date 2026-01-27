package com.collections.junit.bankaccount;

public class BankAccount {
	//attributes
    private double balance;

    //constructor
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    //method to deposit amount
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
        balance = balance + amount;
    }

  //method to withdraw amount
    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds");
        }
        balance = balance - amount;
    }

    public double getBalance() {
        return balance;
    }
}
