//Creating a class to convert various trigonometric functions using Math class given an angle in degrees


public class TrigonometryCalculator {

    public static double[] trigonometricFunctions(double angle) {
        // Converting degrees to radians
        double radians = Math.toRadians(angle);
        // Calculate trigonometric functions
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        // Storing and returning results in an array
        return new double[]{sine, cosine, tangent};
    }
	
	public static void main(String[] args) {
        double[] ans = trigonometricFunctions(45);

	//Displaying the results
        System.out.println("Sine: " + ans[0]);
        System.out.println("Cosine: " + ans[1]);
        System.out.println("Tangent: " + ans[2]);
	
    }
}
