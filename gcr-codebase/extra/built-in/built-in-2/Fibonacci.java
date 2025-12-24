import java.util.Scanner;

public class Fibonacci {

    // Function to generate and print the Fibonacci sequence
    public static void generateFibonacci(int terms) {
        // First two terms of the Fibonacci sequence
        int a = 0, b = 1;
        
        // Print the first two terms
        System.out.print("Fibonacci Sequence: ");
        
        // If the number of terms is 1, only print the first term
        if (terms >= 1) {
            System.out.print(a + " ");
        }
        
        // If the number of terms is 2, also print the second term
        if (terms >= 2) {
            System.out.print(b + " ");
        }
        
        // Calculate and print the remaining terms
        for (int i = 3; i <= terms; i++) {
            int next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }
        
        System.out.println(); // Print a newline at the end
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Asking the user for the number of terms in the Fibonacci sequence
        System.out.print("Enter the number of terms for the Fibonacci sequence: ");
        int terms = sc.nextInt();
        
        generateFibonacci(terms);
        sc.close();
    }
}
