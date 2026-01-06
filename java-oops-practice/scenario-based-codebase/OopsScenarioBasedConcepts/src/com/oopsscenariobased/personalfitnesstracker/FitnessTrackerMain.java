package com.oopsscenariobased.personalfitnesstracker;

import java.util.Scanner;

public class FitnessTrackerMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to FitTrack!");

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter weight (kg): ");
        double weight = sc.nextDouble();

        System.out.print("Enter daily calorie goal (or 0 for default): ");
        int goal = sc.nextInt();

        UserProfile user = (goal == 0)
                ? new UserProfile(name, age, weight)
                : new UserProfile(name, age, weight, goal);

        int totalCaloriesBurned = 0;
        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. View Profile");
            System.out.println("2. Start Cardio Workout");
            System.out.println("3. Start Strength Workout");
            System.out.println("4. View Daily Progress");
            System.out.println("0. Exit");
            System.out.print("Choose option: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    user.displayProfile();
                    break;

                case 2:
                    System.out.print("Enter duration (minutes): ");
                    int cDur = sc.nextInt();
                    Workout cardio = new CardioWorkout(cDur);
                    cardio.startWorkout();
                    cardio.stopWorkout();
                    totalCaloriesBurned += cardio.getCaloriesBurned();
                    break;

                case 3:
                    System.out.print("Enter duration (minutes): ");
                    int sDur = sc.nextInt();
                    Workout strength = new StrengthWorkout(sDur);
                    strength.startWorkout();
                    strength.stopWorkout();
                    totalCaloriesBurned += strength.getCaloriesBurned();
                    break;

                case 4:
                    int remaining = user.getDailyCalorieGoal() - totalCaloriesBurned;
                    System.out.println("\nCalories Burned Today: " + totalCaloriesBurned);
                    System.out.println("Remaining Calories to Goal: " + remaining);
                    break;

                case 0:
                    System.out.println("Thank you for using FitTrack!");
                    break;

                default:
                    System.out.println("Invalid option!");
            }
        } while (choice != 0);

        sc.close();
    }
}
