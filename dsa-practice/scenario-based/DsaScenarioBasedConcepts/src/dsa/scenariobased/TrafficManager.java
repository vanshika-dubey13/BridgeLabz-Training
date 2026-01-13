package dsa.scenariobased;

import java.util.*;

//creating a class to simulate traffic manager - roundabout vehic flow
public class TrafficManager {

    static Scanner sc = new Scanner(System.in);

    // Circular Linked List (Roundabout vehicle flow)
    static LinkedList<String> roundabout = new LinkedList<>();

    // Queue for waiting vehicles
    static Queue<String> waitingQueue = new LinkedList<>();

    static int maxQueueSize = 5;
    static int currentIndex = 0;

    public static void main(String[] args) {

        int choice;
        
        //displaying menu
        do {
            System.out.println("\n===== Traffic Manager =====");
            System.out.println("1. Add Vehicle to Waiting Queue");
            System.out.println("2. Move Vehicle into Roundabout");
            System.out.println("3. Remove Vehicle from Roundabout");
            System.out.println("4. Rotate Roundabout");
            System.out.println("5. Show Roundabout State");
            System.out.println("6. Show Waiting Queue");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> addToQueue();
                case 2 -> enterRoundabout();
                case 3 -> removeFromRoundabout();
                case 4 -> rotateRoundabout();
                case 5 -> showRoundabout();
                case 6 -> showQueue();
                case 0 -> System.out.println("Traffic system stopped.");
                default -> System.out.println("Invalid choice!");
            }

        } while (choice != 0);
    }

    //method to handle queue overflow
    	public static void addToQueue() {
    		if (waitingQueue.size() == maxQueueSize) {
    			System.out.println("Waiting queue FULL! Vehicle cannot enter.");
    			return;
    		}

    		System.out.print("Enter vehicle number: ");
    		String vehicle = sc.nextLine();
    		waitingQueue.offer(vehicle);
    		System.out.println(vehicle + " added to waiting queue.");
    	}

    	// Move vehicle from queue to circular list
    	public static void enterRoundabout() {
    		if (waitingQueue.isEmpty()) {
    			System.out.println("Waiting queue EMPTY! No vehicle to enter.");
    			return;
    		}

    		String vehicle = waitingQueue.poll();
    		roundabout.add(vehicle);
    		System.out.println(vehicle + " entered the roundabout.");
    	}

    	// Remove vehicle from circular path
    	public static void removeFromRoundabout() {
    		if (roundabout.isEmpty()) {
    			System.out.println("Roundabout EMPTY! No vehicle to remove.");
    			return;
    		}

    		String removed = roundabout.remove(currentIndex);
    		currentIndex = currentIndex % (roundabout.isEmpty() ? 1 : roundabout.size());
    		System.out.println(removed + " exited the roundabout.");
    	}

    	// Rotate circular linked list
    	public static void rotateRoundabout() {
    		if (roundabout.isEmpty()) {
    			System.out.println("Roundabout EMPTY!");
    			return;
    		}

    		currentIndex = (currentIndex + 1) % roundabout.size();
    		System.out.println("Roundabout rotated. Current vehicle: "
    				+ roundabout.get(currentIndex));
    	}

    	// Print circular list state
    	public static void showRoundabout() {
    		if (roundabout.isEmpty()) {
    			System.out.println("Roundabout EMPTY!");
    			return;
    		}

    		System.out.println("Roundabout Vehicles (Circular):");
    		for (int i = 0; i < roundabout.size(); i++) {
    			if (i == currentIndex)
    				System.out.println("-> " + roundabout.get(i) + " (Current)");
    			else
    				System.out.println("   " + roundabout.get(i));
    		}
    	}

    	// Print queue state
    	public static void showQueue() {
    		System.out.println("Waiting Queue: " + waitingQueue);
    	}
}
