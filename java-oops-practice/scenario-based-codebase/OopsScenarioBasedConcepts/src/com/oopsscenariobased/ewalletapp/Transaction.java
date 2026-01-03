package com.oopsscenariobased.ewalletapp;

public class Transaction {
	
	//attributes
    String transactionType;
    double amount;

    //constructor
    Transaction(String type, double amount) {
        this.transactionType = transactionType;
        this.amount = amount;
    }

    //displaying transaction amount
    void showTransaction() {
        System.out.println(transactionType + " : Rs. " + amount);
    }
}
