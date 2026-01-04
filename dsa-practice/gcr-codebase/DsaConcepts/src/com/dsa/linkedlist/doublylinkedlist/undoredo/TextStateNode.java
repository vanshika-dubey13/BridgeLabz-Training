package com.dsa.linkedlist.doublylinkedlist.undoredo;

class TextNode {
	
	//attributes
    String text;
    TextNode prev;
    TextNode next;

    //constructor
    TextNode(String text) {
        this.text = text;
        prev = null;
        next = null;
    }
}
