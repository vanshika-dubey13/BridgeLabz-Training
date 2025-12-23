import java.util.Scanner;

public class SplitTextComparison {

    // Method to find length of string without using length()
	public static int findLength(String s) {
        	int count = 0;
        	try {
            		for (;; count++) {   
                		s.charAt(count);
            		}
        	}
		catch (StringIndexOutOfBoundsException e) {
            	// Exception occurs when index goes out of range
            	return count;
        	}

    	}

	// Method to split text into words using charAt()
    	public static String[] manualSplit(String s) {
        	int length = findLength(s);
        	int wordCount = 1;
        	// Count words
        	for (int i = 0; i < length; i++) {
            		if (s.charAt(i) == ' ') {
                	wordCount++;
            		}
        	}
        	// Storing space indexes
        	int[] spaceIndexes = new int[wordCount + 1];
        	int index = 0;
        	spaceIndexes[index++] = -1;
        	for (int i = 0; i < length; i++) {
            		if (s.charAt(i) == ' ') {
                	spaceIndexes[index++] = i;
            		}
        	}
        	spaceIndexes[index] = length;
        	// Extracting words
        	String[] words = new String[wordCount];
        	for (int i = 0; i < wordCount; i++) {
            	words[i] = s.substring(spaceIndexes[i] + 1, spaceIndexes[i + 1]);
        	}
        	return words;
    	}

	// Method to compare two String arrays
    	public static boolean compareArrays(String[] arr1, String[] arr2) {
        	if (arr1.length != arr2.length) {
            		return false;
        	}
        	for (int i = 0; i < arr1.length; i++) {
            		if (!arr1[i].equals(arr2[i])) {
                		return false;
            		}
        	}
        	return true;
    	}

    	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

        	System.out.println("Enter a sentence:");
        	String s = sc.nextLine();
        	String[] customWords = manualSplit(s);

        	String[] builtInWords = s.split(" ");

        	boolean result = compareArrays(customWords, builtInWords);

        	System.out.println("\nCustom Split Result:");
        	for (String word : customWords) {
            		System.out.print(word + " ");
        	}

        	System.out.println("\nBuilt-in Split Result:");
        	for (String word : builtInWords) {
            		System.out.print(word +" ");
        	}

        	System.out.print("\nAre both results equal? " + result);

        	sc.close();
    	}
}
