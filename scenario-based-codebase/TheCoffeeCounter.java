import java.util.Scanner;

public class CoffeeCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String coffeeType;
        int quantity;
        double totalBill;
        double gstRate = 0.18;  // 18% GST
        double gstAmount;
        
        // Coffee prices
        double espressoPrice = 100.0;
        double cappuccinoPrice = 150.0;
        double lattePrice = 120.0;
        double americanoPrice = 130.0;
        
        while (true) {
            System.out.println("Welcome to Ravi's Café!");
            System.out.println("Please select the coffee type (espresso, cappuccino, latte, americano) or type 'exit' to quit:");
            coffeeType = scanner.nextLine().toLowerCase();
            
            // Check if the user wants to exit
            if (coffeeType.equals("exit")) {
                System.out.println("Thank you for visiting Ravi's Café! Have a great day!");
                break;  // Exit the loop
            }
            
            // Ask for the quantity
            System.out.println("Enter the quantity:");
            quantity = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            
            // Calculate the total bill based on coffee type
            double price = 0.0;
            switch (coffeeType) {
                case "espresso":
                    price = espressoPrice;
                    break;
                case "cappuccino":
                    price = cappuccinoPrice;
                    break;
                case "latte":
                    price = lattePrice;
                    break;
                case "americano":
                    price = americanoPrice;
                    break;
                default:
                    System.out.println("Sorry, we don't serve that type of coffee.");
                    continue;  // Skip the rest of the loop and ask for the order again
            }
            
            // Calculate the total price
            totalBill = price * quantity;
            
            // Calculate the GST
            gstAmount = totalBill * gstRate;
            
            // Calculate the final amount including GST
            double finalAmount = totalBill + gstAmount;
            
            // Print the bill details
            System.out.println("\n--- Invoice ---");
            System.out.println("Coffee Type: " + coffeeType);
            System.out.println("Quantity: " + quantity);
            System.out.println("Total Price (Before GST): ₹" + totalBill);
            System.out.println("GST (18%): ₹" + gstAmount);
            System.out.println("Final Total (Including GST): ₹" + finalAmount);
            System.out.println("------------------\n");
        }
        
        scanner.close();
    }
}
