//Creating a class to reverse a string

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = sc.nextLine();

		// Creating a variable to store reversed string
		String rev = "";
		// Looping from the end of the string to the beginning
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}

		// Displaying reversed string
		System.out.println("Reversed string: " + rev);

		sc.close();
	}
}
