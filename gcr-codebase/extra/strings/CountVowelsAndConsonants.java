//Creating a class to count number of vowels and consonants in a string

import java.util.Scanner;

public class CountVowelsAndConsonants {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = sc.nextLine().toLowerCase();

		int vowels = 0, consonants = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				// checking if alphabet
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					vowels = vowels + 1;
				} else {
					consonants = consonants + 1;
				}
			}
		}
		System.out.println("Number of vowels: " + vowels);
		System.out.println("Number of consonants: " + consonants);

		sc.close();
	}
}
