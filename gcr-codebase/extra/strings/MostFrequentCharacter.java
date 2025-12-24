import java.util.Scanner;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.println("Enter a string:");
        String str = sc.nextLine();

        int[] freq = new int[256]; // ASCII characters

        // Count frequency of each character
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        char mostFrequent = str.charAt(0);
        int maxCount = freq[mostFrequent];

        // Find most frequent character
        for (int i = 1; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (freq[currentChar] > maxCount) {
                maxCount = freq[currentChar];
                mostFrequent = currentChar;
            }
        }

        // Output result
        System.out.println("Most frequent character: " + mostFrequent);
        System.out.println("Frequency: " + maxCount);

        sc.close();
    }
}
