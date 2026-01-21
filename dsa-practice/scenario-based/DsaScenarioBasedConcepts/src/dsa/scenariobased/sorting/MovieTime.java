package dsa.scenariobased.sorting;

import java.util.Scanner;

import java.util.Scanner;

public class MovieTime {

    // method to perform insertion sort
    public static void insertionSort(double[] times, int n) {
        for (int i = 1; i < n; i++) {
            double key = times[i];
            int j = i - 1;
            while (j >= 0 && times[j] > key) {
                times[j + 1] = times[j];
                j--;
            }
            times[j + 1] = key;
        }
    }

    // displaying array
    public static void printArray(double[] times, int n) {
        System.out.println("Current Show Listings:");
        for (int i = 0; i < n; i++) {
            System.out.print(times[i] + "  ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //taking input from user
        System.out.print("Enter number of showtimes: ");
        int n = sc.nextInt();

        double[] showTimes = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter showtime (HH.MM format): ");
            showTimes[i] = sc.nextDouble();

            //performing insertion sort
            insertionSort(showTimes, i + 1);
            
            //displaying result
            printArray(showTimes, i + 1);
        }

        sc.close();
    }
}
