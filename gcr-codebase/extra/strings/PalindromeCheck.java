import java.util.Scanner;

public class PalindromeCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = sc.nextLine();

		// Converting to lowercase to make the checking case-insensitive
		String original = s.toLowerCase();
		String rev = "";
		// Reversing the string
		for (int i = original.length() - 1; i >= 0; i--) {
			rev += original.charAt(i);
		}
		// Checking if palindrome
		if (original.equals(rev)) {
			System.out.println("The string is a palindrome.");
		} else {
			System.out.println("The string is not a palindrome.");
		}

		sc.close();
	}
}
