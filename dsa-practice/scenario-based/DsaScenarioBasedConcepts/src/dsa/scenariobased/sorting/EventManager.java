package dsa.scenariobased.sorting;


public class EventManager {

    // Method to perform Quick Sort
    public static void quickSort(int[] prices, int low, int high) {
        if (low < high) {
            // Find pivot position
            int pivotIndex = partition(prices, low, high);

            // Recursively sort left and right partitions
            quickSort(prices, low, pivotIndex - 1);
            quickSort(prices, pivotIndex + 1, high);
        }
    }

    // Method to partition the array
    public static int partition(int[] prices, int low, int high) {
        int pivot = prices[high]; // Choosing last element as pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (prices[j] <= pivot) {
                i++;
                int temp = prices[i];
                prices[i] = prices[j];
                prices[j] = temp;
            }
        }
        // Placing pivot in correct position
        int temp = prices[i + 1];
        prices[i + 1] = prices[high];
        prices[high] = temp;

        return i + 1;
    }

    // Main method
    public static void main(String[] args) {
        int[] ticketPrices = {799, 299, 499, 999, 199, 599};
       //displaying result before sorting
        System.out.println("Before Sorting:");
        for (int price : ticketPrices) {
            System.out.print(price + " ");
        }
        quickSort(ticketPrices, 0, ticketPrices.length - 1);
        //displaying result before sorting
        System.out.println("\n\nAfter Sorting:");
        for (int price : ticketPrices) {
            System.out.print(price + " ");
        }
    }
}