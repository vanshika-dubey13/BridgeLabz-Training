package com.dsa.linkedlist.singlylinkedlist.socialmediafriendconnection;

public class UserNode {
	
	//attributes
    String userId;
    String name;
    int age;
    FriendNode friendHead;
    UserNode next;

    //constructor
    public UserNode(String userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friendHead = null;
        this.next = null;
    }
}
