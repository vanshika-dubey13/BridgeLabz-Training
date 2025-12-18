import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
	// Creating Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Input base and height in inches
        System.out.print("Enter base (in inches): ");
        double base = sc.nextDouble();
        System.out.print("Enter height (in inches): ");
        double height = sc.nextDouble();

        // Formula: Area = 1/2 * base * height
        double areaInInches = 0.5 * base * height;
        // Convert square inches to square centimeters (1 inch = 2.54 cm, so 1 sq inch = 6.4516 sq cm)
        double areaInCm = areaInInches * 6.4516;
        // Convert height to centimeters
        double heightCm = height * 2.54;
        // Convert height to feet and inches
        int heightFeet = (int)(height / 12); // 12 inches = 1 foot
        double remainingInches = height % 12;

        // Output
        System.out.println("Area of Triangle:");
        System.out.println(" - In square inches: " + areaInInches);
        System.out.println(" - In square centimeters: " + areaInCm);

        System.out.println("Your Height in cm is " + heightCm +
                           " while in feet is " + heightFeet +
                           " and inches is " + remainingInches);
	sc.close();
    }
}