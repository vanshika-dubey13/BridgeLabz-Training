import java.util.Scanner;

public class RemoveDuplicates {

	// Method to remove duplicates from a string
	public static String removeDuplicateChars(String str) {
		StringBuilder result = new StringBuilder();
		boolean[] visited = new boolean[256]; // ASCII character set
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (!visited[ch]) {
				result.append(ch);
				visited[ch] = true;
			}
		}

		return result.toString();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string:");
		String s = scanner.nextLine();

		String modified = removeDuplicateChars(s);
		System.out.println("String after removing duplicates: " + modified);

		scanner.close();
	}
}
