package com.iostream.csv.mergecsv;

import java.io.* ;
import java.util.* ;

public class MergeCSV {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//taking filepaths as user input
        System.out.print("Enter path for students1.csv: ");
        String file1 = sc.nextLine();

        System.out.print("Enter path for students2.csv: ");
        String file2 = sc.nextLine();

        System.out.print("Enter path for merged output file: ");
        String outputFile = sc.nextLine();

        Map<Integer, String[]> studentInfo = new HashMap<>(); 
        Map<Integer, String[]> studentMarks = new HashMap<>(); 

        // Read students1.csv
        try (BufferedReader br = new BufferedReader(new FileReader(file1))) {
            String line = br.readLine(); // skip header
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                int id = Integer.parseInt(values[0].trim());
                String name = values[1].trim();
                String age = values[2].trim();
                studentInfo.put(id, new String[]{name, age});
            }
        } catch (IOException e) {
            System.out.println("Error reading file1: " + e.getMessage());
        }


        // Read students2.csv
        try (BufferedReader br = new BufferedReader(new FileReader(file2))) {
            String line = br.readLine(); // skip header
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                int id = Integer.parseInt(values[0].trim());
                String marks = values[1].trim();
                String grade = values[2].trim();
                studentMarks.put(id, new String[]{marks, grade});
            }
        } catch (IOException e) {
            System.out.println("Error reading file2: " + e.getMessage());
        }

        List<Student> students = new ArrayList<>();

        // Merge based on ID
        for (Integer id : studentInfo.keySet()) {
            if (studentMarks.containsKey(id)) {
                String[] info = studentInfo.get(id);
                String[] marks = studentMarks.get(id);

                Student s = new Student(
                        id,
                        info[0],
                        Integer.parseInt(info[1]),
                        Integer.parseInt(marks[0]),
                        marks[1]
                );
                students.add(s);
            }
        }

        // Write merged file
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {
            bw.write("ID,Name,Age,Marks,Grade");
            bw.newLine();
            for (Student s : students) {
                bw.write(s.getId() + "," + s.getName() + "," + s.getAge() + "," +
                         s.getMarks() + "," + s.getGrade());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error writing merged file: " + e.getMessage());
        }

        // Print merged students
        System.out.println("\n--- Merged Student List ---");
        for (Student s : students) {
            System.out.println(s);
        }
	}
}
