//Creating a class to calculate library fine.

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LibraryFineCalculator {
	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);
	
		//Taking the date as input in the format yyyy-mm-dd
        	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd"); 
        	int totalBooks = 5;
        	int finePerDay = 5;

        	for (int i = 1; i <= totalBooks; i++) {
            		System.out.println("Book " + i + ":");

            		// Taking due date
            		System.out.print("Enter due date (yyyy-MM-dd): ");
            		String dueDateStr = sc.nextLine();
            		LocalDate dueDate = LocalDate.parse(dueDateStr, formatter);

            		// Taking return date
            		System.out.print("Enter return date (yyyy-MM-dd): ");
            		String returnDateStr = sc.nextLine();
            		LocalDate returnDate = LocalDate.parse(returnDateStr, formatter);

            		// Calculating fine
            		long daysLate = ChronoUnit.DAYS.between(dueDate, returnDate);
            		if (daysLate > 0) {
                		long fine = daysLate * finePerDay;
                		System.out.println("Book returned late by " + daysLate + " days. Fine: Rs. " + fine);
            		} else {
                		System.out.println("Book returned on time. No fine!");
            		}
            		System.out.println("----------------------------");
        	}

        	sc.close();
    	}
}
