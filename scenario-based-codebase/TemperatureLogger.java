//Creating a class to input temeratures for 7 days

import java.util.Scanner;

public class TemperatureLogger {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// creating an arr to store temperature of 7 days
		double[] temperatures = new double[7];
		// creating variables to store maxTemp and avergaeTemp
		double maxTemp = temperatures[0];
		double averageTemperature = 0;
		for (int i = 0; i < temperatures.length; i++) {
			System.out.println("Enter the " + (i + 1) + " temperature : ");
			temperatures[i] = sc.nextDouble();
		}
		// finding average and max temperature
		double sumTemperature = 0;
		for (int i = 0; i < temperatures.length; i++) {
			sumTemperature = sumTemperature + temperatures[i];
			// updating the value of maxTemp
			if (temperatures[i] > maxTemp) {
				maxTemp = temperatures[i];
			}
		}
		averageTemperature = (sumTemperature / temperatures.length);

		// displaying average and maximum temperature

		System.out.println("\nAverage tempertaure of 7 days : " + averageTemperature);
		System.out.println("\nMaximum tempertaure of 7 days : " + maxTemp);

	}
}