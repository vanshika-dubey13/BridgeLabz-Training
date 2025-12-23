import java.util.Scanner;

public class FrequencyOfCharacters {

	// Method to find frequency of characters and return a 2D array
    	public static int[][] findFrequency(String s) {
        	int[] frequency = new int[256]; // Creating ascii size array
        	//Counting frequency using ASCII index
        	for (int i = 0; i < s.length(); i++) {
            		char ch = s.charAt(i);
            		frequency[ch]++;
        	}

        	//Counting unique characters
        	int uniqueChar = 0;
        	for (int i = 0; i < 256; i++) {
            		if (frequency[i] > 0) {
                	uniqueChar++;
            		}
        	}

        	//Storing characters and frequencies in 2D array
        	int[][] result = new int[uniqueChar][2];
        	int index = 0;
        	for (int i = 0; i < 256; i++) {
            		if (frequency[i] > 0) {
                	result[index][0] = i;       // ASCII value of character
                	result[index][1] = frequency[i]; 
                	index++;
            		}
        	}

        	return result;
    	}


	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

        	// Taking user input string
        	System.out.print("Enter a string: ");
        	String s = sc.nextLine();

        	int[][] frequencyArray = findFrequency(s);

        	// Displaying result
        	System.out.println("\nCharacter Frequencies:");
        	for (int i = 0; i < frequencyArray.length; i++) {
            		char ch = (char) frequencyArray[i][0];
            		int count = frequencyArray[i][1];
            		System.out.println(ch + " : " + count);
        	}

        	sc.close();
    	}
}
