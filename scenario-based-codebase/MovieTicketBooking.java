import java.util.Scanner;

public class MovieTicketBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of customers: ");
        int totalCustomers = sc.nextInt();
        
        for (int i = 1; i <= totalCustomers; i++) {
            System.out.println("\n--- Booking for Customer " + i + " ---");

            // Asking for movie Type
            System.out.println("Choose movie type:");
            System.out.println("1. Action");
            System.out.println("2. Comedy");
            System.out.println("3. Drama");
            System.out.print("Enter your choice (1-3): ");
            int movieChoice = sc.nextInt();
            String movieType = "";
            switch (movieChoice) {
                case 1 -> movieType = "Action";
                case 2 -> movieType = "Comedy";
                case 3 -> movieType = "Drama";
                default -> {
                    System.out.println("Invalid choice! Defaulting to Drama.");
                    movieType = "Drama";
                }
            }

            // Asking for seat type booking
            System.out.println("Choose seat type:");
            System.out.println("1. Gold");
            System.out.println("2. Silver");
            System.out.print("Enter your choice (1-2): ");
            int seatChoice = sc.nextInt();
            String seatType = "";
            int ticketPrice = 0;
            switch (seatChoice) {
                case 1 -> {
                    seatType = "Gold";
                    ticketPrice = 300;
                }
                case 2 -> {
                    seatType = "Silver";
                    ticketPrice = 200;
                }
                default -> {
                    System.out.println("Invalid choice! Defaulting to Silver.");
                    seatType = "Silver";
                    ticketPrice = 200;
                }
            }

            // Snacks
            System.out.println("Do you want snacks? (yes/no): ");
            String wantsSnacks = sc.nextLine();
            int snacksPrice = 0;

            if (wantsSnacks.equalsIgnoreCase("yes")) {
                System.out.println("Choose snack:");
                System.out.println("1. Popcorn - 50");
                System.out.println("2. Nachos - 70");
                System.out.print("Enter your choice (1-2): ");
                int snackChoice = sc.nextInt();
                //scanner.nextLine(); // Consume newline

                switch (snackChoice) {
                    case 1 -> {
                        snacksPrice = 50;
                        System.out.println("Popcorn added.");
                    }
                    case 2 -> {
                        snacksPrice = 70;
                        System.out.println("Nachos added.");
                    }
                    default -> System.out.println("No snacks added.");
                }
            }

            int totalPrice = ticketPrice + snacksPrice;

            // displaying results
            System.out.println("\n--- Booking Summary for Customer " + i + " ---");
            System.out.println("Movie Type: " + movieType);
            System.out.println("Seat Type: " + seatType);
            System.out.println("Ticket Price: " + ticketPrice);
            System.out.println("Snacks Price: " + snacksPrice);
            System.out.println("Total Price: " + totalPrice);
            System.out.println("----------------------------");
        }

        System.out.println("\nAll bookings completed. Enjoy your movies!");
        sc.close();
    }
}
