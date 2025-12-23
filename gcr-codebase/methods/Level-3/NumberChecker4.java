import java.util.Scanner;
import java.util.Arrays;

public class NumberChecker4 {

	// Method to count digits
    	public static int countDigit(int n) {
        	return String.valueOf(Math.abs(n)).length();
    	}

    	// Method to store digits in an array
    	public static int[] getDigitsArray(int n) {
        	n = Math.abs(n);
        	int count = countDigit(n);
        	int[] digits = new int[count];
        	for (int i = count - 1; i >= 0; i--) {
            		digits[i] = n % 10;
            		n /= 10;
        	}

        	return digits;
    	}

	// Method to calculate sum of digits
	public static int sumDigits(int[] digits) {
        	int sum = 0;
        	for (int d : digits) {
            		sum += d;
        	}
        	return sum;
    	}

	// Method to calculate sum of squares of digits
    	public static int sumOfSquaresOfDigits(int[] digits) {
        	int sum = 0;
        	for (int d : digits) {
            		sum += Math.pow(d, 2);
        	}
        	return sum;
    	}

    	// Method to check Harshad number
    	public static boolean isHarshad(int n, int[] digits) {
        	int sum = sumOfDigits(digits);
        	return sum != 0 && n % sum == 0;
    	}

    	// Method to find frequency of each digit
    	public static int[][] digitFrequency(int[] digits) {
        	int[][] freq = new int[10][2]; // Column 0 = digit, Column 1 = frequency

        	// Initialize digits
        	for (int i = 0; i < 10; i++) {
            		freq[i][0] = i;
            		freq[i][1] = 0;
        	}

        	// Count frequency
        	for (int d : digits) {
            		freq[d][1]++;
        	}

        	return freq;
    	}

    	public static void main(String[] args) {
        	Scanner scanner = new Scanner(System.in);

        	System.out.println("Enter a number:");
        	int number = scanner.nextInt();
        	// Count digits
        	int count = countDigit(number);
        	System.out.println("Number of digits: " + count);
        	// Digits array
        	int[] digitsArray = getDigitsArray(number);
        	System.out.println("Digits array: " + Arrays.toString(digitsArray));

        	// Sum of digits
        	int sum = sumDigits(digitsArray);
        	System.out.println("Sum of digits: " + sum);
	
        	// Sum of squares of digits
        	int sumSquares = sumOfSquaresOfDigits(digitsArray);
        	System.out.println("Sum of squares of digits: " + sumSquares);

        	// Harshad number check
        	boolean harshad = isHarshad(number, digitsArray);
        	System.out.println("Is Harshad number? " + harshad);

        	// Digit frequency
        	int[][] frequency = digitFrequency(digitsArray);
        	System.out.println("Digit Frequency:");
        	System.out.println("Digit\tFrequency");
        	for (int i = 0; i < 10; i++) {
            		if (frequency[i][1] > 0) {
                	System.out.println(frequency[i][0] + "\t" + frequency[i][1]);
            		}
        	}

        	scanner.close();
    	}
}
