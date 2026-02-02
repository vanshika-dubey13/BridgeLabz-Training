package com.iostream.csv;

import java.io.* ;
import java.util.* ;
import java.util.regex.*;
public class ValidateCSV {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // taking user input for file path
        System.out.print("Enter CSV file path: ");
        String filePath = sc.nextLine().trim();

        // Regex for email validation and phone number
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        Pattern emailPattern = Pattern.compile(emailRegex);

        String phoneRegex = "^[0-9]{10}$";
        Pattern phonePattern = Pattern.compile(phoneRegex);

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            String header = br.readLine(); 
            System.out.println("Header: " + header);

            while ((line = br.readLine()) != null) {
                String[] record = line.split(",");

                if (record.length < 4) {
                    System.out.println("Invalid record (missing columns): " + line);
                    continue;
                }
                String id = record[0].trim();
                String name = record[1].trim();
                String email = record[2].trim();
                String phone = record[3].trim();

                boolean validEmail = emailPattern.matcher(email).matches();
                boolean validPhone = phonePattern.matcher(phone).matches();

                if (!validEmail || !validPhone) {
                    System.out.println(" Invalid record: ID=" + id + ", Name=" + name);
                    if (!validEmail) {
                        System.out.println("   Error: Invalid Email -> " + email);
                    }
                    if (!validPhone) {
                        System.out.println("   Error: Invalid Phone -> " + phone);
                    }
                } else {
                    System.out.println(" Valid record: ID=" + id + ", Name=" + name);
                }
            }
        } 
        catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

	}

}
