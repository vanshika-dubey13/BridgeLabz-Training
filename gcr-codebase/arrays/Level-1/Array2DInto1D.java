//Creating a class to create a 2D Array and Copy the 2D Array into a single dimension array


import java.util.Scanner;
public class Array2DInto1D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking rows and columns as input
        System.out.print("Enter number of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int col = sc.nextInt();
        // Creating 2D matrix
        int[][] matrix = new int[row][col];

        // Taking elements as input for 2D array
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        // Creating array of size = rows * columns
        int[] array = new int[row * col];
        // Copying elements from 2D array to 1D array
        int index = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                array[index] = matrix[i][j];
                index++;
            }
        }
        // Displaying 1D array
        System.out.println("Elements in 1D Array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        sc.close();
    }
}
