package dsa.scenariobased;

import java.util.*;

//creating a class to simulate call center - customer queue manager
public class CallCenter {

    static Scanner sc = new Scanner(System.in);

    //normal queue for storing non-vip customers
    static Queue<String> normalQueue = new LinkedList<>();
    //priority queue for storing vip customers
    static PriorityQueue<String> vipQueue = new PriorityQueue<>();
    static HashMap<String, Integer> callCount = new HashMap<>();

    public static void main(String[] args) {

        int choice;
        //displaying menu
        do {
            System.out.println("\n===== Call Center System =====");
            System.out.println("1. Add Normal Customer Call");
            System.out.println("2. Add VIP Customer Call");
            System.out.println("3. Serve Next Call");
            System.out.println("4. Show Queues");
            System.out.println("5. Show Customer Call Count");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> addNormalCall();
                case 2 -> addVipCall();
                case 3 -> serveCall();
                case 4 -> showQueues();
                case 5 -> showCallCount();
                case 0 -> System.out.println("Call Center Closed.");
                default -> System.out.println("Invalid choice!");
            }

        } while (choice != 0);
    }

    // method to add normal customer
    public static void addNormalCall() {
        System.out.print("Enter customer name: ");
        String name = sc.nextLine();

        normalQueue.offer(name);
        callCount.put(name, callCount.getOrDefault(name, 0) + 1);

        System.out.println(name + " added to normal queue.");
    }

    //method to add vip customer
    public static void addVipCall() {
        System.out.print("Enter VIP customer name: ");
        String name = sc.nextLine();

        vipQueue.offer(name);
        callCount.put(name, callCount.getOrDefault(name, 0) + 1);

        System.out.println(name + " added to VIP queue.");
    }

    //method to serve customers
    public static void serveCall() {
        if (!vipQueue.isEmpty()) {
            System.out.println("Serving VIP customer: " + vipQueue.poll());
        } else if (!normalQueue.isEmpty()) {
            System.out.println("Serving normal customer: " + normalQueue.poll());
        } else {
            System.out.println("No calls in queue.");
        }
    }

    //method to display queue
    public static void showQueues() {
        System.out.println("VIP Queue: " + vipQueue);
        System.out.println("Normal Queue: " + normalQueue);
    }

    //method to display call count
    public static void showCallCount() {
        if (callCount.isEmpty()) {
            System.out.println("No customer data available.");
            return;
        }

        System.out.println("Customer Call Count:");
        for (Map.Entry<String, Integer> entry : callCount.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue() + " calls");
        }
    }
}
