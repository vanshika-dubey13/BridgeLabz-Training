//Creating a class to find the mean height of players present in a football team.


import java.util.Scanner;
public class PlayersMeanHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	double heights[]  = new double[11];
	double sum =0.0;
	System.out.print("Enter 11 numbers ");

         // Storing the  results in array
        for (int i = 0; i < heights.length; i++) {
		heights[i] = sc.nextDouble();
            	sum = sum + heights[i];
        }
	double mean = sum/heights.length;
        // Displayig the mean
		
        System.out.println("Mean : " + mean );
        sc.close();
    }
}
