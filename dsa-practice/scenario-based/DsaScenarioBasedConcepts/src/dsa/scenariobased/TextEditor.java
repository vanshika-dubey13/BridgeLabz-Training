package dsa.scenariobased;

import java.util.*;

//creating a class to simulate text editor - undo, redo operations
public class TextEditor {

    static Scanner sc = new Scanner(System.in);
    static StringBuilder text = new StringBuilder();

    static Stack<String> undoStack = new Stack<>();
    static Stack<String> redoStack = new Stack<>();

    public static void main(String[] args) {

        int choice;
        //displaying menu
        do {
            System.out.println("\n===== Text Editor =====");
            System.out.println("1. Insert Text");
            System.out.println("2. Delete Text");
            System.out.println("3. Undo");
            System.out.println("4. Redo");
            System.out.println("5. Show Text");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> insertText();
                case 2 -> deleteText();
                case 3 -> undo();
                case 4 -> redo();
                case 5 -> showText();
                case 0 -> System.out.println("Editor closed.");
                default -> System.out.println("Invalid choice!");
            }

        } while (choice != 0);
    }

    //method for inserting text
    public static void insertText() {
        System.out.print("Enter text to insert: ");
        String input = sc.nextLine();

        undoStack.push(text.toString());
        redoStack.clear();

        text.append(input);
        System.out.println("Text inserted.");
    }

    //method to delete text
    public static void deleteText() {
        if (text.length() == 0) {
            System.out.println("Nothing to delete.");
            return;
        }

        System.out.print("Enter number of characters to delete: ");
        int count = sc.nextInt();
        sc.nextLine();

        if (count > text.length())
            count = text.length();

        undoStack.push(text.toString());
        redoStack.clear();

        text.delete(text.length() - count, text.length());
        System.out.println("Text deleted.");
    }

    //method for undo
    public static void undo() {
        if (undoStack.isEmpty()) {
            System.out.println("Nothing to undo.");
            return;
        }

        redoStack.push(text.toString());
        text = new StringBuilder(undoStack.pop());
        System.out.println("Undo successful.");
    }

    //method for redo
    public static void redo() {
        if (redoStack.isEmpty()) {
            System.out.println("Nothing to redo.");
            return;
        }

        undoStack.push(text.toString());
        text = new StringBuilder(redoStack.pop());
        System.out.println("Redo successful.");
    }

    //method to display text
    public static void showText() {
        System.out.println("Current Text: \"" + text + "\"");
    }
}
