package com.collections.regex;

import java.util.regex.*;
import java.util.*;

//creating a class to extract link
public class ExtractLinks2 {
    public static void main(String[] args) {
        String text = "Visit https://www.google.com and http://example.org for more info.";

        // Regex for URLs (http or https)
        String regex = "(https?://[\\w.-]+(?:\\.[\\w.-]+)+(?:/[\\w._%+-]*)*)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        List<String> links = new ArrayList<>();

        while (matcher.find()) {
            links.add(matcher.group());
        }

        // Print extracted links
        System.out.println(String.join(", ", links));
    }
}
