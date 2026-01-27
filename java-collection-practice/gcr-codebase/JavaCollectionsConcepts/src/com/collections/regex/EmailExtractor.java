package com.collections.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//creating a class to extract email
public class EmailExtractor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a text to extract emails:");
        String text = sc.nextLine();
        String regex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("\nExtracted Email Addresses:");
        boolean found = false;
        while (matcher.find()) {
            System.out.println(matcher.group());
            found = true;
        }

        if (!found) {
            System.out.println("No email addresses found.");
        }

        sc.close();
    }
}

