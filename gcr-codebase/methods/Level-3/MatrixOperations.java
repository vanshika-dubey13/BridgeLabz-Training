import java.util.Random;
public class MatrixOperations {

	//Method to create a random matrix
	static double[][] createRandomMatrix(int rows, int cols) {
        	Random r = new Random();
        	double[][] matrix = new double[rows][cols];
        	for (int i = 0; i < rows; i++) {
        		for (int j = 0; j < cols; j++) {
                		matrix[i][j] = r.nextInt(10) + 1; // values 1 to 10
            		}
        	}return matrix;
	}

	//Method to display a matrix
	static void displayMatrix(double[][] matrix) {
        	for (double[] row : matrix) {
     			for (double value : row) {
                		System.out.printf("%8.2f", value);
            		}
            	System.out.println();
		}
    	}

	//Method to find transpose
    	static double[][] transpose(double[][] matrix) {
        	int rows = matrix.length;
        	int cols = matrix[0].length;
        	double[][] trans = new double[cols][rows];

        	for (int i = 0; i < rows; i++) {
            		for (int j = 0; j < cols; j++) {
                	trans[j][i] = matrix[i][j];
            		}
        	}return trans;
    	}

	//Determinant of 2x2 matrix
    	static double determinant2x2(double[][] m) {
        	return (m[0][0] * m[1][1]) - (m[0][1] * m[1][0]);
    	}

    	// Determinant of 3x3 matrix
    	static double determinant3x3(double[][] m) {
        	return m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1])
             - m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0])
             + m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
    	}

	//Inverse of 2x2 matrix
    	static double[][] inverse2x2(double[][] m) {
        	double det = determinant2x2(m);
        	if (det == 0) {
        	    return null;
        	}
        	double[][] inv = new double[2][2];
        	inv[0][0] =  m[1][1] / det;
        	inv[0][1] = -m[0][1] / det;
        	inv[1][0] = -m[1][0] / det;
        	inv[1][1] =  m[0][0] / det;
        	return inv;
    	}

	//Inverse of 3x3 matrix
    	static double[][] inverse3x3(double[][] m) {
        	double det = determinant3x3(m);
        	if (det == 0) {
        	    return null;
        }

        	double[][] inv = new double[3][3];

        	inv[0][0] = (m[1][1]*m[2][2] - m[1][2]*m[2][1]) / det;
        	inv[0][1] = (m[0][2]*m[2][1] - m[0][1]*m[2][2]) / det;
        	inv[0][2] = (m[0][1]*m[1][2] - m[0][2]*m[1][1]) / det;

        	inv[1][0] = (m[1][2]*m[2][0] - m[1][0]*m[2][2]) / det;
        	inv[1][1] = (m[0][0]*m[2][2] - m[0][2]*m[2][0]) / det;
        	inv[1][2] = (m[0][2]*m[1][0] - m[0][0]*m[1][2]) / det;

        	inv[2][0] = (m[1][0]*m[2][1] - m[1][1]*m[2][0]) / det;
        	inv[2][1] = (m[0][1]*m[2][0] - m[0][0]*m[2][1]) / det;
        	inv[2][2] = (m[0][0]*m[1][1] - m[0][1]*m[1][0]) / det;

        	return inv;
	}

	public static void main(String[] args) {

        // 2x2 Matrix
        System.out.println("2x2 Matrix:");
        double[][] matrix2 = createRandomMatrix(2, 2);
        displayMatrix(matrix2);
        System.out.println("\nTranspose:");
        displayMatrix(transpose(matrix2));
        double det2 = determinant2x2(matrix2);
        System.out.println("\nDeterminant: " + det2);
        System.out.println("\nInverse:");
        double[][] inv2 = inverse2x2(matrix2);
        if (inv2 != null){
        	displayMatrix(inv2);
	}
        else{
            	System.out.println("Inverse does not exist");
	}
        // 3x3 Matrix
        System.out.println("\n\n3x3 Matrix:");
        double[][] matrix3 = createRandomMatrix(3, 3);
        displayMatrix(matrix3);

        System.out.println("\nTranspose:");
        displayMatrix(transpose(matrix3));

        double det3 = determinant3x3(matrix3);
        System.out.println("\nDeterminant: " + det3);

        System.out.println("\nInverse:");
        double[][] inverse3 = inverse3x3(matrix3);
        if (inverse3 != null){
            displayMatrix(inverse3);
	}
        else{
            System.out.println("Inverse does not exist");
	}
    }
}
