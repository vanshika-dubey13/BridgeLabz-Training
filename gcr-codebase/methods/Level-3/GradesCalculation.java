import java.util.Scanner;
import java.util.Random;

public class GradesCalculation {

	// Method to generate random PCM scores
    	public static int[][] generatePCMScore(int students) {
        	Random r = new Random();
        	int[][] scores = new int[students][3]; // 0-Physics, 1-Chemistry, 2-Maths
        	for (int i = 0; i < students; i++) {
            		for (int j = 0; j < 3; j++) {
                		scores[i][j] = r.nextInt(90) + 10; // 2-digit scores (10–99)
            		}
        	}
        	return scores;
    	}

	// Method to calculate Total, Average, Percentage
    	public static double[][] calculateResult(int[][] scores) {
        	int students = scores.length;
        	double[][] results = new double[students][3]; // Total, Average, Percentage
        	for (int i = 0; i < students; i++) {
            		int total = scores[i][0] + scores[i][1] + scores[i][2];
            		double average = total / 3.0;
            		double percentage = (total / 300.0) * 100;

            	// Rounding to 2 decimal places
            		results[i][0] = Math.round(total * 100.0) / 100.0;
            		results[i][1] = Math.round(average * 100.0) / 100.0;
            		results[i][2] = Math.round(percentage * 100.0) / 100.0;
        	}
        	return results;
    	}

	// Method to display scorecard
    	public static void displayScoreCard(int[][] scores, double[][] results) {
        	System.out.println("\nStudent\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");
        	for (int i = 0; i < scores.length; i++) {
            		System.out.println(
                	(i + 1) + "\t" +
                	scores[i][0] + "\t" +
                	scores[i][1] + "\t\t" +
                	scores[i][2] + "\t" +
                	results[i][0] + "\t" +
                	results[i][1] + "\t" +
                	results[i][2]
            		);
        	}
    	}

	public static void main(String[] args) {
        	Scanner scanner = new Scanner(System.in);
        	// Input number of students
        	System.out.println("Enter number of students:");
        	int students = scanner.nextInt();

        	// Generate scores
        	int[][] pcmScores = generatePCMScore(students);
        	// Calculate results
        	double[][] results = calculateResult(pcmScores);
        	// Display scorecard
        	displayScoreCard(pcmScores, results);

        	scanner.close();
    	}
}
