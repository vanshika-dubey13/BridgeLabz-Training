package com.dsa.linkedlist.doublyinkedlist.undoredotexteditor;

public class TextEditorOperations {
    private TextStateNode head;
    private TextStateNode tail;
    private TextStateNode current;
    private int size;
    private final int MAX_HISTORY = 10;

    // Add new text state
    public void addState(String text) {
        TextStateNode newNode = new TextStateNode(text);

        // If undo was used, clear redo history
        if (current != null && current.next != null) {
            current.next.prev = null;
            current.next = null;
            tail = current;
        }

        if (head == null) {
            head = tail = current = newNode;
            size = 1;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        current = newNode;
        size++;

        // Limit history size
        if (size > MAX_HISTORY) {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    // Undo operation
    public void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
        } else {
            System.out.println("Nothing to undo.");
        }
    }

    // Redo operation
    public void redo() {
        if (current != null && current.next != null) {
            current = current.next;
        } else {
            System.out.println("Nothing to redo.");
        }
    }

    // Display current text
    public void displayCurrentState() {
        if (current != null) {
            System.out.println("Current Text: " + current.text);
        } else {
            System.out.println("Editor is empty.");
        }
    }
}
