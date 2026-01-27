package com.collections.regex;

public class CensorWords {
    public static void main(String[] args) {
        String sentence = "This is a damn bad example with some stupid words.";

        // List of bad words to censor
        String[] badWords = {"damn", "stupid"};

        // Loop through bad words and replace them with ****
        for (String badWord : badWords) {
            sentence = sentence.replaceAll("(?i)\\b" + badWord + "\\b", "****");
        }

        System.out.println(sentence);
    }
}

