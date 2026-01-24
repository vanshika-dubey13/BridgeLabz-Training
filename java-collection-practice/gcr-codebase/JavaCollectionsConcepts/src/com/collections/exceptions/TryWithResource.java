package com.collections.exceptions;

import java.io.*;

public class TryWithResource {

	//main method
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("D:\\Java programming workspace\\java-collection-practice\\gcr-codebase\\JavaCollectionsConcepts\\src\\com\\collections\\exceptions\\data.txt"))) {
            String firstLine = br.readLine();
            if (firstLine != null) {
                System.out.println(firstLine);
            }
        } 
        catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}