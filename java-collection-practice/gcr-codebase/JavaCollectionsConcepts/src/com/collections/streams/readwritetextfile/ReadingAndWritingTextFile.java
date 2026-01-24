package com.collections.streams.readwritetextfile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadingAndWritingTextFile {
	//main method
    public static void main(String[] args) {
    	
    	//location to source and destination files
        String sourceFile = "D:\\Java programming workspace\\java-collection-practice\\gcr-codebase\\JavaCollectionsConcepts\\src\\com\\collections\\streams\\readwritetextfile\\Source.txt";
        String destinationFile = "D:\\Java programming workspace\\java-collection-practice\\gcr-codebase\\JavaCollectionsConcepts\\src\\com\\collections\\streams\\readwritetextfile\\Destination.txt";

        //using try with resource to ensure streams are closed automatically
        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destinationFile)) {

            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }

            System.out.println("File copied successfully.");

        } catch (FileNotFoundException e) {
            System.out.println("Source file does not exist.");
        } catch (IOException e) {
            System.out.println("An error occurred while reading or writing the file.");
            e.printStackTrace();
        }
    }
}
