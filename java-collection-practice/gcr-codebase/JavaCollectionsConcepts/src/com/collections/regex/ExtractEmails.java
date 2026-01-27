package com.collections.regex;

import java.util.regex.*;
import java.util.*;

//creating a class to extract emails
public class ExtractEmails {
    public static void main(String[] args) {
        String text = "Contact us at support@example.com and info@company.org";

        // Regex for email addresses
        String regex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        List<String> emails = new ArrayList<>();

        while (matcher.find()) {
            emails.add(matcher.group());
        }

        // Print extracted emails
        for (String email : emails) {
            System.out.println(email);
        }
    }
}
