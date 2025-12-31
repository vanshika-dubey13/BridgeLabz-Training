package com.objectorienteddesign;

public class Customer {
	
	//attributes
    private String name;
    private Bank bank; // Association with Bank

    public Customer(String name) {
        this.name = name;
    }

    //setting the bank name
    public void setBank(Bank bank) {
        this.bank = bank;
    }

    // Communication with Bank
    public void viewBalance() {
        if (bank != null) {
            System.out.println(
                name + "'s balance at " + bank.getBankName() + ": $" +
                bank.getBalance(this)
            );
        }
        else {
            System.out.println(name + " has no bank account.");
        }
    }
}
