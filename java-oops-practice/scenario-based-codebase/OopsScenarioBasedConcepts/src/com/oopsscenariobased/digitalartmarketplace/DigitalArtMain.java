package com.oopsscenariobased.digitalartmarketplace;

import java.util.Scanner;

//main class
public class DigitalArtMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        User user = new User("Alex", 500);
        Artwork digital = new DigitalArt("Neon City", "Sam", 200);
        Artwork print = new PrintArt("Sunset Canvas", "Lia", 150);

        System.out.println("1. Buy Digital Art\n2. Buy Print Art\n3. View License");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                digital.purchase(user);
                break;
            case 2:
                print.purchase(user);
                break;
            case 3:
                digital.license();
                print.license();
                break;
            default:
                System.out.println("Invalid choice");
        }

        System.out.println("Wallet Balance: " + user.walletBalance);
        sc.close();
    }
}
