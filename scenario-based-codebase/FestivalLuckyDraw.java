import java.util.Scanner;

public class FestivalLuckyDraw {
	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);
        	System.out.println("\nWelcome to the Diwali Festival Lucky Draw!");

        	while (true) {
            	System.out.print("\nEnter the number drawn by the visitor (or type 'exit' to quit): ");
		//taking number from user
            	String input = sc.nextLine();

            	// Exit condition
            	if (input.equalsIgnoreCase("exit")) {
                	System.out.println("\nThank you for participating!");
                	break;
            	}

            	int number;
            	// checking if input entered by user is invalid
            	try {
                	number = Integer.parseInt(input);
            	} catch (NumberFormatException e) {
                	System.out.println("\nInvalid input! Please enter a valid number.");
			// Skip invalid input
                	continue;             	}

            		// Checking if number is divisible by 3 and 5
            		if (number % 3 == 0 && number % 5 == 0) {
                		System.out.println("\nCongratulations! Visitor wins a gift!");
            		} else {
                		System.out.println("\nBetter luck next time!");
            		}
        	}

        	sc.close();
    	}
}
