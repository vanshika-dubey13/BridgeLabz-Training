import java.util.Scanner;

public class BMIFitnessTracker {

	// Creating a method to calculate BMI
	public static String calculateBMI(double height, double weight) {
		double bmiValue = ((weight) / (height * height));
		String bmiCategory = "";
		if (bmiValue < 18.4) {
			bmiCategory = "Underweight";
		} else if (bmiValue >= 18.5 && bmiValue <= 24.9) {
			bmiCategory = "Normal";
		} else if (bmiValue >= 25.0 && bmiValue <= 39.9) {
			bmiCategory = "Overweight";
		} else {
			bmiCategory = "Obese";
		}
		return bmiCategory;
	}

	public static void main(String[] args) {
		// Taking user input for height and weight
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter height (in m) : ");
		double heightInM = sc.nextDouble();
		System.out.print("Enter weight (in kg) : ");
		double weightInKg = sc.nextDouble();
		// Displaying results
		String status = calculateBMI(heightInM, weightInKg);
		System.out.print("\nBMI status is : " + status);
	}
}