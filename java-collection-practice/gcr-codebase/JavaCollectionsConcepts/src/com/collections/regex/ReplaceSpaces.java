package com.collections.regex;

//creating a class to reduce spaces
public class ReplaceSpaces {
	
    public static void main(String[] args) {
        String text = "This   is   an   example   with   multiple   spaces.";

        // Replacing multiple spaces with a single space
        String modifiedText = text.replaceAll("\\s+", " ");

        System.out.println(modifiedText);
    }
}

