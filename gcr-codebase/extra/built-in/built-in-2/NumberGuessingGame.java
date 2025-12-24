import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    static Random r = new Random();
    static Scanner sc = new Scanner(System.in);

    // Generates a random guess between low and high (inclusive)
    public static int generateGuess(int low, int high) {
        return r.nextInt(high - low + 1) + low;
    }

    // Receives feedback from the user
    public static String getFeedback(int guess) {
        System.out.print("Is the guess " + guess + " too high, too low, or correct? ");
        return sc.next().toLowerCase();
    }

    // Updates the range based on feedback
    public static int[] updateRange(int low, int high, int guess, String feedback) {
        if (feedback.equals("high")) {
            high = guess - 1;
        } else if (feedback.equals("low")) {
            low = guess + 1;
        }
        return new int[] { low, high };
    }

    public static void main(String[] args) {
        int low = 1;
        int high = 100;
        boolean correct = false;

        System.out.println("Think of a number between 1 and 100.");
        System.out.println("Respond with: high, low, or correct.");

        while (!correct && low <= high) {
            int guess = generateGuess(low, high);
            String feedback = getFeedback(guess);

            if (feedback.equals("correct")) {
                System.out.println("The computer guessed your number!");
                correct = true;
            } else {
                int[] newRange = updateRange(low, high, guess, feedback);
                low = newRange[0];
                high = newRange[1];
            }
        }

        sc.close();
    }
}
