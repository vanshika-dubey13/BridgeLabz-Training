public class CollinearPoints {

	// Method to check collinearity using slope formula
    	static boolean checkCollinearUsingSlope(int x1, int y1,
                                             int x2, int y2,
                                             int x3, int y3) {

        	// To avoid division, cross-multiply slopes
        	return (y2 - y1) * (x3 - x2) ==
               		(y3 - y2) * (x2 - x1) &&
               		(y3 - y1) * (x2 - x1) ==
               		(y2 - y1) * (x3 - x1);
    	}

	// Method to check collinearity using area of triangle formula
    	static boolean checkCollinearUsingArea(int x1, int y1,
                                           int x2, int y2,
                                           int x3, int y3) {

        	double area = 0.5 * (x1 * (y2 - y3)
                           + x2 * (y3 - y1)
                           + x3 * (y1 - y2));

        	return area == 0;
    	}

    	public static void main(String[] args) {

        // Sample points
        int x1 = 2, y1 = 4;
        int x2 = 4, y2 = 6;
        int x3 = 6, y3 = 8;

        System.out.println("Points:");
        System.out.println("A(" + x1 + "," + y1 + ")");
        System.out.println("B(" + x2 + "," + y2 + ")");
        System.out.println("C(" + x3 + "," + y3 + ")");
        if (checkCollinearUsingSlope(x1, y1, x2, y2, x3, y3)) {
            System.out.println("\nUsing Slope Formula: Points are Collinear");
        } else {
            System.out.println("\nUsing Slope Formula: Points are NOT Collinear");
        }
        if (checkCollinearUsingArea(x1, y1, x2, y2, x3, y3)) {
            System.out.println("Using Area Formula: Points are Collinear");
        } else {
            System.out.println("Using Area Formula: Points are NOT Collinear");
        }
    }
}
