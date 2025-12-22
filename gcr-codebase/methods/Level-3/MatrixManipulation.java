import java.util.Random;

public class MatrixManipulation {

	// Method to create a random matrix
	static int[][] createMatrix(int rows, int cols) {
		Random r = new Random();
		int[][] matrix = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				matrix[i][j] = r.nextInt(10) + 1; // 1 to 10
			}
		}
		return matrix;
	}

	// Method to display a matrix
	static void displayMatrix(int[][] matrix) {
		for (int[] row : matrix) {
			for (int value : row) {
				System.out.printf("%5d", value);
			}
			System.out.println();
		}
	}

	// Method to add two matrices
	static int[][] addMatrices(int[][] a, int[][] b) {
		int rows = a.length;
		int cols = a[0].length;
		int[][] res = new int[rows][cols];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				res[i][j] = a[i][j] + b[i][j];
			}
		}
		return res;
	}

	// Method to subtract two matrices
	static int[][] subtractMatrices(int[][] a, int[][] b) {
		int rows = a.length;
		int cols = a[0].length;
		int[][] result = new int[rows][cols];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				result[i][j] = a[i][j] - b[i][j];
			}
		}
		return result;
	}

	// Method to multiply two matrices
	static int[][] multiplyMatrices(int[][] a, int[][] b) {
		int rows = a.length;
		int cols = b[0].length;
		int common = b.length;

		int[][] result = new int[rows][cols];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				for (int k = 0; k < common; k++) {
					result[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		return result;
	}

	// Main method
	public static void main(String[] args) {

		int rows = 3, cols = 3;

		// Creating random matrices
		int[][] matrixA = createMatrix(rows, cols);
		int[][] matrixB = createMatrix(rows, cols);

		System.out.println("Matrix A:");
		displayMatrix(matrixA);
		System.out.println("\nMatrix B:");
		displayMatrix(matrixB);

		// Addition
		System.out.println("\nAddition (A + B):");
		displayMatrix(addMatrices(matrixA, matrixB));

		// Subtraction
		System.out.println("\nSubtraction (A - B):");
		displayMatrix(subtractMatrices(matrixA, matrixB));

		// Multiplication
		System.out.println("\nMultiplication (A × B):");
		displayMatrix(multiplyMatrices(matrixA, matrixB));
	}
}
