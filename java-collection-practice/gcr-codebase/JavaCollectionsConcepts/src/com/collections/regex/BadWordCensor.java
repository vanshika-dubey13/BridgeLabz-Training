package com.collections.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class BadWordCensor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();

        // List of bad words
        String[] badWords = {"damn", "stupid"};

        // Build regex pattern dynamically
        StringBuilder patternBuilder = new StringBuilder();
        for (int i = 0; i < badWords.length; i++) {
            patternBuilder.append(badWords[i]);
            if (i < badWords.length - 1) {
                patternBuilder.append("|");
            }
        }

        String regex = "(?i)\\b(" + patternBuilder.toString() + ")\\b";

        // Replace bad words with ****
        String censored = sentence.replaceAll(regex, "****");

        System.out.println("\nCensored Sentence:");
        System.out.println(censored);

        sc.close();
    }
}

