package com.collections.regex;

import java.util.regex.*;

//creating a class to validate SSN
public class ValidateSSN {
    public static void main(String[] args) {
        String[] inputs = {
            "My SSN is 123-45-6789.",
            "My SSN is 123456789."
        };

        // Regex for SSN format: ###-##-####
        String regex = "\\b\\d{3}-\\d{2}-\\d{4}\\b";
        Pattern pattern = Pattern.compile(regex);

        for (String text : inputs) {
            Matcher matcher = pattern.matcher(text);
            if (matcher.find()) {
                System.out.println( matcher.group() + "\" is valid");
            } else {
                System.out.println(text.replaceAll(".*?(\\d+).*", "$1") + "\" is invalid");
            }
        }
    }
}
