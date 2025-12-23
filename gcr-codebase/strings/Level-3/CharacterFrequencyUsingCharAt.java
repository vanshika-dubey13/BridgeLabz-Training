import java.util.Scanner;

public class CharacterFrequencyUsingCharAt {

	// Method to find character frequencies
    	public static int[][] findingFrequency(String s) {

        	//Frequency array for 256 ASCII characters
        	int[] freq = new int[256];
        	//Count frequency of each character
        	for (int i = 0; i < s.length(); i++) {
            		char ch = s.charAt(i);
            		freq[ch]++;
        	}

        	//Count unique characters
        	int uniqueChar = 0;
        	for (int i = 0; i < s.length(); i++) {
            		if (freq[s.charAt(i)] > 0) {
                		uniqueChar++;
                		freq[s.charAt(i)] = -freq[s.charAt(i)]; // mark as counted
            		}
        	}

        	//Storing characters and their frequencies in 2D array
        	int[][] result = new int[uniqueChar][2];
        	int index = 0;
        	for (int i = 0; i < s.length(); i++) {
            		char ch = s.charAt(i);
            		if (freq[ch] < 0) {
                		result[index][0] = ch;
                		result[index][1] = -freq[ch];
                		freq[ch] = 0; // reset
                		index++;
            		}
        	}

        	return result;
    	}

	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

        	System.out.print("Enter a string: ");
        	String s = sc.nextLine();

        	int[][] frequency = findingFrequency(s);

        	System.out.println("\nCharacter Frequencies:");
        	System.out.println("Character\tFrequency");

        	for (int i = 0; i < frequency.length; i++) {
            		System.out.println((char) frequency[i][0] + "\t\t" + frequency[i][1]);
        	}

        	sc.close();
    	}
}
