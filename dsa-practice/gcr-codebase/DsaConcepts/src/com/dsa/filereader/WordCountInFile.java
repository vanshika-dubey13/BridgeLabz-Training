package com.dsa.filereader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCountInFile {

    public static void main(String[] args) {
    	
    	// Path to the file
        String filePath = "D:\\Java programming workspace\\dsa-practice\\gcr-codebase\\DsaConcepts\\src\\com\\dsa\\filereader\\CountWord.txt";   
        // Word to count
        String targetWord = "java";
        int count = 0;

        try (FileReader fr = new FileReader(filePath);
             BufferedReader br = new BufferedReader(fr)) {

            String line;

            while ((line = br.readLine()) != null) {
                // Splitting line into words (handles spaces and punctuation)
                String[] words = line.split("\\W+");

                for (String word : words) {
                    if (word.equalsIgnoreCase(targetWord)) {
                        count++;
                    }
                }
            }

            System.out.println("The word \"" + targetWord + "\" appears " + count + " times.");

        }
        catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
