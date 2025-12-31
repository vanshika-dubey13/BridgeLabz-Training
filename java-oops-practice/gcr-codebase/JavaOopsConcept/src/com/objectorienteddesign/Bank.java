package com.objectorienteddesign;

import java.util.HashMap;
import java.util.Map;

public class Bank {
	
	//attributes
    private String bankName;

    // Association: Bank keeps track of customers and their balances
    private Map<Customer, Double> accounts = new HashMap<>();

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    // Method to open an account for a customer
    public void openAccount(Customer customer, double initialBalance) {
        accounts.put(customer, initialBalance);
        customer.setBank(this);
    }

    // Used by Customer to check balance
    public double getBalance(Customer customer) {
        return accounts.getOrDefault(customer, 0.0);
    }

    public String getBankName() {
        return bankName;
    }
}
