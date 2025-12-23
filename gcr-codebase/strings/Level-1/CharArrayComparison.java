import java.util.Scanner;

public class CharArrayComparison {

	// User-defined method to return characters without using toCharArray()
	public static char[] getCharManually(String s) {
		char[] chars = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			chars[i] = s.charAt(i);
		}

		return chars;
	}

	// Method to compare two char arrays
	public static boolean compareCharArrays(char[] arr1, char[] arr2) {
		if (arr1.length != arr2.length) {
			return false;
		}

		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[i]) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// User input
		System.out.println("Enter a string:");
		String str = scanner.next();

		// Get characters using user-defined method
		char[] manualChars = getCharManually(str);
		// Get characters using built-in method
		char[] builtInChars = str.toCharArray();
		boolean areEqual = compareCharArrays(manualChars, builtInChars);

		// Displaying results
		System.out.println("Characters using user-defined method:");
		for (char c : manualChars) {
			System.out.print(c + " ");
		}
		System.out.println("\nCharacters using toCharArray():");
		for (char c : builtInChars) {
			System.out.print(c + " ");
		}
		System.out.println("\nAre both character arrays equal? " + areEqual);
		scanner.close();
	}
}
