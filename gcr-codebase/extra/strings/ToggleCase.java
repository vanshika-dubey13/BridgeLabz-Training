import java.util.Scanner;

public class ToggleCase {
	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

        	// Input string
        	System.out.println("Enter a string:");
        	String str = scanner.nextLine();

        	StringBuilder result = new StringBuilder();

        	// Toggle case
        	for (int i = 0; i < str.length(); i++) {
            		char ch = str.charAt(i);

            		if (Character.isUpperCase(ch)) {
                		result.append(Character.toLowerCase(ch));
            		} else if (Character.isLowerCase(ch)) {
                		result.append(Character.toUpperCase(ch));
            		} else {
                		result.append(ch); // non-alphabet characters
            		}
        	}

        	// Displaying result
        		System.out.println("Toggled string: " + result.toString());

        		sc.close();
    	}
}
