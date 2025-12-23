import java.util.Scanner;

public class FrequencyOfCharacters2 {

	// Method to find unique characters using nested loops
    	public static char[] findUniqueCharacters(String s) {
        	String unique = "";
        	for (int i = 0; i < s.length(); i++) {
            		char ch = s.charAt(i);
            		boolean isUnique = true;
            		for (int j = 0; j < unique.length(); j++) {
                		if (ch == unique.charAt(j)) {
                    			isUnique = false;
                    			break;
                		}
            		}
            		if (isUnique) {
                		unique += ch;
            		}
        	}

		// Converting String to char array
        	char[] uniqueChars = new char[unique.length()];
        	for (int i = 0; i < unique.length(); i++) {
			uniqueChars[i] = unique.charAt(i);
        	}
        	return uniqueChars;
    	}

	// Method to find frequency of characters and return 2D array
    	public static String[][] characterFrequency2D(String s) {
        	int[] frequency = new int[256];
        	// Counting frequency using ASCII values
        	for (int i = 0; i < s.length(); i++) {
            		frequency[s.charAt(i)]++;
        	}

        	// Getting unique characters
        	char[] uniqueChars = findUniqueCharacters(s);

        	// Creating 2D array to store character and frequency
        	String[][] result = new String[uniqueChars.length][2];
        	for (int i = 0; i < uniqueChars.length; i++) {
            		char ch = uniqueChars[i];
            		result[i][0] = String.valueOf(ch);
            		result[i][1] = String.valueOf(frequency[ch]);
        	}
        	return result;
    	}

	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

        	System.out.print("Enter a string: ");
        	String text = sc.nextLine();
        	String[][] output = characterFrequency2D(text);
        	System.out.println("\nCharacter Frequency:");
        	System.out.println("--------------------");
        	for (int i = 0; i < output.length; i++) {
            		System.out.println(output[i][0] + " : " + output[i][1]);
        	}

        	sc.close();
    	}
}
