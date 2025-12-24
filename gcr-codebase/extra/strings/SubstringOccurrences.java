import java.util.Scanner;

public class SubstringOccurrences {
    public static void main(String[] args) {
        	Scanner scanner = new Scanner(System.in);
        	System.out.println("Enter the main string:");
        	String str = scanner.nextLine();

        	// Input substring
        	System.out.println("Enter the substring to search:");
        	String substring = scanner.nextLine();
	
        	int count = 0;
        	int index = 0;

        	// Counting occurrences
        	while ((index = str.indexOf(substring, index)) != -1) {
            		count++;
            		index = index + substring.length();
        	}

        	// Displaying result
        	System.out.println("Number of occurrences: " + count);

        	scanner.close();
    	}
}
