package com.iostream.csv;

import java.io.*;

public class WriteCSV {

	public static void main(String[] args) {
		String filePath = "employees.csv";  

		//writing into a csv file
        try (FileWriter writer = new FileWriter(filePath)) {
           
            writer.append("ID,Name,Department,Salary\n");

            
            writer.append("1,Anil,HR,50000\n");
            writer.append("2,Rahul,IT,60000\n");
            writer.append("3,Meena,Finance,55000\n");
            writer.append("4,Arjun,Marketing,52000\n");
            writer.append("5,Sneha,Operations,58000\n");

            System.out.println("CSV file created successfully: " + filePath);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
	}
}