import java.util.Scanner;

public class VowelConsonantCount {

	// Method to check whether a character is Vowel, Consonant, or Not a Letter
    	public static String checkChar(char ch) {

        	// Converting uppercase to lowercase using ASCII values
        	if (ch >= 'A' && ch <= 'Z') {
            		ch = (char)(ch + 32);
        	}

        	// Checking if character is a letter
        	if (ch >= 'a' && ch <= 'z') {

            		// Checking for vowels
            		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                		return "Vowel";
            		}
			else {
                		return "Consonant";
            		}
        	}

        	return "Not a Letter";
    	}

	// Method to count vowels and consonants in a string
    	public static int[] countVowelsConsonants(String s) {

        	int vowels = 0;
        	int consonants = 0;

        	for (int i = 0; i < s.length(); i++) {
            		char ch = s.charAt(i);
            		String result = checkChar(ch);

            		if (result.equals("Vowel")) {
                		vowels++;
            		}
			else if (result.equals("Consonant")) {
                		consonants++;
            		}
        	}

        	return new int[]{vowels, consonants};
    	}


	public static void main(String[] args) {

        	Scanner sc = new Scanner(System.in);

        	System.out.print("Enter a string: ");
        	String s = sc.nextLine();

        	int[] count = countVowelsConsonants(s);

        	System.out.println("Number of Vowels: " + count[0]);
        	System.out.println("Number of Consonants: " + count[1]);
		
        	sc.close();
    	}
}
