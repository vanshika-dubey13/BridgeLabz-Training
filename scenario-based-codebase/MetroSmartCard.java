import java.util.Scanner;

public class MetroSmartCard {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double cardBalance = 200; // initial balance
        int distance;
        double fare;

        while (cardBalance > 0) {
            System.out.println("\nCurrent Balance: Rs." + cardBalance);
            System.out.print("Enter distance in km (or -1 to quit): ");
            distance = sc.nextInt();

            if (distance == -1) {
                break; // user quits
            }

            // Ternary operator for fare calculation
            fare = (distance <= 5) ? 10 : (distance <= 10) ? 20 : 30;

            if (fare <= cardBalance) {
                cardBalance = cardBalance - fare;
                System.out.println("Fare deducted: ₹" + fare);
            } else {
                System.out.println("Insufficient balance!");
                break;
            }
        }

        System.out.println("\nThank you for using Delhi Metro 🚇");
        System.out.println("Remaining Balance: ₹" + cardBalance);

        sc.close();
    }
}
