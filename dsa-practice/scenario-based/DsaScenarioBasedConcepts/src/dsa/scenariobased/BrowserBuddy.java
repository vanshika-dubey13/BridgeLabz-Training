package dsa.scenariobased;

import java.util.*;


public class BrowserBuddy {

    static Scanner sc = new Scanner(System.in);

    static LinkedList<String> history = new LinkedList<>();
    static int currentIndex = -1;

    static Stack<LinkedList<String>> closedTabs = new Stack<>();
    static Stack<Integer> closedIndex = new Stack<>();

    public static void main(String[] args) {

        int choice;
        do {
            System.out.println("\n===== BrowserBuddy =====");
            System.out.println("1. Visit New Page");
            System.out.println("2. Back");
            System.out.println("3. Forward");
            System.out.println("4. Show Current Page");
            System.out.println("5. Close Tab");
            System.out.println("6. Restore Closed Tab");
            System.out.println("7. Show Full History");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> visitPage();
                case 2 -> goBack();
                case 3 -> goForward();
                case 4 -> showCurrent();
                case 5 -> closeTab();
                case 6 -> restoreTab();
                case 7 -> showHistory();
                case 0 -> System.out.println("Browser closed.");
                default -> System.out.println("Invalid choice!");
            }

        } while (choice != 0);
    }

    static void visitPage() {
        System.out.print("Enter URL: ");
        String url = sc.nextLine();

        while (history.size() > currentIndex + 1) {
            history.removeLast();
        }

        history.add(url);
        currentIndex++;
        System.out.println("Visited: " + url);
    }

    static void goBack() {
        if (currentIndex > 0) {
            currentIndex--;
            System.out.println("Back to: " + history.get(currentIndex));
        } else {
            System.out.println("No previous page.");
        }
    }

    static void goForward() {
        if (currentIndex < history.size() - 1) {
            currentIndex++;
            System.out.println("Forward to: " + history.get(currentIndex));
        } else {
            System.out.println("No forward page.");
        }
    }

    static void showCurrent() {
        if (currentIndex >= 0) {
            System.out.println("Current Page: " + history.get(currentIndex));
        } else {
            System.out.println("No page opened.");
        }
    }

    static void closeTab() {
        if (!history.isEmpty()) {
            closedTabs.push(new LinkedList<>(history));
            closedIndex.push(currentIndex);
            history.clear();
            currentIndex = -1;
            System.out.println("Tab closed.");
        } else {
            System.out.println("No tab to close.");
        }
    }

    static void restoreTab() {
        if (!closedTabs.isEmpty()) {
            history = closedTabs.pop();
            currentIndex = closedIndex.pop();
            System.out.println("Tab restored. Current page: " + history.get(currentIndex));
        } else {
            System.out.println("No closed tabs available.");
        }
    }

    static void showHistory() {
        if (history.isEmpty()) {
            System.out.println("History empty.");
            return;
        }

        System.out.println("Browsing History:");
        for (int i = 0; i < history.size(); i++) {
            if (i == currentIndex)
                System.out.println("-> " + history.get(i) + " (Current)");
            else
                System.out.println("   " + history.get(i));
        }
    }
}
