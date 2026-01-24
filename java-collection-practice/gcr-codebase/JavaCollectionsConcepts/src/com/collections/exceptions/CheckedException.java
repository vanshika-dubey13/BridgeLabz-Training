package com.collections.exceptions;

import java.io.*;

//creating a class to demonstrate custom exception
public class CheckedException {

	//main method
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("D:\\Java programming workspace\\java-collection-practice\\gcr-codebase\\JavaCollectionsConcepts\\src\\com\\collections\\exceptions\\data.txt"));
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();

        }
        catch (IOException e) {
            System.out.println("File not found");
        }
    }
}

