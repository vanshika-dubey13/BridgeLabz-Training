package com.collections.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.HashSet;

//creating a class to find repeated words
public class RepeatingWordsFinder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();
        // Regex to find consecutive repeating words (case-insensitive)
        String regex = "\\b(\\w+)\\b\\s+\\1\\b";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(sentence);
        HashSet<String> repeatingWords = new HashSet<>();

        while (matcher.find()) {
            repeatingWords.add(matcher.group(1));
        }

        if (repeatingWords.isEmpty()) {
            System.out.println("\nNo repeating words found.");
        } else {
            System.out.println("\nRepeating Words:");
            for (String word : repeatingWords) {
                System.out.print(word + " ");
            }
        }

        sc.close();
    }
}

