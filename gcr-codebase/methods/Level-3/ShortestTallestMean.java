//Creating a class to calculate the shortest, tallest, and mean height of players present in a football team.


public class ShortestTallestMean {

    // Method to find the sum of all elements
    public static int findSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    // Method to find mean height
    public static double findMeanHeight(int[] arr) {
        int sum = findSum(arr);
        return (double) sum / arr.length;
    }

    // Method to find shortest height
    public static int findShortest(int[] arr) {
        int shortest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < shortest) {
                shortest = arr[i];
            }
        }
        return shortest;
    }

    // Method to find tallest height
    public static int findTallest(int[] arr) {
        int tallest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > tallest) {
                tallest = arr[i];
            }
        }
        return tallest;
    }

    public static void main(String[] args) {

        int[] heights = new int[11];

        // Generate random heights between 150 and 250
        for (int i = 0; i < heights.length; i++) {
            heights[i] = (int) (Math.random() * 101) + 150;
        }

        // Display results
        System.out.println("Sum of all elements: " + findSum(heights));
        System.out.println("Mean of all elements: " + findMeanHeight(heights));
        System.out.println("Shortest height: " + findShortest(heights));
        System.out.println("Tallest height: " + findTallest(heights));
    }
}
