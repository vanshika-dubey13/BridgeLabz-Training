package dsa.scenariobased;
import java.util.*;

public class BookShelfLibrary {

    // creating a genre to store list of books
    private HashMap<String, LinkedList<String>> catalog = new HashMap<>();

    // to avoid duplicate books
    private HashSet<String> bookSet = new HashSet<>();

    // Adding a book
    public void addBook(String genre, String bookName) {
        if (bookSet.contains(bookName)) {
            System.out.println("Duplicate book is not allowed: " + bookName);
            return;
        }

        //adding new books
        catalog.putIfAbsent(genre, new LinkedList<>());
        catalog.get(genre).add(bookName);
        bookSet.add(bookName);

        System.out.println("Book added: " + bookName);
    }

    // Borrowing a book
    public void borrowBook(String genre, String bookName) {
        LinkedList<String> books = catalog.get(genre);

        if (books != null && books.remove(bookName)) {
            bookSet.remove(bookName);
            System.out.println("Book borrowed: " + bookName);
        } else {
            System.out.println("Book not available: " + bookName);
        }
    }

    // Returning a book
    public void returnBook(String genre, String bookName) {
        addBook(genre, bookName);
    }

    // Displaying all books
    public void displayCatalog() {
        System.out.println("\nLibrary Catalog:");
        if (catalog.isEmpty()) {
            System.out.println("Library is empty.");
            return;
        }

        for (String genre : catalog.keySet()) {
            System.out.println("Genre: " + genre);
            for (String book : catalog.get(genre)) {
                System.out.println("  - " + book);
            }
        }
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BookShelfLibrary library = new BookShelfLibrary();

        while (true) {
        	//displaying menu
            System.out.println("\n===== Library Menu =====");
            System.out.println("1. Add Book");
            System.out.println("2. Borrow Book");
            System.out.println("3. Return Book");
            System.out.println("4. Display Catalog");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter genre: ");
                    String addGenre = sc.nextLine();
                    System.out.print("Enter book name: ");
                    String addBook = sc.nextLine();
                    library.addBook(addGenre, addBook);
                    break;

                case 2:
                    System.out.print("Enter genre: ");
                    String borrowGenre = sc.nextLine();
                    System.out.print("Enter book name: ");
                    String borrowBook = sc.nextLine();
                    library.borrowBook(borrowGenre, borrowBook);
                    break;

                case 3:
                    System.out.print("Enter genre: ");
                    String returnGenre = sc.nextLine();
                    System.out.print("Enter book name: ");
                    String returnBook = sc.nextLine();
                    library.returnBook(returnGenre, returnBook);
                    break;

                case 4:
                    library.displayCatalog();
                    break;

                case 5:
                    System.out.println("Exiting Library System. Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
