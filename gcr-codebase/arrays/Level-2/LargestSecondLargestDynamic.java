//Creating a class to find largest and second largest number in array
import java.util.Scanner;

public class LargestSecondLargestDynamic {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int maxDigit = 10;

        // Array to store digits
        int[] digits = new int[maxDigit];
        // Index to track array position
        int index = 0;
        // Extracting digits and storing in array
        while (num != 0 ) {
		if(index == maxDigit) {
			maxDigit = maxDigit + 10;
			int temp[] = new int[maxDigit];
		//Copying old array elements into new array temp
		for (int i=0; i<digits.length; i++){
			temp[i] = digits[i];
			}
			digits =temp;
		}
            	digits[index] = num % 10; 
		index++;

            	num = num / 10;
                  }
        // Creating variables to store largest and second largest
        int largest = 0;
        int secondLargest = 0;
        // Finding the largest and second largest digit
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
		largest = digits[i];
            }
	   else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Displaying largest and second largest values 
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);

        sc.close();
    }
}


