package com.encapsulation.bankingsystem;

public class BankingSystemMain{
    public static void main(String[] args) {
    	
    	//creating an arr to store multiple bank account
        BankAccount[] bankAccounts = new BankAccount[3];

        bankAccounts[0] = new SavingsAccount("S001", "Alice", 5000, 5.0);
        bankAccounts[1] = new CurrentAccount("C001", "Bob", 3000);
        bankAccounts[2] = new LoanableSavingsAccount("S002", "Charlie", 1200, 4.5);

        //adding details to bank account
        for (BankAccount acc : bankAccounts) {
            System.out.println("\nAccount Holder: " + acc.getHolderName());
            acc.deposit(500);
            acc.withdraw(200);
            acc.calculateInterest();

            // Checking if account is loanable
            if (acc instanceof Loanable) {
                Loanable loanAcc = (Loanable) acc;
                loanAcc.applyForLoan(2000);
            }
        }
    }
}
