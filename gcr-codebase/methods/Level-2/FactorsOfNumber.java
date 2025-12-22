//Creating a class to  find the factors of a number taken as user input, store the factors in an array, and display the factors. Also find the sum, sum of square of factors and product of the factors and display the results using a method


import java.util.Scanner;
public class FactorsOfNumber {
	
	//Creating a method to find factors and return factors as an array
	public static int[] findFactors(int num) {
		 int count = 0;
        	// Finding factors of number
        	for (int i = 1; i <= num; i++) {
            		if (num % i == 0) {
				count++;
		}
	}
	//Storing the factors in an array
	int[] factors = new int[count];
        int index = 0;
	for (int i = 1; i <= num; i++) {
            	if (num % i == 0) {
			factors[index] = i;
			index++;
		}
	     }
		    return factors;
	}


	//Creating a method to find sum of factors

	public static int findSum(int[] factors) {
		 int sum = 0;
        	// Finding sum of factors
        	for (int i = 0; i < factors.length; i++) {
            		sum = sum + factors[i];
		}
		return sum;
	}


	//Creating a method to find product of factors

	public static long findProduct(int[] factors) {
		 long product = 1;
        	// Finding product of factors
        	for (int i = 0; i < factors.length; i++) {
            		product = product * factors[i];
		}
		return product;
	}

	//Creating a method to find sum of squares of factors

	public static double findSumOfSquares(int[] factors) {
		 double sumSquares = 0;
        	// Finding sum of squares of factors
        	for (int i = 0; i < factors.length; i++) {
            		sumSquares = sumSquares + Math.pow(factors[i],2);
		}
		return sumSquares;
	}


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking input from user
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        //Getting factors
        int[] factors = findFactors(num);
                  
        // Displaying factors
        System.out.print("Factors of " + num + " are:");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }

	//Displaying sum, product, sum of squares of factors
	System.out.println("\nSum of factors : " + findSum(factors));
	System.out.println("Product of factors : " + findProduct(factors));
	System.out.println("Sum of squares factors : " + findSumOfSquares(factors));

        sc.close();
    }
}
