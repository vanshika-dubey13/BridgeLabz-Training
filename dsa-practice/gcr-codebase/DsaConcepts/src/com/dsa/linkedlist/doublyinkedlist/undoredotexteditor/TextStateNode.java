package com.dsa.linkedlist.doublyinkedlist.undoredotexteditor;

public class TextStateNode {
    String text;
    TextStateNode prev;
    TextStateNode next;

    public TextStateNode(String text) {
        this.text = text;
        this.prev = null;
        this.next = null;
    }
}
