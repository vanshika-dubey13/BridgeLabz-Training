//Creating a class to calculate bmi using 2d array

import java.util.Scanner;

public class BMI2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of persons:");
        int num = sc.nextInt();

        // Creating a 2D array taking [person][0=weight, 1=height, 2=BMI]
        double[][] personData = new double[num][3];
        String[] weightStatus = new String[num];
        // Taking weight and height as user input
        for (int i = 0; i < num; i++) {
            System.out.println("Enter details of person " + (i + 1));
            // For Weight
            System.out.print("Enter weight (kg): ");
            personData[i][0] = sc.nextDouble();
            if (personData[i][0] <= 0) {
                System.out.println("Enter positive weight");
                i--;
                continue;
            }

            // For Height
            System.out.print("Enter height (m): ");
            personData[i][1] = sc.nextDouble();
            if (personData[i][1] <= 0) {
                System.out.println("Enter positive height");
                i--;
                continue;
            }
        }

        // Calculating BMI and status
        for (int i = 0; i < num; i++) {
            double weight = personData[i][0];
            double height = personData[i][1];
            personData[i][2] = weight / (height * height);
            if (personData[i][2] < 18.5)
                weightStatus[i] = "Underweight";
            else if (personData[i][2] < 25)
                weightStatus[i] = "Normal";
            else if (personData[i][2] < 30)
                weightStatus[i] = "Overweight";
            else
                weightStatus[i] = "Obese";
        }

        // Displaying result
        System.out.println("\nPerson Details:");
        for (int i = 0; i < num; i++) {
            System.out.println("Person " + (i + 1));
            System.out.println("Weight: " + personData[i][0]);
            System.out.println("Height: " + personData[i][1]);
            System.out.println("BMI: " + personData[i][2]);
            System.out.println("Status: " + weightStatus[i]);
            System.out.println();
        }

        sc.close();
    }
}
