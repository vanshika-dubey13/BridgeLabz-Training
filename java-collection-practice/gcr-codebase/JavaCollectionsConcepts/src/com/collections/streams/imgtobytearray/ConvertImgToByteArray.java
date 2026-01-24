package com.collections.streams.imgtobytearray;

import java.io.*;

public class ConvertImgToByteArray {

	//main method
    public static void main(String[] args) {

        String sourceImage = "D:\\Java programming workspace\\java-collection-practice\\gcr-codebase\\JavaCollectionsConcepts\\src\\com\\collections\\streams\\imgtobytearray\\original.jpg";
        String outputImage = "D:\\Java programming workspace\\java-collection-practice\\gcr-codebase\\JavaCollectionsConcepts\\src\\com\\collections\\streams\\imgtobytearray\\copy.jpg";

        try {
            // Step 1: Read image into byte array using ByteArrayOutputStream
            FileInputStream fis = new FileInputStream(sourceImage);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();

            byte[] buffer = new byte[4096];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }

            byte[] imageBytes = baos.toByteArray();

            fis.close();
            baos.close();

            // Step 2: Write byte array back to image using ByteArrayInputStream
            ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
            FileOutputStream fos = new FileOutputStream(outputImage);

            while ((bytesRead = bais.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            bais.close();
            fos.close();

            System.out.println("Image converted to byte array and written successfully.");

            // Step 3: Verify file sizes
            File original = new File(sourceImage);
            File copy = new File(outputImage);

            if (original.length() == copy.length()) {
                System.out.println("Verification successful: Files are identical in size.");
            } else {
                System.out.println("Verification failed: Files differ.");
            }

        } catch (IOException e) {
            System.out.println("Error processing image file.");
            e.printStackTrace();
        }
    }
}

