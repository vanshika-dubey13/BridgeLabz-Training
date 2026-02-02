package com.iostream.csv;

import java.io.* ;

public class ReadAndCountRows {

	public static void main(String[] args) {
		String filePath = "employees.csv";
        int count = 0;

        //counting number of rows in a CSV file
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            br.readLine();

            while ((line = br.readLine()) != null) {
                count++;
            }

            System.out.println("Number of records (excluding header): " + count);
        }
        catch (IOException e) {
            e.printStackTrace();
        }


	}

}
