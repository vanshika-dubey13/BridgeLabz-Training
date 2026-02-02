package com.iostream.csv;

import java.io.* ;
import java.util.* ;

public class FilterRecordsInCSV {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		//taking user input CSV file path
		System.out.println("Enter the file path of CSV file : ") ;
		String filePath = sc.nextLine();

		//filtering record in a CSV file
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            br.readLine(); 

            while ((line = br.readLine()) != null) {
                String[] record = line.split(",");
                int marks = Integer.parseInt(record[3]);

                if (marks > 80) {
                    System.out.println("ID: " + record[0] +", Name: " + record[1] +", Age: " + record[2] + ", Marks: " + record[3]);
                }
            }
        } 
        catch (IOException e) {
            e.printStackTrace();
        }


	}

}
