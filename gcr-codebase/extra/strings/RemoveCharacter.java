import java.util.Scanner;

public class RemoveCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.println("Enter a string:");
        String s = scanner.nextLine();

        // Input character to remove
        System.out.println("Enter character to remove:");
        char removeChar = scanner.next().charAt(0);

        StringBuilder result = new StringBuilder();

        // Remove character
        for (int i = 0; i < s.length(); i++) {
            if (input.charAt(i) != removeChar) {
                result.append(s.charAt(i));
            }
        }

        // Output result
        System.out.println("Modified String: \"" + result.toString() + "\"");

        scanner.close();
    }
}
