package com.objectorienteddesign;

public class BankMain {
    public static void main(String[] args) {
    	
    	//creating bank obj
        Bank bank = new Bank("National Bank");

        //creating customers
        Customer c1 = new Customer("Alice");
        Customer c2 = new Customer("Bob");

        //opening bank account
        bank.openAccount(c1, 1000);
        bank.openAccount(c2, 500);

        //displaying balance of respective customers
        c1.viewBalance();
        c2.viewBalance();
    }
}
