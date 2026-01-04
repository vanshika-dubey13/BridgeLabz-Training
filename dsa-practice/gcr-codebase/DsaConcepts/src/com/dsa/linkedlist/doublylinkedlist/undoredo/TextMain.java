package com.dsa.linkedlist.doublylinkedlist.undoredo;

import java.util.Scanner;

public class TextMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TextOperations editor = new TextOperations();

        int choice;
        String text;

        //displaying menu
        do {
            System.out.println("\n--- Text Editor ---");
            System.out.println("1. Add Text");
            System.out.println("2. Undo");
            System.out.println("3. Redo");
            System.out.println("4. Display Current Text");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter text: ");
                    text = sc.nextLine();
                    editor.addText(text);
                    break;

                case 2:
                    editor.undo();
                    break;

                case 3:
                    editor.redo();
                    break;

                case 4:
                    editor.display();
                    break;

                case 5:
                    System.out.println("Exiting Editor...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 5);

        sc.close();
    }
}
