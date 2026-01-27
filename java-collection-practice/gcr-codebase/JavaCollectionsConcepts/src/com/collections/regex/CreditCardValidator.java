package com.collections.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

//creating a class to validate credit acrd
public class CreditCardValidator {

	//method to validate card
    public static String validateCard(String cardNumber) {
        if (Pattern.matches("^4[0-9]{15}$", cardNumber)) {
            return "Visa";
        } else if (Pattern.matches("^5[0-9]{15}$", cardNumber)) {
            return "MasterCard";
        } else {
            return "Invalid";
        }
    }

    //main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a credit card number: ");
        String cardNumber = sc.nextLine();
        String validatingResult = validateCard(cardNumber);
        if (!validatingResult.equals("Invalid")) {
            System.out.println(cardNumber + "\" → Valid " + validatingResult + " card");
        } else {
            System.out.println(cardNumber + "\" → Invalid credit card number");
        }

        sc.close();
    }
}

