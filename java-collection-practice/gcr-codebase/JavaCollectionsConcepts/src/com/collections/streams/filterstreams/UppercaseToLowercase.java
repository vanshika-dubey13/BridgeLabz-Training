package com.collections.streams.filterstreams;

import java.io.*;

public class UppercaseToLowercase {
    public static void main(String[] args) {

        String sourceFile = "D:\\Java programming workspace\\java-collection-practice\\gcr-codebase\\JavaCollectionsConcepts\\src\\com\\collections\\streams\\filterstreams\\input.txt";
        String destinationFile = "D:\\Java programming workspace\\java-collection-practice\\gcr-codebase\\JavaCollectionsConcepts\\src\\com\\collections\\streams\\filterstreams\\output.txt";

        // Using UTF-8 to handle character encoding properly
        try (
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(sourceFile), "UTF-8"));

            BufferedWriter writer = new BufferedWriter(
                    new OutputStreamWriter(
                            new FileOutputStream(destinationFile), "UTF-8"))
        ) {

            int ch;
            while ((ch = reader.read()) != -1) {
                writer.write(Character.toLowerCase((char) ch));
            }

            System.out.println("File converted from uppercase to lowercase successfully.");

        } catch (IOException e) {
            System.out.println("Error while processing the file.");
            e.printStackTrace();
        }
    }
}

