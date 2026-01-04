package com.dsa.linkedlist.singlylinkedlist.socialmediafriendconnection;
import java.util.Scanner;
import java.util.Scanner;

//main class
public class SocialMediaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SocialMediaOperations sm = new SocialMediaOperations();
        int choice = -1;

        //displaying social media platform menu
        do {
            System.out.println("\n1.Add User");
            System.out.println("2.Add Friend");
            System.out.println("3.Remove Friend");
            System.out.println("4.Display Friends");
            System.out.println("5.Mutual Friends");
            System.out.println("6.Search User");
            System.out.println("7.Count Friends");
            System.out.println("0.Exit");
            System.out.print("Enter choice: ");

            if (sc.hasNextInt()) {
                choice = sc.nextInt();
            } else {
                System.out.println("Invalid input! Enter number only.");
                sc.next();
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter UserID Name Age: ");
                    sm.addUser(sc.next(), sc.next(), sc.nextInt());
                    break;

                case 2:
                    System.out.print("Enter two User IDs: ");
                    sm.addFriend(sc.next(), sc.next());
                    break;

                case 3:
                    System.out.print("Enter User ID and Friend ID: ");
                    sm.removeFriend(sc.next(), sc.next());
                    break;

                case 4:
                    System.out.print("Enter User ID: ");
                    sm.displayFriends(sc.next());
                    break;

                case 5:
                    System.out.print("Enter two User IDs: ");
                    sm.mutualFriends(sc.next(), sc.next());
                    break;

                case 6:
                    System.out.print("Enter User ID: ");
                    sm.searchUser(sc.next());
                    break;

                case 7:
                    sm.countFriends();
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 0);

        sc.close();
    }
}
