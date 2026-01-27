package com.collections.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

//creating a class to validate SSN
public class SSNValidator {

	//method to check SSN is valid 
    public static boolean isValidSSN(String ssn) {
        String regex = "^\\d{3}-\\d{2}-\\d{4}$";
        return Pattern.matches(regex, ssn);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an SSN: ");
        String ssn = sc.nextLine();
        if (isValidSSN(ssn)) {
            System.out.println(ssn + " is valid");
        } else {
            System.out.println(ssn + " is invalid");
        }

        sc.close();
    }
}

