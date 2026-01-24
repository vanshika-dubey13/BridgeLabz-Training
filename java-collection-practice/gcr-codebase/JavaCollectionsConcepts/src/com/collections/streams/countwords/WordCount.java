package com.collections.streams.countwords;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class WordCount {

	//main method
    public static void main(String[] args) {

    	//attribute
        HashMap<String, Integer> wordCount = new HashMap<>();

        try {
            FileReader fr = new FileReader("student.dat");
            BufferedReader br = new BufferedReader(fr);

            String line;

            while ((line = br.readLine()) != null) {
                // Convert to lowercase and split words
                String[] words = line.toLowerCase().split("\\W+");

                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                    }
                }
            }

            br.close();

            // Convert map to list for sorting
            List<Map.Entry<String, Integer>> list = new ArrayList<>(wordCount.entrySet());

            // Sort by frequency (descending)
            list.sort((a, b) -> b.getValue().compareTo(a.getValue()));

            // displaying top 5 words
            System.out.println("Top 5 most frequent words are :");
            for (int i = 0; i < Math.min(5, list.size()); i++) {
                System.out.println(list.get(i).getKey() + " : " + list.get(i).getValue());
            }

        }
        
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}

