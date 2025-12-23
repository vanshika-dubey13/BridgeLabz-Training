import java.util.Scanner;

public class PalindromeCheck {

	// Logic 1: Iterative comparison using start and end index
    	public static boolean isPalindromeIterative(String s) {
        	int start = 0;
        	int end = s.length() - 1;
        	while (start < end) {
            		if (s.charAt(start) != s.charAt(end)) {
                		return false;
            		}
            		start++;
            		end--;
        	}
        return true;
    	}

	// Logic 2: Recursive palindrome check
    	public static boolean isPalindromeRecursive(String text, int start, int end) {
        	// Base condition
        	if (start >= end) {
            	return true;
        	}

        	// If characters do not match
        	if (text.charAt(start) != text.charAt(end)) {
            		return false;
        	}

        	// Recursive call
        	return isPalindromeRecursive(text, start + 1, end - 1);
    	}

	// Method to reverse a string using charAt()
    	public static char[] reverseString(String text) {
        	char[] reverse = new char[text.length()];
        	int index = 0;

        	for (int i = text.length() - 1; i >= 0; i--) {
            		reverse[index++] = text.charAt(i);
        	}
        	return reverse;
    	}

	// Logic 3: Palindrome check using character arrays
    	public static boolean isPalindromeUsingCharArray(String s) {
        	char[] original = s.toCharArray();
        	char[] reverse = reverseString(s);

        	for (int i = 0; i < original.length; i++) {
            		if (original[i] != reverse[i]) {
                	return false;
            		}
        	}
        	return true;
    	}

	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

        	System.out.print("Enter text to check palindrome: ");
        	String s = sc.nextLine();

        	// Logic 1 result
        	System.out.println("Logic 1 (Iterative): " + 
            	(isPalindromeIterative(s) ? "Palindrome" : "Not Palindrome"));
        	// Logic 2 result
        	System.out.println("Logic 2 (Recursive): " + 
            	(isPalindromeRecursive(s, 0, s.length() - 1) ? "Palindrome" : "Not	Palindrome"));
        	// Logic 3 result
        	System.out.println("Logic 3 (Char Array): " + 
            	(isPalindromeUsingCharArray(s) ? "Palindrome" : "Not Palindrome"));

        	sc.close();
    	}
}
