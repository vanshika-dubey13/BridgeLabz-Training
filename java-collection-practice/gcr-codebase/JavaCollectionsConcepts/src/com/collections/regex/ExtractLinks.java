package com.collections.regex;

import java.util.regex.*;
import java.util.*;

//creating a class to extract link
public class ExtractLinks {
    public static void main(String[] args) {
        String text = "Visit https://www.google.com and http://example.org for more info.";

        // Regular expression for URLs
        String urlRegex = "(https?://\\S+)";  
        // Compile the pattern
        Pattern pattern = Pattern.compile(urlRegex);
        Matcher matcher = pattern.matcher(text);
        List<String> links = new ArrayList<>();

        // Find all matches
        while (matcher.find()) {
            links.add(matcher.group());
        }

        // Print output as comma-separated
        System.out.println(String.join(", ", links));
    }
}

