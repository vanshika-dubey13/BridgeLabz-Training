package com.dsa.linkedlist.singlylinkedlist.inventorymanagemetsystem;

//creating itemnode
class ItemNode {
	
	//attributes
    int itemId;
    String itemName;
    int quantity;
    double price;
    ItemNode next;

    //constructor
    ItemNode(int itemId, String itemName, int quantity, double price) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}
