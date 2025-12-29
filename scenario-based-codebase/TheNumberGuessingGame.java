//Creating a class to implement Number Guessing game, where computer guesses user's guess.

import java.util.Random;
import java.util.Scanner;

public class TheNumberGuessingGame {

    public static void main(String[] args) {

        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        // Creating Random number between 1 and 100
        int number = r.nextInt(100) + 1;
        int guess;
        int attempts = 0;

        System.out.println("Guess a number between 1 and 100");

        do {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess > number) {
                System.out.println("Too high");
            } else if (guess < number) {
                System.out.println("Too low");
            } else {
                System.out.println("Correct! You guessed it in " + attempts + " attempts.");
                break;
            }

        } while (attempts < 5);

        // game gets over when user guessed the number wrong 5 times
        if (guess != number) {
            System.out.println("Game Over! The number was: " + number);
        }

        sc.close();
    }
}
