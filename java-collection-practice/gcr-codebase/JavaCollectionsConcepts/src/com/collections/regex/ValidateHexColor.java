package com.collections.regex;

import java.util.regex.*;

//creating a class to validate hex color
public class ValidateHexColor {
    public static void main(String[] args) {
        String[] colors = {
            "#FFA500",   // valid
            "#ff4500",   // valid
            "#123",      // invalid
            "#GGGGGG",   // invalid
            "FFA500"     // invalid (missing #)
        };

        // Regex: starts with # followed by exactly 6 hex digits
        String regex = "^#[0-9A-Fa-f]{6}$";
        Pattern pattern = Pattern.compile(regex);

        for (String color : colors) {
            Matcher matcher = pattern.matcher(color);
            if (matcher.matches()) {
                System.out.println(color + "\" → Valid");
            } else {
                System.out.println(color + "\" → Invalid");
            }
        }
    }
}
