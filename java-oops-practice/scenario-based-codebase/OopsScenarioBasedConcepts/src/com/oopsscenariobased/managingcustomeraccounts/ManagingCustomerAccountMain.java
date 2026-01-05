package com.oopsscenariobased.managingcustomeraccounts;

//main class
public class ManagingCustomerAccountMain {
    public static void main(String[] args) {

    	//creating objects for different types of accounts
        Account savings = new SavingsAccount("SB101", 10000);
        Account current = new CurrentAccount("CA201", 5000);

        savings.deposit(2000);
        current.withdraw(1000);

        //displaying results
        System.out.println("Savings Balance: " + savings.checkBalance());
        System.out.println("Savings Interest: " + savings.calculateInterest());

        System.out.println("Current Balance: " + current.checkBalance());
        System.out.println("Current Interest: " + current.calculateInterest());
    }
}
