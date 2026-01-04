package com.dsa.linkedlist.doublyinkedlist.undoredotexteditor;

import java.util.Scanner;

public class TextEditorMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TextEditorOperations editor = new TextEditorOperations();
        int choice = -1;   // ✅ FIX HERE

        do {
            System.out.println("\n1. Type Text");
            System.out.println("2. Undo");
            System.out.println("3. Redo");
            System.out.println("4. Display Current Text");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            if (!sc.hasNextInt()) {
                System.out.println("Invalid input! Enter a number.");
                sc.next();
                continue;
            }

            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter text: ");
                    editor.addState(sc.nextLine());
                    break;

                case 2:
                    editor.undo();
                    break;

                case 3:
                    editor.redo();
                    break;

                case 4:
                    editor.displayCurrentState();
                    break;

                case 0:
                    System.out.println("Exiting editor...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 0);

        sc.close();
    }
}
