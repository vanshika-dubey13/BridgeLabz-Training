import java.util.Scanner;

public class ElectionBooth {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int voteA = 0, voteB = 0, voteC = 0;

        while (true) {
            System.out.print("\nEnter age (or -1 to exit): ");
            int age = sc.nextInt();

            // Exit condition
            if (age == -1) {
                break;
            }

            // Check eligibility
            if (age >= 18) {
                System.out.println("You are eligible to vote.");
                System.out.println("Press 1 for Candidate A");
                System.out.println("Press 2 for Candidate B");
                System.out.println("Press 3 for Candidate C");

                int vote = sc.nextInt();

                // Record vote
                if (vote == 1) {
                    voteA++;
                } else if (vote == 2) {
                    voteB++;
                } else if (vote == 3) {
                    voteC++;
                } else {
                    System.out.println("Invalid vote!");
                }

            } else {
                System.out.println("Not eligible to vote.");
            }
        }

        // Display results
        System.out.println("\n--- Election Results ---");
        System.out.println("Candidate A: " + voteA);
        System.out.println("Candidate B: " + voteB);
        System.out.println("Candidate C: " + voteC);

        sc.close();
    }
}
