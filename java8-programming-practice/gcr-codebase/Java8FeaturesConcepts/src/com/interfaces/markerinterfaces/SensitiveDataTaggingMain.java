package com.interfaces.markerinterfaces;

interface SensitiveData {
}

class Account implements SensitiveData {
    //attributes
	String accountNumber;

	//constructor
    Account(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}

//main class
public class SensitiveDataTaggingMain {
    //main method
	public static void main(String[] args) {
        Account acc = new Account("ACC12345");

        if (acc instanceof SensitiveData) {
            System.out.println("Sensitive data detected. Encrypting...");
        }
        else {
            System.out.println("No encryption required.");
        }
    }
}
