import java.util.Scanner;

public class TriangleRun {

    // Method to calculate the number of rounds to complete 5 km
    public static int calculateRounds(double s1, double s2, double s3) {
        // Calculating the perimeter of the triangle
        double perimeter = s1 + s2 + s3;
        // Converting 5 km to meters (5 km = 5000 meters)
        double target = 5000;
        // Calculate the number of rounds required
        int rounds = (int) Math.ceil(target / perimeter);
        return rounds;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first side of the triangle (in meters): ");
        double side1 = scanner.nextDouble();
        System.out.print("Enter the second side of the triangle (in meters): ");
        double side2 = scanner.nextDouble();
        System.out.print("Enter the third side of the triangle (in meters): ");
        double side3 = scanner.nextDouble();

        int rounds = calculateRounds(side1, side2, side3);

        // Displaying the result
        System.out.println("To complete a 5 km run, the athlete must complete " + rounds + " rounds.");
        
        scanner.close();
    }
}
