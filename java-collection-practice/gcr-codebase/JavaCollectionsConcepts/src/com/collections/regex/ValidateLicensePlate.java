package com.collections.regex;

import java.util.regex.*;

//creating a class to validate license plate
public class ValidateLicensePlate {
    public static void main(String[] args) {
        String[] plates = {
            "AB1234",   // valid
            "A12345",   // invalid
            "XY9999",   // valid
            "ab1234",   // invalid (lowercase letters)
            "ABC1234"   // invalid (3 letters instead of 2)
        };

        // Regex: two uppercase letters followed by four digits
        String regex = "^[A-Z]{2}\\d{4}$";
        Pattern pattern = Pattern.compile(regex);

        for (String plate : plates) {
            Matcher matcher = pattern.matcher(plate);
            if (matcher.matches()) {
                System.out.println("✅ \"" + plate + "\" is valid");
            } else {
                System.out.println("❌ \"" + plate + "\" is invalid");
            }
        }
    }
}
