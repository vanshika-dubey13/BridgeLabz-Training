import java.util.Scanner;

public class BMI {

	// Method to calculate BMI and status for one person
    	public static String[] calculateBMI(double wt, double heightCm) {
        	double heightMeter = heightCm / 100;
        	double bmi = wt / (heightMeter * heightMeter);
        	String bmiStatus;
        	if (bmi <= 18.4) {
            		bmiStatus = "Underweight";
        	} else if (bmi <= 24.9 && bmi>=18.5) {
            		bmiStatus = "Normal";
        	} else if (bmi <=25.0 && bmi<=39.9) {
            		bmiStatus = "Overweight";
        	} else  {
            		bmiStatus = "Obese";
        	}

		return new String[] {
		String.format("%.2f", heightCm),
            	String.format("%.2f", wt),
            	String.format("%.2f", bmi),
            	bmiStatus
        	};
    	}

	// Method to process all persons
    	public static String[][] processingBMI(double[][] data) {
        	String[][] result = new String[10][4];

        	for (int i = 0; i < 10; i++) {
            		result[i] = calculateBMI(data[i][0], data[i][1]);
        	}
        	return result;
    	}

	// Method to display the result in tabular format
    	public static void displayingResult(String[][] result) {
        	System.out.println("\nHeight(cm)\tWeight(kg)\tBMI\t\tStatus");
        	System.out.println("------------------------------------------------------");

        	for (int i = 0; i < result.length; i++) {
            		System.out.println(
                	result[i][0] + "\t\t" +
                	result[i][1] + "\t\t" +
                	result[i][2] + "\t\t" +
                	result[i][3]
            		);
        	}
    	}


	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

        	// Creating 2D array to store weight and height
        	double[][] data = new double[10][2];

        	for (int i = 0; i < 10; i++) {
            		System.out.println("\nEnter details for Person " + (i + 1));
            		System.out.print("Weight (kg): ");
            		data[i][0] = sc.nextDouble();
            		System.out.print("Height (cm): ");
            		data[i][1] = sc.nextDouble();
        	}
        	// Processing BMI
        	String[][] result = processingBMI(data);

        	// Displaying result
        	displayingResult(result);
        	sc.close();
    	}
}
