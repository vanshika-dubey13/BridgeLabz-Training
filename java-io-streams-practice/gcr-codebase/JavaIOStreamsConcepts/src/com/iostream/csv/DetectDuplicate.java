package com.iostream.csv;

import java.io.* ;
import java.util.* ;

public class DetectDuplicate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//taking filepath as user input
        System.out.print("Enter the path for CSV file: ");
        String filePath = sc.nextLine();

        Map<String, List<String>> recordMap = new HashMap<>();
        List<String> duplicates = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            String header = br.readLine();

            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                String id = values[0].trim();

                // If ID already exists, mark as duplicate
                if (recordMap.containsKey(id)) {
                    duplicates.add(line);
                } else {
                    recordMap.put(id, Arrays.asList(values));
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        // Printing  duplicates
        System.out.println("\n--- Duplicate Records ---");
        if (duplicates.isEmpty()) {
            System.out.println("No duplicates found.");
        }
        else {
            for (String dup : duplicates) {
                System.out.println(dup);
            }
        }


	}

}
