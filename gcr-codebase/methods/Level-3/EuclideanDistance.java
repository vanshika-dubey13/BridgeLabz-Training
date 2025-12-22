//Creating a class for Euclidean distance between two points as well as the equation of the line using those two points. Use Math functions Math.pow() and Math.sqrt()

import java.util.Scanner;

public class EuclideanDistance {

	
	public static double findDistance(int x1, int y1, int x2, int y2) {
        	double xDiff = Math.pow(x2 - x1, 2);
        	double yDiff = Math.pow(y2 - y1, 2);
        	return Math.sqrt(xDiff + yDiff);
    }

	public static double[] findLineEquation(int x1, int y1, int x2, int y2) {
        	double m = (double)(y2 - y1) / (x2 - x1);
        	double b = y1 - m * x1;
        	return new double[]{m, b};
    }

	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);
		//Taking distance points from user 
		System.out.println("Enter the value of x1, y1, x2, y2");
        	int x1 = sc.nextInt();
        	int y1 = sc.nextInt();
        	int x2 = sc.nextInt();
        	int y2 = sc.nextInt();

	        double distance = findDistance(x1, y1, x2, y2);
	        System.out.println("Euclidean distance: " + distance);

        	double[] result = findLineEquation(x1, y1, x2, y2);
        	System.out.println("Slope (m): " + result[0]);
        	System.out.println("Y-intercept (b): " + result[1]);

		sc.close();
    	}
}
