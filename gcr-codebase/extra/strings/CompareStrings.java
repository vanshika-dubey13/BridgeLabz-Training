import java.util.Scanner;

public class CompareStrings {
	public static void main(String[] args) {
        	Scanner scanner = new Scanner(System.in);

        	// Input strings
        	System.out.println("Enter first string:");
        	String s1 = scanner.nextLine();

        	System.out.println("Enter second string:");
        	String s2 = scanner.nextLine();

        	int minLength = Math.min(s1.length(), s2.length());
        	boolean areEqual = true;

        	// Compare character by character
        	for (int i = 0; i < minLength; i++) {
            		char c1 = s1.charAt(i);
            		char c2 = s2.charAt(i);

            		if (c1 < c2) {
                		System.out.println("\"" + s1 + "\" comes before \"" + s2 + "\" in lexicographical order");
                		areEqual = false;
                		break;
            		} else if (c1 > c2) {
                		System.out.println("\"" + s2 + "\" comes before \"" + s1 + "\" in lexicographical order");
                		areEqual = false;
                		break;
            		}
        	}

	// If all compared characters were equal
        	if (areEqual) {
            		if (s1.length() < s2.length()) {
                		System.out.println("\"" + s1 + "\" comes before \"" + s2 + "\" in lexicographical order");
            		} else if (s1.length() > s2.length()) {
                		System.out.println("\"" + s2 + "\" comes before \"" + s1 + "\" in lexicographical order");
            		} else {
                		System.out.println("Both strings are equal");
            		}
        	}

        	scanner.close();
    	}
}
