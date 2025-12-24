import java.util.Scanner;

public class TemperatureConverter {

    // Function to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    // Function to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.print("Choose an option (1 or 2): ");
        int choice = sc.nextInt();

        double inputTemp;
        double convertedTemp;

        if (choice == 1) {
            System.out.print("Enter temperature in Fahrenheit: ");
            inputTemp = sc.nextDouble();
            convertedTemp = fahrenheitToCelsius(inputTemp);
            System.out.printf("%.2f Fahrenheit is equal to %.2f Celsius.\n", inputTemp, convertedTemp);
        } else if (choice == 2) {
            System.out.print("Enter temperature in Celsius: ");
            inputTemp = sc.nextDouble();
            convertedTemp = celsiusToFahrenheit(inputTemp);
            // Corrected line to properly format the output
            System.out.printf("%.2f Celsius is equal to %.2f Fahrenheit.\n", inputTemp, convertedTemp);
        } else {
            System.out.println("Invalid input entered");
        }
        sc.close();
    }
}
