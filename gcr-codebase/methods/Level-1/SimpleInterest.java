//Creating a class to input the Principal, Rate, and Time values and calculate Simple Interest using a method.


import java.util.Scanner;
public class SimpleInterest {

	//Creating a method to calculate simple interest.	

	public static double SimpleInterestCalculator( double p, double r, double t ){
		return ((p * r * t) / 100 );
	}

    public static void main(String[] args) {
	
        Scanner sc = new Scanner(System.in);
	//Taking principal, rate, time as user input
	
        System.out.print("Enter Principal amount: ");
        double principal = sc.nextDouble();
        System.out.print("Enter Rate of Interest (per annum): ");
        double rate = sc.nextDouble();
        System.out.print("Enter Time (in years): ");
        double time = sc.nextDouble();

	//Storing the value of si returned method and displaying it
	double simpleInterest = SimpleInterestCalculator( principal, rate, time);
        System.out.println("Simple Interest = " + simpleInterest);
        sc.close();
    }
}