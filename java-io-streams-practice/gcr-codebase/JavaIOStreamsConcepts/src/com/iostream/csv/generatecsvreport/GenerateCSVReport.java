package com.iostream.csv.generatecsvreport;

import java.io.* ;
import java.util.* ;

public class GenerateCSVReport {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//taking filepath as user input 
        System.out.print("Enter the path for employees.csv file: ");
        String filePath = sc.nextLine();

        List<Employee> employees = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                int id = Integer.parseInt(values[0].trim());
                String name = values[1].trim();
                String department = values[2].trim();
                double salary = Double.parseDouble(values[3].trim());

                Employee emp = new Employee(id, name, department, salary);
                employees.add(emp);
            }
        } 
        catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        // Printing report
        System.out.println("\n--- Employee Report ---");
        for (Employee emp : employees) {
            System.out.println(emp);
        }


	}

}
