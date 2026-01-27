package com.collections.regex;

import java.util.*;
import java.util.regex.*;

//creating a class to find repeating words
public class FindRepeatingWords {
	
    public static void main(String[] args) {
        String text = "This is is a repeated repeated word test.";

        // Regex to capture consecutive repeating words
        String regex = "\\b(\\w+)\\b\\s+\\1\\b";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);
        Set<String> repeatingWords = new LinkedHashSet<>();

        while (matcher.find()) {
            repeatingWords.add(matcher.group(1));
        }

        // Print repeating words
        System.out.println(String.join(", ", repeatingWords));
    }
}
