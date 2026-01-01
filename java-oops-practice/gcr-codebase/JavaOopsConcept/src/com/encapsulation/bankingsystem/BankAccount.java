package com.encapsulation.bankingsystem;

//abstract class
abstract class BankAccount {
	
    // attributesz
    private String accountNo;
    private String holderName;
    private double balance;

    // Constructor
    public BankAccount(String accountNo, String holderName, double balance) {
        this.accountNo = accountNo;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Getters and Setters for encapsulation
    public String getAccountNumber() {
        return accountNo;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    // Concrete methods
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }

    // Abstract method for interest calculation
    public abstract double calculateInterest();
}
