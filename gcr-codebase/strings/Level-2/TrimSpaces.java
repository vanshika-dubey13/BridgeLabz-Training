public class TrimSpace {

	// Method to find start and end index after trimming spaces
    	public static int[] findTrimIndexes(String s) {
        	int start = 0;
        	int end = s.length() - 1;
        	// Triming leading spaces
        	while (start <= end && s.charAt(start) == ' ') {
            		start++;
        	}
        	// Triming trailing spaces
        	while (end >= start && s.charAt(end) == ' ') {
            		end--;
        	}
        	return new int[]{start, end};
    	}

	// Method to create substring using charAt()
    	public static String createSubstring(String s, int start, int end) {
        	String result = "";
        	for (int i = start; i <= end; i++) {
            		result += s.charAt(i);
        	}
        	return result;
    	}

	// Method to compare two strings using charAt()
    	public static boolean compareStrings(String s1, String s2) {
        	if (s1.length() != s2.length()) {
            		return false;
        	}
        	for (int i = 0; i < s1.length(); i++) {
            		if (s1.charAt(i) != s2.charAt(i)) {
                		return false;
            		}
        	}
        	return true;
    	}

	public static void main(String[] args) {
        	String input = "   Hello World   ";

        	// triming using charAt()
        	int[] indexes = findTrimIndexes(input);
        	String customTrimmed = createSubstring(input, indexes[0], indexes[1]);

        	// Built-in trim()
        	String builtInTrimmed = input.trim();
        	// Comparing both strings
        	boolean isSame = compareStrings(customTrimmed, builtInTrimmed);

        	// Displaying results
        	System.out.println("Original String: \"" + input + "\"");
        	System.out.println("Custom Trimmed String: \"" + customTrimmed + "\"");
        	System.out.println("Built-in Trimmed String: \"" + builtInTrimmed + "\"");
        	System.out.println("Are both strings equal? " + isSame);
    	}
}
