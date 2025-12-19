import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	System.out.print("Enter number of persons: ");
	int num = sc.nextInt();
	double weights[] = new double[num];
	double heights[] = new double[num];
	double bmi[] = new double[num];
	String weightStatus[] = new String[num];

	for( int i=0; i<num; i++){
		System.out.println("Enter weight of person "+ (i+1));
		weights[i] = sc.nextDouble();
		System.out.println("Enter height of person "+ (i+1));
		heights[i] = sc.nextDouble();

	}
       // Calculating BMI and status
        for (int i = 0; i < num; i++) {
            bmi[i] = weights[i] / (heights[i]/100 * heights[i]/100);
            if (bmi[i] < 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi[i] >= 18.5 && bmi[i] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi[i]>=25.0 && bmi[i] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
	 }

        // Displaying results
         System.out.print("BMI details are : ");
               for (int i = 0; i < num; i++) {
			System.out.println("Displaying BMI details of person : " + (i+1));
            		System.out.println("Height : " + heights[i] + " Weight : " + weights[i] + " BMI : " + bmi[i] + " Weight Status : "+ weightStatus[i]);
        }

        sc.close();
    }
}