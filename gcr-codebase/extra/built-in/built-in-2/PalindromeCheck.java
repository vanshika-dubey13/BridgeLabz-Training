import java.util.Scanner;

public class PalindromeChecke {

    // Function to get input from the user
    public static String getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        return sc.nextLine();
    }

    // Function to check if the string is a palindrome
    public static boolean isPalindrome(String str) {
        // Removing spaces and convert to lowercase
        str = str.replaceAll("\\s+", "").toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void displayResult(boolean result) {
        if (result) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }

    public static void main(String[] args) {
        // Getting user input
        String input = getInput();

        // Checking if the input is a palindrome
        boolean result = isPalindrome(input);

        // Displaying the result
        displayResult(result);
    }
}
