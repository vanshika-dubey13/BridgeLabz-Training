package com.collections.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//creating a class to extract programming languages
public class ProgrammingLanguageExtractor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a text containing programming languages:");
        String text = sc.nextLine();
        text.toLowerCase();
        // List of programming languages to look for
        String[] languages = {"Java", "Python", "JavaScript", "Go", "C", "C++", "Ruby", "PHP", "Swift"};

        // Build regex pattern dynamically
        StringBuilder patternBuilder = new StringBuilder();
        for (int i = 0; i < languages.length; i++) {
            patternBuilder.append(languages[i]);
            if (i < languages.length - 1) {
                patternBuilder.append("|");
            }
        }
        String regex = "\\b(" + patternBuilder.toString() + ")\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("\nProgramming Languages Found:");
        boolean found = false;
        while (matcher.find()) {
            System.out.print(matcher.group() + " ");
            found = true;
        }

        if (!found) {
            System.out.println("No programming languages found.");
        }

        sc.close();
    }
}

