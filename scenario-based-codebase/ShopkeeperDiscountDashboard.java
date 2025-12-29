import java.util.Scanner;

public class ShopkeepersDiscountDashboard {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double totalBill = 0.0;

        // Asking for number of items purchased by user
        System.out.print("Enter number of items: ");
        int items = sc.nextInt();

        // Input item prices using for-loop
        for (int i = 1; i <= items; i++) {
            System.out.print("Enter price of item " + i + ": ");
            double price = sc.nextDouble();
            totalBill += price;
        }

        double discount = 0.0;

        // Discount logic using if-else
        if (totalBill >= 7000) {
            discount = 1500;
        } else if (totalBill >= 5500) {
            discount = 900;
        } 
	else if (totalBill >= 3000) {
            discount = 500;
        }else {
            discount = 0.0;
        }

        double finalAmount = totalBill - discount;

        // Output
        System.out.println("\n----- BILL SUMMARY -----");
        System.out.println("Total Bill: Rs. " + totalBill);
        System.out.println("Discount: Rs. " + discount);
        System.out.println("Final Amount to Pay: Rs. " + finalAmount);

        sc.close();
    }
}
