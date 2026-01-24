package com.collections.streams.readlargefile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLargeFile {

    public static void main(String[] args) {

        String filePath = "D:\\Java programming workspace\\java-collection-practice\\gcr-codebase\\JavaCollectionsConcepts\\src\\com\\collections\\streams\\readlargefile\\largefile.txt";
        try {
            FileReader fr = new FileReader(filePath);
            BufferedReader br = new BufferedReader(fr);

            String line;

            while ((line = br.readLine()) != null) {
                // Case-insensitive checks for "error"
                if (line.toLowerCase().contains("error")) {
                    System.out.println(line);
                }
            }

            br.close();

        }
        
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}

