package dsa.scenariobased.sorting;

import java.util.Scanner;
import java.util.Random;

//class to store product attributes
class Product {
    String name;
    double discount;

    Product(String name, double discount) {
        this.name = name;
        this.discount = discount;
    }
}

public class FlashDealz {

    //method to perform quick sort
    public static void quickSort(Product[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    // Partition using random pivot
    static int partition(Product[] arr, int low, int high) {
        Random rand = new Random();
        int randomIndex = low + rand.nextInt(high - low + 1);
        swap(arr, randomIndex, high);
        double pivot = arr[high].discount;
        int i = low - 1;
        for (int j = low; j < high; j++) {
            // Sorting in descending order of discount percentage
            if (arr[j].discount > pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    //helper method to perform swapping
    public static void swap(Product[] arr, int i, int j) {
        Product temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        sc.nextLine(); 
        //taking user ip for product name and discount percentage
        Product[] products = new Product[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of product "+ (i+1) +" : ");
            String name = sc.nextLine();

            System.out.print("Enter discount (%): ");
            double discount = sc.nextDouble();
            sc.nextLine();

            products[i] = new Product(name, discount);
        }

        quickSort(products, 0, n - 1);

        //displaying results
        System.out.println("\nTop Discounted Products");
        for (Product p : products) {
            System.out.println(p.name + " - " + p.discount + "% OFF");
        }

        sc.close();
    }
}
