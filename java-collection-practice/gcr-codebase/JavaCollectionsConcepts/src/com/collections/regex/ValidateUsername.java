package com.collections.regex;

import java.util.regex.*;

//creating a class to extract valid username
public class ValidateUsername {
    public static void main(String[] args) {
        String[] usernames = {
            "user_123",   // valid
            "123user",    // invalid
            "us",         // invalid
            "Valid_Name", // valid
            "toolongusername12345" // invalid
        };

        // Regex: start with letter, followed by letters/numbers/underscore, length 5–15
        String regex = "^[A-Za-z][A-Za-z0-9_]{4,14}$";
        Pattern pattern = Pattern.compile(regex);

        for (String username : usernames) {
            Matcher matcher = pattern.matcher(username);
            if (matcher.matches()) {
                System.out.println(username + "\" → Valid");
            } else {
                System.out.println(username + "\" → Invalid");
            }
        }
    }
}
