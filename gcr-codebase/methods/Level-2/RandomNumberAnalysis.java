//Creating a class that generates five 4 digit random values and then finds their average value, and their minimum and maximum value. Use Math.random(), Math.min(), and Math.max().

public class RandomNumberAnalysis {

    // Creating a method to generate array of 4-digit random numbers
    public static int[] generateRandomArray(int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            // Generating random number between 1000 and 9999
            numbers[i] = (int)(Math.random() * 9000) + 1000;
        }
        return numbers;
    }

    // Creating method to find average, minimum, and maximum

    public static double[] findAverageMinMax(int[] numbers) {
        int minimum = numbers[0];
        int maximum = numbers[0];
        int sum = 0;
        for (int i=0; i<numbers.length; i++) {
            sum = sum + numbers[i];
            minimum = Math.min(minimum, numbers[i]);
            maximum = Math.max(maximum, numbers[i]);
        }
        double average = (double) sum / numbers.length;
        return new double[]{average, minimum, maximum};
    }

    public static void main(String[] args) {

        int size = 5;
        // Generate random numbers
        int[] numbers = generateRandomArray(size);
        // Displaying generated numbers
        System.out.println("Generated 4-digit random numbers:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        // Find average, min, and max
        double[] result = findAverageMinMax(numbers);

        System.out.println("\n\nAverage value: " + result[0]);
        System.out.println("Minimum value: " + (int) result[1]);
        System.out.println("Maximum value: " + (int) result[2]);
    }
}
