package com.scenariobased.optionalclass;

import java.util.Optional;

class BankAccount {
	//attributes
    String accNumber;
    String nominee;
    Double balance;
    String transactionRef;
    String creditCard;
    String loanDetails;

    //constructor
    BankAccount(String accNumber, String nominee,
                Double balance, String transactionRef,
                String creditCard, String loanDetails) {
        this.accNumber = accNumber;
        this.nominee = nominee;
        this.balance = balance;
        this.transactionRef = transactionRef;
        this.creditCard = creditCard;
        this.loanDetails = loanDetails;
    }
}

//main class
public class BankApp {
	//main method
    public static void main(String[] args) {

        BankAccount account = new BankAccount(
                "ACC123",
                // nominee missing
                null,          
                // balance missing
                null,          
                // transaction ref missing
                null,          
                // credit card missing
                null,          
                "Home Loan"
        );

        //  Handle nominee safely
        Optional.ofNullable(account.nominee)
                .ifPresentOrElse(
                        n -> System.out.println("Nominee: " + n),
                        () -> System.out.println("No nominee added")
                );

        //  Fetch loan details if available
        Optional.ofNullable(account.loanDetails)
                .ifPresent(l -> System.out.println("Loan: " + l));

        //  Default minimum balance if balance is null
        Double balance = Optional.ofNullable(account.balance)
                .orElse(1000.0);
        System.out.println("Balance: " + balance);

        //  Safely fetch transaction reference number
        String txRef = Optional.ofNullable(account.transactionRef)
                .orElse("Transaction reference not available");
        System.out.println("Transaction Ref: " + txRef);

        //  Display credit card details only if present
        Optional.ofNullable(account.creditCard)
                .ifPresent(cc -> System.out.println("Credit Card: " + cc));
    }
}

