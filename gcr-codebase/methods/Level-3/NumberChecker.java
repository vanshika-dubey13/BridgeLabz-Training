import java.util.Scanner;

class NumberChecker {

    // Method to find count of digits
    public static int countDigits(int n) {
        int count = 0;
        int temp = n;
        while (temp != 0) {
            count++;
            temp /= 10;
        }
        return count;
    }

    // Method to store digits in an array
    public static int[] storeDigits(int n) {
        int count = countDigits(n);
        int[] digits = new int[count];
        int temp = n;
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        return digits;
    }

    // Method to check Duck Number 
    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit != 0) {
                return true;
            }
        }
        return false;
    }

    // Method to check Armstrong Number
    public static boolean isArmstrong(int n, int[] digits) {
        int power = digits.length;
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, power);
        }
        return sum == n;
    }

    // Method to find largest and second largest digits
    public static void findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }

        System.out.println("Largest digit: " + largest);
        System.out.println("Second Largest digit: " + secondLargest);
    }

    // Method to find smallest and second smallest digits
    public static void findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }

        System.out.println("Smallest digit: " + smallest);
        System.out.println("Second Smallest digit: " + secondSmallest);
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Count digits
        int digitCount = NumberChecker.countDigits(number);
        System.out.println("\nNumber of digits: " + digitCount);

        // Store digits
        int[] digits = NumberChecker.storeDigits(number);
        System.out.print("Digits: ");
        for (int d : digits) {
            System.out.print(d + " ");
        }
        System.out.println();

        // Duck Number check
        if (NumberChecker.isDuckNumber(digits)) {
            System.out.println("Duck Number: YES");
        } else {
            System.out.println("Duck Number: NO");
        }

        // Armstrong Number check
        if (NumberChecker.isArmstrong(number, digits)) {
            System.out.println("Armstrong Number: YES");
        } else {
            System.out.println("Armstrong Number: NO");
        }

        // Largest & Second Largest
        NumberChecker.findLargestAndSecondLargest(digits);

        // Smallest & Second Smallest
        NumberChecker.findSmallestAndSecondSmallest(digits);
    }
}