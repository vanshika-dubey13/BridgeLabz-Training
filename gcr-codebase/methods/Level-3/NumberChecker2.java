import java.util.Scanner;

class NumberChecker2 {

    // Method to count digits
    public static int countDigits(int number) {
        int count = 0;
        int temp = number;

        while (temp != 0) {
            count++;
            temp /= 10;
        }
        return count;
    }

    // Method to store digits in an array
    public static int[] storeDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];

        int temp = number;
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        return digits;
    }

    // Method to find sum of digits
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    // Method to find sum of squares of digits
    public static int sumOfSquaresOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    // Method to check Harshad Number
    public static boolean isHarshadNumber(int number, int[] digits) {
        int sum = sumOfDigits(digits);
        return number % sum == 0;
    }

    // Method to find frequency of each digit
    public static int[][] digitFrequency(int[] digits) {
        int[][] freq = new int[10][2];

        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;   // digit
            freq[i][1] = 0;   // frequency
        }

        for (int digit : digits) {
            freq[digit][1]++;
        }
        return freq;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Count digits
        int count = NumberChecker.countDigits(number);
        System.out.println("\nNumber of digits: " + count);

        // Store digits
        int[] digits = NumberChecker.storeDigits(number);
        System.out.print("Digits: ");
        for (int d : digits) {
            System.out.print(d + " ");
        }
        System.out.println();

        // Sum of digits
        int sum = NumberChecker.sumOfDigits(digits);
        System.out.println("Sum of digits: " + sum);

        // Sum of squares of digits
        int sumSquares = NumberChecker.sumOfSquaresOfDigits(digits);
        System.out.println("Sum of squares of digits: " + sumSquares);

        // Harshad number check
        if (NumberChecker.isHarshadNumber(number, digits)) {
            System.out.println("Harshad Number: YES");
        } else {
            System.out.println("Harshad Number: NO");
        }

        // Digit frequency
        int[][] frequency = NumberChecker.digitFrequency(digits);
        System.out.println("\nDigit Frequency:");
        System.out.println("Digit  Frequency");
        for (int i = 0; i < 10; i++) {
            if (frequency[i][1] > 0) {
                System.out.println("  " + frequency[i][0] + "       " + frequency[i][1]);
            }
        }
    }
}
