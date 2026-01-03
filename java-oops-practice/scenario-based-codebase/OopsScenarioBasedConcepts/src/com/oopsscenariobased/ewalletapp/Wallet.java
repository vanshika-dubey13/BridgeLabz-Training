package com.oopsscenariobased.ewalletapp;

import java.util.ArrayList;

abstract class Wallet implements Transferrable {
	
	//attributes
    private double balance;
    ArrayList<Transaction> history = new ArrayList<>();

    //constructor
    Wallet(double initialBalance) {
        this.balance = initialBalance;
    }

    //methods for balance
    public double getBalance() {
        return balance;
    }

    protected void addBalance(double amount) {
        balance += amount;
        history.add(new Transaction("Credited", amount));
    }

    protected boolean deductBalance(double amount) {
        if (balance >= amount) {
            balance -= amount;
            history.add(new Transaction("Debited", amount));
            return true;
        }
        return false;
    }

    void showHistory() {
        for (Transaction t : history) {
            t.showTransaction();
        }
    }
}
