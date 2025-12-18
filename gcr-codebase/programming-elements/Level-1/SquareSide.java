import java.util.Scanner;

public class SquareSide {
    public static void main(String[] args) {
	// Creating Scanner object to take input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the perimeter of the square: ");
        int perimeter = sc.nextInt();

        // Calculate side
        int side = perimeter / 4;

        // Displaying Output
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);

        sc.close();
    }
}