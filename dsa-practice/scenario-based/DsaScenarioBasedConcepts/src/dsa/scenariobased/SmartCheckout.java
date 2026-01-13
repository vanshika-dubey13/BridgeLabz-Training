package dsa.scenariobased;

import java.util.*;

class Customer {
	
	//attributes
    String name;
    List<String> items;

    //constructor
    Customer(String name, List<String> items) {
        this.name = name;
        this.items = items;
    }
}

public class SmartCheckout {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // creating a queue for storing customers
        Queue<Customer> customerQueue = new LinkedList<>();

        //creating hashmaps for storing prices and stocks
        HashMap<String, Integer> priceMap = new HashMap<>();
        HashMap<String, Integer> stockMap = new HashMap<>();

        //taking items in supermarket as user input
        System.out.print("Enter number of items in store: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter item name: ");
            String item = sc.next();
            System.out.print("Enter price: ");
            int price = sc.nextInt();
            System.out.print("Enter stock: ");
            int stock = sc.nextInt();

            priceMap.put(item, price);
            stockMap.put(item, stock);
        }

        //displaying menu
        while (true) {
            System.out.println("\n1. Add Customer");
            System.out.println("2. Process Customer");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter customer name: ");
                    String cName = sc.next();
                    System.out.print("Enter number of items: ");
                    int itemCount = sc.nextInt();
                    List<String> items = new ArrayList<>();
                    for (int i = 0; i < itemCount; i++) {
                        System.out.print("Enter item name: ");
                        items.add(sc.next());
                    }

                    customerQueue.add(new Customer(cName, items));
                    System.out.println("Customer added to queue.");
                    break;

                case 2:
                    if (customerQueue.isEmpty()) {
                        System.out.println("No customers in queue.");
                        break;
                    }

                    Customer current = customerQueue.poll();
                    int total = 0;

                    System.out.println("Processing customer: " + current.name);

                    for (String item : current.items) {
                        if (stockMap.containsKey(item) && stockMap.get(item) > 0) {
                            total += priceMap.get(item);
                            stockMap.put(item, stockMap.get(item) - 1);
                        } else {
                            System.out.println(item + " is out of stock.");
                        }
                    }

                    System.out.println("Total Bill: Rs. " + total);
                    break;

                case 3:
                    System.out.println("Exiting system.");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
