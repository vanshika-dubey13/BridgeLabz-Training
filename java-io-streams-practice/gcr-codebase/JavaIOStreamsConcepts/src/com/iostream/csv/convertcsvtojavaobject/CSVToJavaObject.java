package com.iostream.csv.convertcsvtojavaobject;


import java.util.* ;
import java.io.* ;

public class CSVToJavaObject {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//taking file path as user input and converting csv into java objects
        System.out.print("Enter the path for CSV file: ");
        String filePath = sc.nextLine();  

        List<Student> students = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");

                if (values.length < 4) continue;

                int id = Integer.parseInt(values[0].trim());
                String name = values[1].trim();
                int age = Integer.parseInt(values[2].trim());
                String department = values[3].trim();

                Student student = new Student(id, name, age, department);
                students.add(student);
            }
        } 
        catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        catch (NumberFormatException e) {
            System.out.println("Error parsing number: " + e.getMessage());
        }

        // Printing all students
        System.out.println("\n--- Student List ---");
        for (Student s : students) {
            System.out.println(s);
        }

	}
}
