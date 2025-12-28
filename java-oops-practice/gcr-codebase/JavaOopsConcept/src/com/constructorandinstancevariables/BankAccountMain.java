package com.constructorandinstancevariables;

public class BankAccountMain {
    public static void main(String[] args) {

        SavingsAccount sa = new SavingsAccount(12345, "Rahul", 10000);

        // Access public & protected members via subclass method
        sa.displayAccountInfo();

        // Access and modify balance using public methods
        System.out.println("Initial Balance: " + sa.getBalance());
        sa.setBalance(15000);
        System.out.println("Updated Balance: " + sa.getBalance());
    }
}
