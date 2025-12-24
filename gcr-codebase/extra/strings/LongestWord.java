import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();

        // Split sentence into words
        String[] words = sentence.split("\\s+");

        String longestWord = "";

        // Find the longest word
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        // Displaying result
        System.out.println("Longest word: " + longestWord);

        scanner.close();
    }
}
