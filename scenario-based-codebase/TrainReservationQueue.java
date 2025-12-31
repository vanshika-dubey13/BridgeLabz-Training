import java.util.Scanner;

public class TrainReservationSystem {
    public static void main(String[] args) {
        // Considering number of seats
        int availableSeats = 100; 
        Scanner sc = new Scanner(System.in);

        while (true) {
            // Displaying menu
            System.out.println("Train Reservation System");
            System.out.println("1. Book Ticket");
            System.out.println("2. Check Available Seats");
            System.out.println("3. Exit");
            System.out.print("Please select an option (1-3): ");
            
            int choice = sc.nextInt();

            // Switch statement to handle user choices
            switch (choice) {
                case 1:
                    // Booking ticket if seats are available
                    if (availableSeats > 0) {
			System.out.print("--------");
                        System.out.println("Enter the number of tickets to book: ");
                        int ticketsToBook = sc.nextInt();

                        if (ticketsToBook <= availableSeats) {
                            availableSeats -= ticketsToBook;
                            System.out.println("\n" + ticketsToBook + " tickets booked successfully!\n");
                        } else {
                            System.out.println("\nSorry, not enough seats available.\n");
                        }
                    } else {
                        System.out.println("\nNo seats available for booking.\n");
                    }
                    break;

                case 2:
                    // Check available seats
                    System.out.println("\nAvailable seats: " + availableSeats +"\n");
                    break;

                case 3:
                    // Exit the system
                    System.out.println("\nThank you for using the Train Reservation System. Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("\nInvalid option, please try again.\n");
            }

            // If no seats are available, exit the program
            if (availableSeats == 0) {
                System.out.println("\nAll seats are booked! Exiting the system.\n");
                break;
            }
        }
    }
}
