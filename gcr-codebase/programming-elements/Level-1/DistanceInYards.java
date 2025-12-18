//Creating a class to convert distance miles
import java.util.Scanner;
public class DistanceInYards {
    public static void main(String[] args) {
	 // Creating Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Input: distance in feet
        System.out.print("Enter distance in feet: ");
        double distanceInFeet = sc.nextDouble();
        // Conversion
        double distanceInYards = distanceInFeet / 3.0;   // 1 yard = 3 feet
        double distanceInMiles = distanceInYards / 1760.0; // 1 mile = 1760 yards

        // Printing results
        System.out.println("Distance in feet: " + distanceInFeet);
        System.out.println("Distance in yards: " + distanceInYards);
        System.out.println("Distance in miles: " + distanceInMiles);

        sc.close();
    }
}