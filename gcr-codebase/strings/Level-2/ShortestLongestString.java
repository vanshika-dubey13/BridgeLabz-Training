import java.util.Scanner;

public class ShortestLongestString {

	// Method to split text into words without using split()
    	public static String[] splitWords(String s) {
        	int count = 0;
        	// Count number of words
        	boolean isWord = false;
        	for (int i = 0; i < s.length(); i++) {
            		char ch = s.charAt(i);
            		if (ch != ' ' && !isWord) {
                		count++;
                		isWord = true;
            		} else if (ch == ' ') {
                		isWord = false;
            		}
        	}
        	String[] words = new String[count];
        	int index = 0;
        	String currentWord = "";

        	for (int i = 0; i < s.length(); i++) {
            		char ch = s.charAt(i);
            		if (ch != ' ') {
                		currentWord += ch;
            		} else if (!currentWord.equals("")) {
                		words[index++] = currentWord;
                		currentWord = "";
            		}
        	}

        	if (!currentWord.equals("")) {
            		words[index] = currentWord;
        	}

        	return words;
    	}

	// Method to find string length without using length()
    	public static int findLength(String word) {
        	int length = 0;
        	try {
            		while (true) {
                		word.charAt(length);
                	length++;
            		}
        	} catch (Exception e) {
            		// End of string reached
        	}
        	return length;
    	}

	// Method to create 2D array of word and its length
    	public static String[][] wordWithLength(String[] words) {
        	String[][] result = new String[words.length][2];
        	for (int i = 0; i < words.length; i++) {
            		int len = findLength(words[i]);
            		result[i][0] = words[i];
            		result[i][1] = String.valueOf(len);
        	}

        	return result;
    	}

	// Method to find shortest and longest word
    	public static int[] findShortestAndLongest(String[][] data) {
        	int shortest = Integer.parseInt(data[0][1]);
        	int longest = Integer.parseInt(data[0][1]);
        	for (int i = 1; i < data.length; i++) {
            		int len = Integer.parseInt(data[i][1]);
            		if (len < shortest) {
                		shortest = len;
            		}
            		if (len > longest) {
                	longest = len;
            		}
        	}

        	return new int[]{shortest, longest};
    	}

	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

        	System.out.println("Enter the text:");
        	String text = sc.nextLine();

        	String[] words = splitWords(text);
        	String[][] wordLengthArray = wordWithLength(words);
        	int[] result = findShortestAndLongest(wordLengthArray);

        	System.out.println("Shortest word length: " + result[0]);
        	System.out.println("Longest word length: " + result[1]);

        	sc.close();
    }
}
