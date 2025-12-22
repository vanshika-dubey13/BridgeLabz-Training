import java.util.Scanner;

public class Factors {

    // Creating a method to find factors of a number and returning them as an array
    public static int[] findFactors(int num) {
        int count = 0;
        // Counting number of factors
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        // Creating array to store factors
        int[] factors = new int[count];
        int index = 0;
        // Storing factors in array
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    // Creating a method to find the greatest factor
    public static int greatestFactor(int[] factors) {
        int max = factors[0];
        for (int i=0; i<factors.length; i++) {
            if (factors[i] > max) {
                max = factors[i];
            }
        }
        return max;
    }

    // Creating a method to find the sum of factors
    public static int sumFactors(int[] factors) {
        int sum = 0;
        for (int i=0; i<factors.length; i++) {
            sum += factors[i];
        }
        return sum;
    }

    // Creating a method to find the product of factors
    public static long productFactors(int[] factors) {
        long product = 1;
        for (int i=0; i<factors.length; i++) {
            product *= factors[i];
        }
        return product;
    }

    // Creating a method to find the product of the cube of factors
    public static double productCubes(int[] factors) {
        double product = 1;
        for (int i=0; i<factors.length; i++) {
            product *= Math.pow(factors[i], 3);
        }
        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int[] factors = findFactors(num);
        System.out.print("Factors: ");
        for (int i=0; i<factors.length; i++) {
            System.out.print(factors[i] + " ");
        }

        System.out.println("\nGreatest Factor: " + greatestFactor(factors));
        System.out.println("Sum of Factors: " + sumFactors(factors));
        System.out.println("Product of Factors: " + productFactors(factors));
        System.out.println("Product of Cubes of Factors: " + productCubes(factors));

        sc.close();
    }
}
