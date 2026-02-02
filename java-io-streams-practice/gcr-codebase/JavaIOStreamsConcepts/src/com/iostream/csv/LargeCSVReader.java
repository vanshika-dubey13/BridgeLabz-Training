package com.iostream.csv;

import java.io.* ;
import java.util.* ;

public class LargeCSVReader {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//taking filepath as user input and processing it in batches
        System.out.print("Enter the path for CSV file: ");
        String filePath = sc.nextLine();

        int batchSize = 100;   
        int totalCount = 0;    

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            List<String> batch = new ArrayList<>();

            String header = br.readLine();
            System.out.println("Header: " + header);

            while ((line = br.readLine()) != null) {
                batch.add(line);

                if (batch.size() == batchSize) {
                    
                    processBatch(batch);
                    totalCount += batch.size();
                    System.out.println("Processed records so far: " + totalCount);

                    batch.clear();
                }
            }

            if (!batch.isEmpty()) {
                processBatch(batch);
                totalCount += batch.size();
                System.out.println("Processed records so far: " + totalCount);
            }

            System.out.println("\nFinished processing. Total records: " + totalCount);

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    // Example batch processor
    private static void processBatch(List<String> batch) {
        
        System.out.println("Processing batch of size " + batch.size() +
                           " | First row: " + batch.get(0));
    }


	

}
