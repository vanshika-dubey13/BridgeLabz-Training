package com.collections.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CapitalizedWordsExtractor2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();
        // Regex to match capitalized words
        String regex = "\\b[A-Z][a-z]*\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(sentence);

        System.out.println("\nCapitalized Words Found:");
        boolean foundCapital = false;
        while (matcher.find()) {
            System.out.print(matcher.group() + " ");
            foundCapital = true;
        }

        if (!foundCapital) {
            System.out.println("No capitalized words found.");
        }

        sc.close();
    }
}

