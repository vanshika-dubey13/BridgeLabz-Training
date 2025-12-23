import java.util.Scanner;

public class AnagramCheck {

	// Method to check if two string are anagrams
    	public static boolean isAnagram(String str1, String str2) {

        	// Removing spaces and converting to lowercase
        	str1 = str1.replaceAll("\\s", "").toLowerCase();
        	str2 = str2.replaceAll("\\s", "").toLowerCase();

        	//If lengths are unequal, strings can't be anagrams
        	if (str1.length() != str2.length()) {
            		return false;
        	}

        	//Creating frequency arrays
        	int[] freq1 = new int[26];
        	int[] freq2 = new int[26];

        	//Finding frequency of characters
        	for (int i = 0; i < str1.length(); i++) {
            		freq1[str1.charAt(i) - 'a']++;
            		freq2[str2.charAt(i) - 'a']++;
        	}

        	//Comparing frequencies of both arrays
        	for (int i = 0; i < 26; i++) {
            		if (freq1[i] != freq2[i]) {
                	return false;
            		}
        	}

        	return true;
    	}

	public static void main(String[] args) {

        	Scanner sc = new Scanner(System.in);

        	System.out.print("Enter first string: ");
        	String str1 = sc.nextLine();
        	System.out.print("Enter second string: ");
        	String str2 = sc.nextLine();

        	if (isAnagram(str1, str2)) {
            		System.out.println("The given texts are Anagrams.");
        	}
		else {
            		System.out.println("The given texts are NOT Anagrams.");
        	}

        	sc.close();
    	}
}
