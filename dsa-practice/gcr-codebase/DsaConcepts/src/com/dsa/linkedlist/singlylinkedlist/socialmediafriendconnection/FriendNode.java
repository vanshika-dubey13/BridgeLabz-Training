package com.dsa.linkedlist.singlylinkedlist.socialmediafriendconnection;

public class FriendNode {
	
	//attributes
    String friendId;
    FriendNode next;

    //constructor
    public FriendNode(String friendId) {
        this.friendId = friendId;
        this.next = null;
    }
}
