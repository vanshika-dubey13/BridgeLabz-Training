package com.dsa.linkedlist.singlylinkedlist.socialmediafriendconnection;

public class SocialMediaOperations {
    UserNode head;

    // Adding User to platform
    public void addUser(String id, String name, int age) {
        UserNode newUser = new UserNode(id, name, age);

        if (head == null) {
            head = newUser;
        } else {
            UserNode temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = newUser;
        }
        System.out.println("User added successfully.");
    }

    // Finding User by ID
    public UserNode findUser(String id) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.userId.equals(id))
                return temp;
            temp = temp.next;
        }
        return null;
    }

    // Adding Friend Connection- when both users have an account
    public void addFriend(String id1, String id2) {
        UserNode u1 = findUser(id1);
        UserNode u2 = findUser(id2);

        if (u1 == null || u2 == null) {
            System.out.println("User not found.");
            return;
        }

        FriendNode f1 = new FriendNode(id2);
        f1.next = u1.friendHead;
        u1.friendHead = f1;

        FriendNode f2 = new FriendNode(id1);
        f2.next = u2.friendHead;
        u2.friendHead = f2;

        System.out.println("Friend connection added.");
    }

    // Removing Friend
    public void removeFriend(String userId, String friendId) {
        UserNode user = findUser(userId);
        if (user == null) return;

        FriendNode curr = user.friendHead;
        FriendNode prev = null;

        while (curr != null) {
            if (curr.friendId.equals(friendId)) {
                if (prev == null)
                    user.friendHead = curr.next;
                else
                    prev.next = curr.next;
                System.out.println("Friend removed.");
                return;
            }
            prev = curr;
            curr = curr.next;
        }
        System.out.println("Friend not found.");
    }

    // Displaying Friends
    public void displayFriends(String userId) {
        UserNode user = findUser(userId);
        if (user == null) {
            System.out.println("User not found.");
            return;
        }

        System.out.print("Friends of " + user.name + ": ");
        FriendNode temp = user.friendHead;

        if (temp == null) {
            System.out.println("No friends.");
            return;
        }

        while (temp != null) {
            System.out.print(temp.friendId + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Displaying Mutual Friends
    public void mutualFriends(String id1, String id2) {
        UserNode u1 = findUser(id1);
        UserNode u2 = findUser(id2);

        if (u1 == null || u2 == null) {
            System.out.println("User not found.");
            return;
        }

        System.out.print("Mutual Friends: ");
        FriendNode f1 = u1.friendHead;

        while (f1 != null) {
            FriendNode f2 = u2.friendHead;
            while (f2 != null) {
                if (f1.friendId.equals(f2.friendId))
                    System.out.print(f1.friendId + " ");
                f2 = f2.next;
            }
            f1 = f1.next;
        }
        System.out.println();
    }

    // Searching User by ID
    public void searchUser(String id) {
        UserNode user = findUser(id);
        if (user != null)
            System.out.println("User Found: " + user.name + ", Age: " + user.age);
        else
            System.out.println("User not found.");
    }

    // Counting Friends
    public void countFriends() {
        UserNode temp = head;
        while (temp != null) {
            int count = 0;
            FriendNode f = temp.friendHead;
            while (f != null) {
                count++;
                f = f.next;
            }
            System.out.println(temp.name + " has " + count + " friends.");
            temp = temp.next;
        }
    }
}
