package dsa.scenariobased.sorting;

import java.util.Scanner;

public class GamerZone {

    // Partition method
    public static int partition(int[] scores, int low, int high) {
        int pivot = scores[high]; // last element as pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {
            // For descending order (highest score first)
            if (scores[j] > pivot) {
                i++;
                int temp = scores[i];
                scores[i] = scores[j];
                scores[j] = temp;
            }
        }

        int temp = scores[i + 1];
        scores[i + 1] = scores[high];
        scores[high] = temp;

        return i + 1;
    }

    // Quick Sort
    public static void quickSort(int[] scores, int low, int high) {
        if (low < high) {
            int pi = partition(scores, low, high);

            quickSort(scores, low, pi - 1);
            quickSort(scores, pi + 1, high);
        }
    }

    // Display leaderboard
    public static void display(int[] scores) {
        System.out.println("\n🏆 Leaderboard (Highest to Lowest):");
        for (int i = 0; i < scores.length; i++) {
            System.out.println("Rank " + (i + 1) + ": " + scores[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of players: ");
        int n = sc.nextInt();

        int[] scores = new int[n];

        System.out.println("Enter player scores:");
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }

        // Sort scores using Quick Sort
        quickSort(scores, 0, n - 1);

        // Display leaderboard
        display(scores);

        sc.close();
    }
}

