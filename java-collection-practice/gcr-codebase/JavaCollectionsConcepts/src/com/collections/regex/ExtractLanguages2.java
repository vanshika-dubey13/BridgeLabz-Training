package com.collections.regex;

import java.util.regex.*;
import java.util.*;

//creating a class to extract languages
public class ExtractLanguages2 {
    public static void main(String[] args) {
        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";

        // Regex pattern for common programming languages
        String regex = "\\b(Java|Python|JavaScript|Go|C\\+\\+|C#|C|Ruby|PHP|Swift|Kotlin|Rust|Perl|Scala)\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        List<String> languages = new ArrayList<>();

        while (matcher.find()) {
            languages.add(matcher.group());
        }

        // Print extracted languages
        System.out.println(String.join(", ", languages));
    }
}