package com.iostream.csv;

import java.io.* ;
import java.util.* ;

public class UpdateCSV {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		String inputFile = "employees.csv";
        String outputFile = "employees_updated.csv";

        //taking user input to take department name to increase salary
        System.out.print("Enter department name to increase salary by 10%: ");
        String deptInput = sc.nextLine().trim();

        List<String[]> records = new ArrayList<>();

        //accessing records and updating values in the record
        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            String line;
            String header = br.readLine();
            records.add(header.split(",")); 

            while ((line = br.readLine()) != null) {
                String[] record = line.split(",");
                String department = record[2].trim();
                double salary = Double.parseDouble(record[3].trim());

                // Increasing salary by 10% if department is IT
                if (department.equalsIgnoreCase("IT")) {
                    salary = salary * 1.10;
                    record[3] = String.valueOf((int) salary); 
                }

                records.add(record);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Write updated records to new CSV file
        try (FileWriter writer = new FileWriter(outputFile)) {
            for (String[] record : records) {
                writer.append(String.join(",", record));
                writer.append("\n");
            }
            System.out.println("Updated CSV file created: " + outputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }

	}

}
