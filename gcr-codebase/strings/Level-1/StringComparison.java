import java.util.Scanner;

public class StringComparison {

    // Method to compare two strings using charAt()
	public static boolean compare(String s1, String s2) {
        	// If lengths are different, strings are not equal
        	if (s1.length() != s2.length()) {
            	return false;
        	}
        	// Comparing each character
        	for (int i = 0; i < s1.length(); i++) {
            		if (s1.charAt(i) != s2.charAt(i)) {
                	return false;
            		}
        	}
        	return true; 
    	}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Take user input
        System.out.print("Enter first string: ");
        String s1 = sc.next();
        System.out.print("Enter second string: ");
        String s2 = sc.next();
        // Comparing using charAt()
        boolean charAtResult = compare(s1, s2);
        // Comparing using built-in equals() method
        boolean equalsResult = s1.equals(s2);

        // Displaying results
        System.out.println("Result using charAt(): " + charAtResult);
        System.out.println("Result using equals(): " + equalsResult);

        // Check if both results are the same
        if (charAtResult == equalsResult) {
            System.out.println("Both methods give the same result.");
        } else {
            System.out.println("Methods give different results.");
        }

        sc.close();
    }
}
