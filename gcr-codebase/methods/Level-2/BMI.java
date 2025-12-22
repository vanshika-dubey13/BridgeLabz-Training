//Creating a class to calculate BMI using methods

import java.util.Scanner;

public class BMI {

    // Creating a method to calculate BMI
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0]; // in kg
            double heightCm = data[i][1]; // in cm
            double heightM = heightCm / 100; // convert to meters

            double bmi = weight / (heightM * heightM);
            data[i][2] = bmi;
        }
    }

    // Creating a method to find BMI status
    public static String[] getBMIStatus(double[][] data) {
        String[] bmiStatus = new String[data.length];

        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];

            if (bmi <= 18.4) {
                bmiStatus[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                bmiStatus[i] = "Normal";
            } else if (bmi > 25.0 && bmi <= 39.9) {
                bmiStatus[i] = "Overweight";
            } else {
                bmiStatus[i] = "Obese";
            }
        }
        return bmiStatus;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 10 rows for 10 people, 3 columns (weight, height, BMI)
        double[][] person = new double[10][3];

        // Taking input
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for Person " + (i + 1));
            System.out.print("Weight (kg): ");
            person[i][0] = sc.nextDouble();

            System.out.print("Height (cm): ");
            person[i][1] = sc.nextDouble();
        }

        calculateBMI(person);

        // Getting BMI status
        String[] status = getBMIStatus(person);

        // Displaying result

        for (int i = 0; i < 10; i++) {
            System.out.printf(
                    "%d\t%.2f\t%.2f\t%.2f\t%s%n",
                    (i + 1),
                    person[i][0],
                    person[i][1],
                    person[i][2],
                    status[i]);
        }

        sc.close();
    }
}
