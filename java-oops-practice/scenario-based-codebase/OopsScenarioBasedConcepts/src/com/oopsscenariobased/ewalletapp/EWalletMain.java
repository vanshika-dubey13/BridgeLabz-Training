package com.oopsscenariobased.ewalletapp;

//main method
public class EWalletMain {
    public static void main(String[] args) {

    	//creating objects for users
        User alice = new User("Alice", new PersonalWallet(1000));
        User bob = new User("Bob", new BusinessWallet(2000));

        alice.wallet.transferTo(bob, 200);
        bob.wallet.transferTo(alice, 300);

        //displaying balance details
        System.out.println("\nAlice Balance: Rs. " + alice.wallet.getBalance());
        System.out.println("Bob Balance: Rs. " + bob.wallet.getBalance());

        System.out.println("\nAlice Transactions:");
        alice.wallet.showHistory();

        System.out.println("\nBob Transactions:");
        bob.wallet.showHistory();
    }
}
