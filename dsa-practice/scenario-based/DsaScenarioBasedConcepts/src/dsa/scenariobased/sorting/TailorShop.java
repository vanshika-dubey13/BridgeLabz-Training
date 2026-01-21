package dsa.scenariobased.sorting;

import java.util.Scanner;

class Order {
	//attributes
    int orderId;
    int deadline; 

    //constructor
    Order(int orderId, int deadline) {
        this.orderId = orderId;
        this.deadline = deadline;
    }
}

public class TailorShop {

    //method to perform insertion sort
    public static void insertionSort(Order[] orders, int n) {
        for (int i = 1; i < n; i++) {
            Order key = orders[i];
            int j = i - 1;
            while (j >= 0 && orders[j].deadline > key.deadline) {
                orders[j + 1] = orders[j];
                j--;
            }
            orders[j + 1] = key;
        }
    }

    public static void displayOrders(Order[] orders, int n) {
        System.out.println("\nOrders sorted by delivery deadline:");
        for (int i = 0; i < n; i++) {
            System.out.println(
                "Order ID: " + orders[i].orderId +
                ", Deadline: " + orders[i].deadline + " days"
            );
        }
    }

    //main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of orders: ");
        int n = sc.nextInt();
        Order[] orders = new Order[n];
        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter Order ID: ");
            int id = sc.nextInt();
            System.out.print("Enter delivery deadline (in days): ");
            int deadline = sc.nextInt();
            orders[i] = new Order(id, deadline);
        }

        insertionSort(orders, n);
        displayOrders(orders, n);

        sc.close();
    }
}
