//Creating a class to Store counts of pushups for a week, skipping 0 pushup days

import java.util.Scanner;

public class FitnessChallengeTracker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Storing number of days Sandeep worked out
        int workOutDays = 7;
        // Array to store push-ups count for each day of the week
        int[] pushUpsPerDay = new int[workOutDays];
        for (int i = 0; i < pushUpsPerDay.length; i++) {
            System.out.println("Enter value for " + (i + 1) + " day : ");
            pushUpsPerDay[i] = sc.nextInt();
        }

        int totalPushUps = 0;
        int daysCounted = 0;

        // Calculating total push-ups and average pushups for a week
        for (int pushUps : pushUpsPerDay) {
            if (pushUps == 0) {
                // Skip rest days
                continue;
            }
            totalPushUps += pushUps;
            daysCounted++;
        }

        double averagePushUps = daysCounted > 0 ? (double) totalPushUps / daysCounted : 0;

        // Displaying the results
        System.out.println("Total Push-ups: " + totalPushUps);
        System.out.println("Average Push-ups per Day: " + averagePushUps);
    }
}
