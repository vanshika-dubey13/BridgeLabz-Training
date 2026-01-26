package com.collections.map;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordFrequencyCounter {

	//main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file path: ");
        String filePath = sc.nextLine();

        Map<String, Integer> frequencyMap = new HashMap<>();

        try {
            Scanner fileScanner = new Scanner(new File(filePath));

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();

                // Remove punctuation and convert to lowercase
                line = line.replaceAll("[^a-zA-Z0-9\\s]", "").toLowerCase();

                String[] words = line.split("\\s+"); // split by whitespace

                for (String word : words) {
                    if (!word.isEmpty()) {
                        frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
                    }
                }
            }

            fileScanner.close();

            // Display word frequencies
            System.out.println("\nWord Frequencies:");
            for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
                System.out.println(entry.getKey() + " = " + entry.getValue());
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filePath);
        }

        sc.close();
    }
}
