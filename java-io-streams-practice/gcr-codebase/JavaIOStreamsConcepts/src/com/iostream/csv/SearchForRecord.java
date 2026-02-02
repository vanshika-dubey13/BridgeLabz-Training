package com.iostream.csv;

import java.io.* ;
import java.util.* ;

public class SearchForRecord {

	public static void main(String[] args) {
		String filePath = "employees.csv";
        Scanner sc = new Scanner(System.in);

        //taking user input for name to search in csv file
        System.out.print("Enter employee name to search: ");
        String searchName = sc.nextLine().trim(); 

        boolean found = false;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            br.readLine(); 

            while ((line = br.readLine()) != null) {
                String[] record = line.split(",");
                String name = record[1].trim(); 

                if (name.equalsIgnoreCase(searchName)) {
                    System.out.println("Department: " + record[2].trim() +
                                       ", Salary: " + record[3].trim());
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Employee not found.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

	}

}
