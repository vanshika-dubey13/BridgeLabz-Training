package com.collections.regex;

import java.util.regex.*;

//creating a class to validate credit card
public class ValidateCreditCard {
    public static void main(String[] args) {
        String[] cards = {
            "4123456789012345", // Visa - valid
            "5123456789012345", // MasterCard - valid
            "41234567890123",   // Invalid (too short)
            "6123456789012345", // Invalid (starts with 6)
            "512345678901234"   // Invalid (too short)
        };

        // Regex: Visa (starts with 4, 16 digits) OR MasterCard (starts with 5, 16 digits)
        String regex = "^(4\\d{15}|5\\d{15})$";
        Pattern pattern = Pattern.compile(regex);

        for (String card : cards) {
            Matcher matcher = pattern.matcher(card);
            if (matcher.matches()) {
                if (card.startsWith("4")) {
                    System.out.println(card + "\" is a valid Visa card");
                } else if (card.startsWith("5")) {
                    System.out.println( card + "\" is a valid MasterCard");
                }
            } else {
                System.out.println(card + "\" is invalid");
            }
        }
    }
}
