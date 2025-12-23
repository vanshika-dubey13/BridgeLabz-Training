//Creating a class to find the bonus of 10 employees based on their years of service as well as the total bonus amount the 10-year-old company Zara has to pay as a bonus, along with the old and new salary.

import java.util.Scanner;

public class CharacterComparison {

	public static char[] getChars(String s) {
        	char[] chars = new char[text.length()];
       		for (int i = 0; i < s.length(); i++) {
            	chars[i] = s.charAt(i);
        	}
        	return chars;
    	}

	// Creating a method to compare two character arrays
    	public static boolean compareArrays(char[] arr1, char[] arr2) {
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
        	Scanner sc = new Scanner(System.in);

        	// Taking user input
        	System.out.print("Enter a string: ");
        	String str = sc.next();
        	char[] userDefinedArray = getChars(str);
        	char[] builtInArray = input.toCharArray();

        	// Comparing both arrays
        	boolean result = compareArrays(userDefinedArray, builtInArray);

        	// Display characters
        	System.out.print("Displaying characters using user-defined method: ");
        	for (char c : userDefinedArray) {
        	    System.out.print(c + " ");
        	}

        	System.out.print("\n Displaying characters using toCharArray(): ");
        	for (char c : builtInArray) {
        	    System.out.print(c + " ");
        	}

        	// Displaying comparison result
        	System.out.println("\n\nAre both character arrays equal? " + result);

        sc.close();
    	}
}
