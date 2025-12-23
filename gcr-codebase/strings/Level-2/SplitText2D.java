import java.util.Scanner;

public class SplitText2D {

	// Method to find length of a string without using length()
    	public static int findLength(String s) {
        	int count = 0;
        	try {
            		while (true) {
                		s.charAt(count);
                		count++;
            		}
        	}
		catch (Exception e) {
            	// Index out of bounds exception ends the loop
        	}
        	return count;
    	}

	// Method to split text into words without using split()
    	public static String[] splitWords(String s) {
        	int wordCount = 0;
        	boolean isWord = false;
        	// Counting number of words
        	for (int i = 0; ; i++) {
        		try {
                	char ch = s.charAt(i);
                		if (ch != ' ' && !isWord) {
                    			wordCount++;
                    			isWord = true;
                		}
				else if (ch == ' ') {
                    			isWord = false;
                		}
            		}
			catch (Exception e) {
                		break;
            		}
        	}
        String[] words = new String[wordCount];
        int index = 0;
        String word = "";
        // Extracting words
        for (int i = 0; ; i++) {
		try {
                char ch = s.charAt(i);
                if (ch != ' ') {
                    word += ch;
                } else if (!word.equals("")) {
                    words[index++] = word;
                    word = "";
                }
            }
		catch (Exception e) {
              		if (!word.equals("")) {
                    		words[index] = word;
                	}
                	break;
         	}
        }

        return words;
    }

	// Method to create 2D array with word and its length
    	public static String[][] wordLengthTable(String[] words) {
        	String[][] table = new String[words.length][2];

        	for (int i = 0; i < words.length; i++) {
            		int length = findLength(words[i]);
            		table[i][0] = words[i];
            		table[i][1] = String.valueOf(length);
        	}

        	return table;
    	}

        public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);
        	System.out.print("Enter a sentence: ");
        	String input = sc.nextLine();

        	String[] words = splitWords(input);
        	String[][] result = wordLengthTable(words);

        	System.out.println("\nWord\tLength");
        	System.out.println("----------------");

        	for (int i = 0; i < result.length; i++) {
            		int length = Integer.parseInt(result[i][1]);
            		System.out.println(result[i][0] + "\t" + length);
        	}

        	sc.close();
    	}
}
