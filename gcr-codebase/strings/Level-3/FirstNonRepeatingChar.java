import java.util.Scanner;

public class FirstNonRepeatingChar {

	// Method to find the first non-repeating character
    	public static char findFirstNonRepeatingChar(String s) {
        	// Creating an array to store frequency of ASCII characters
        	int[] freq = new int[256];
        	//Count frequency of each character
        	for (int i = 0; i < s.length(); i++) {
            		char ch = s.charAt(i);
            		freq[ch]++;
        	}

		//Finding the first character with frequency 1
        	for (int i = 0; i < s.length(); i++) {
            		char ch = s.charAt(i);
            		if (freq[ch] == 1) {
                		return ch;
            		}
        	}

        	// If no non-repeating character is found
        	return '\0';
    	}

	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

        	// Taking user input
        	System.out.print("Enter a string: ");
        	String input = sc.nextLine();
        	char result = findFirstNonRepeatingChar(input);

        	// Displaying result
        	if (result != '\0') {
            		System.out.println("First non-repeating character: " + result);
        	} else {
            		System.out.println("No non-repeating character found.");
        	}

        	sc.close();
    	}
}
