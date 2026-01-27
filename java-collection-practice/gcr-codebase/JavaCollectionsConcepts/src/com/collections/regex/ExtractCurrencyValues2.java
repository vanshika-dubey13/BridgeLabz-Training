package com.collections.regex;

import java.util.regex.*;
import java.util.*;

public class ExtractCurrencyValues2 {
    public static void main(String[] args) {
        String text = "The price is $45.99, and the discount is 10.50.";

        // Regex to capture currency values (with or without $)
        String regex = "\\$?\\d+(\\.\\d{1,2})?";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        List<String> values = new ArrayList<>();

        while (matcher.find()) {
            values.add(matcher.group());
        }

        // Print extracted values
        System.out.println(String.join(", ", values));
    }
}