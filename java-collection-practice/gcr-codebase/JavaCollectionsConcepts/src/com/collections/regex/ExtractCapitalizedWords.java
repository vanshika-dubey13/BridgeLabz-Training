package com.collections.regex;

import java.util.regex.*;
import java.util.*;

//creating a class to extract capital words
public class ExtractCapitalizedWords {
    public static void main(String[] args) {
    	
        String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
        // Regex: match words starting with uppercase letter
        String regex = "\\b[A-Z][a-zA-Z]*\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        List<String> capitalizedWords = new ArrayList<>();

        while (matcher.find()) {
            capitalizedWords.add(matcher.group());
        }

        // Printing extracted words
        System.out.println(String.join(", ", capitalizedWords));
    }
}