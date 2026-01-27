package com.collections.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

//creating a class to validate username
public class UsernameValidator {

	//method to check if username is valid
    public static boolean isValidUsername(String username) {
        // Regex: starts with letter, 5-15 chars, letters/numbers/underscore
        String regex = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";
        return Pattern.matches(regex, username);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a username to validate: ");
        String username = sc.nextLine();
        if (isValidUsername(username)) {
            System.out.println(username + " is → Valid");
        } else {
            System.out.println(username + " is → Invalid");
        }

        sc.close();
    }
}

