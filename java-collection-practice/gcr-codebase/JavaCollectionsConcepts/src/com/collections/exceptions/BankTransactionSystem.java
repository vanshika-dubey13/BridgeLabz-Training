package com.collections.exceptions;

import java.util.Scanner;

// creating a class to thow custom exception
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

// class Bank
class BankAccount {
	//attributes
    private double balance;

    //constructor
    public BankAccount(double balance) {
        this.balance = balance;
    }

    // method withdraw to throw exception
    public void withdrawAmount(double amount) throws InsufficientBalanceException {
        if (amount < 0) {
            throw new IllegalArgumentException("Invalid amount!");
        }
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance!");
        }
        balance -= amount;
        System.out.println("Withdrawal successful, new balance: " + balance);
    }

    public double getBalance() {
        return balance;
    }
}

// main class
public class BankTransactionSystem {

	//main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount(5000); 
        System.out.print("Enter withdrawal amount: ");
        double amount = sc.nextDouble();

        try {
            account.withdrawAmount(amount);

        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());

        }
        catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());

        }
        finally {
            sc.close();
        }
    }
}

