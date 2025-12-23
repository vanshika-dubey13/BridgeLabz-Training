import java.util.Scanner;

public class VowelConsonantCount2 {

	// Method to check if a character is Vowel, Consonant, or Not a Letter
    	public static String checkCharacterType(char ch) {
        	// Convert uppercase to lowercase using ASCII values
        	if (ch >= 'A' && ch <= 'Z') {
            	ch = (char) (ch + 32);
        	}

        	// Check if character is a letter
        	if (ch >= 'a' && ch <= 'z') {
            	// Check for vowels
            		if (ch == 'a' || ch == 'e' || ch == 'i' ||ch == 'o' || ch == 'u') {
                	return "Vowel";
            		}
			else {
                		return "Consonant";
            		}
        	}
		else {
            		return "Not a Letter";
        	}
    	}

	// Method to find vowels and consonants in a string
    	public static String[][] findVowelsAndConsonants(String s) {
        	int length = s.length();
        	String[][] result = new String[length][2];

        	for (int i = 0; i < length; i++) {
            		char ch = s.charAt(i);
            		result[i][0] = String.valueOf(ch);
            		result[i][1] = checkCharacterType(ch);
        	}

        	return result;
    	}

	// Method to display the 2D array in tabular format
		public static void displayResult(String[][] data) {
        		System.out.println("\nCharacter\tType");
        		System.out.println("-------------------------");

        	for (int i = 0; i < data.length; i++) {
            		System.out.println(data[i][0] + "\t\t" + data[i][1]);
        	}
    	}

	// Main method
    	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

        	System.out.print("Enter a string: ");
        	String s = sc.nextLine();

        	String[][] result = findVowelsAndConsonants(s);
        	displayResult(result);

        	sc.close();
    	}
}
