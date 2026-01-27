package com.collections.regex;

//creating a class to reduce spaces
public class ReplaceSpaces2 {
	
    public static void main(String[] args) {
        String text = "This   is   an   example   with   multiple   spaces.";

        // Replacing multiple spaces with a single space
        String result = text.replaceAll("\\s+", " ");

        System.out.println(result);
    }
}
