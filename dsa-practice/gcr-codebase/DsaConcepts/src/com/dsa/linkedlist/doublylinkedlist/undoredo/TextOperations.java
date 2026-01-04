package com.dsa.linkedlist.doublylinkedlist.undoredo;

class TextOperations {
	
	//attributes
    private TextNode head;
    private TextNode current;
    private int size = 0;
    private final int MAX = 10;

    // Adding new text
    public void addText(String text) {
        TextNode newNode = new TextNode(text);

        if (head == null) {
            head = newNode;
            current = newNode;
            size = 1;
            return;
        }

        // Removing redo history
        current.next = null;

        newNode.prev = current;
        current.next = newNode;
        current = newNode;
        size++;

        // limit history
        if (size > MAX) {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    // Undo operation
    public void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Undo performed successfully!!");
        } else {
            System.out.println("Nothing to undo");
        }
    }

    // Redo operation
    public void redo() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Redo performed successfully!!");
        } else {
            System.out.println("Nothing to redo");
        }
    }

    // Displaying current text (most recent)
    public void display() {
        if (current != null) {
            System.out.println("Current Text: " + current.text);
        } else {
            System.out.println("Editor is empty");
        }
    }
}
