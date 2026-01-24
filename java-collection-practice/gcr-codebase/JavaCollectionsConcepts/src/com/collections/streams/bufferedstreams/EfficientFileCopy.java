package com.collections.streams.bufferedstreams;

import java.io.*;

public class EfficientFileCopy {

    private static final int BUFFER_SIZE = 4096; 

    //main method
    public static void main(String[] args) {
        String sourceFile = "D:\\Java programming workspace\\java-collection-practice\\gcr-codebase\\JavaCollectionsConcepts\\src\\com\\collections\\streams\\bufferedstreams\\largefile.dat";   
        String unbufferedDest = "D:\\Java programming workspace\\java-collection-practice\\gcr-codebase\\JavaCollectionsConcepts\\src\\com\\collections\\streams\\bufferedstreams\\copy_unbuffered.dat";
        String bufferedDest = "D:\\Java programming workspace\\java-collection-practice\\gcr-codebase\\JavaCollectionsConcepts\\src\\com\\collections\\streams\\bufferedstreams//copy_buffered.dat";

        //copying files
        copyUsingUnbufferedStreams(sourceFile, unbufferedDest);
        copyUsingBufferedStreams(sourceFile, bufferedDest);
    }

    //Unbuffered Streams
    private static void copyUsingUnbufferedStreams(String source, String dest) {
        long startTime = System.nanoTime();

        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(dest)) {

            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            long endTime = System.nanoTime();
            System.out.println("Unbuffered copy time: " +
                    (endTime - startTime) / 1_000_000 + " ms");

        } catch (IOException e) {
            System.out.println("Error during unbuffered file copy.");
            e.printStackTrace();
        }
    }

    // Buffered Streams
    private static void copyUsingBufferedStreams(String source, String dest) {
        long startTime = System.nanoTime();

        try (BufferedInputStream bis =
                     new BufferedInputStream(new FileInputStream(source));
             BufferedOutputStream bos =
                     new BufferedOutputStream(new FileOutputStream(dest))) {

            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;

            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }

            long endTime = System.nanoTime();
            System.out.println("Buffered copy time: " +
                    (endTime - startTime) / 1_000_000 + " ms");

        } catch (IOException e) {
            System.out.println("Error during buffered file copy.");
            e.printStackTrace();
        }
    }
}

