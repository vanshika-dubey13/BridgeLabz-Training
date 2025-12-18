import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight in kg: ");
        double weight = sc.nextDouble();
        System.out.print("Enter height in cm: ");
        double height = sc.nextDouble();

        // Converting height from cm to meters
        double heightM = height / 100;
        // Calculating BMI
        double bmi = weight / (heightM * heightM);
        System.out.println("Your BMI is: " + bmi);
        // Determining weight status
        if (bmi < 18.4) {
            System.out.println("Weight Status: Underweight");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("Weight Status: Normal weight");
        } else if (bmi >= 25 && bmi < 39.9) {
            System.out.println("Weight Status: Overweight");
        } else {
            System.out.println("Weight Status: Obese");
        }

        sc.close();
    }
}