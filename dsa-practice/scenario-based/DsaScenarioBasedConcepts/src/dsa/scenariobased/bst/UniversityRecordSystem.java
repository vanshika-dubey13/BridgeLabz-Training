package dsa.scenariobased.bst;

import java.util.Scanner;

//Node class to store data in bst nodes
class Node {
	//attributes
    int roll;
    String name;
    Node left, right;

    //constructor
    Node(int roll, String name) {
        this.roll = roll;
        this.name = name;
        left = right = null;
    }
}

//Class binary search tree to perform operations
class BST {
    Node root;

    // inserting nodes in tree with data
    Node insertInBST(Node root, int roll, String name) {
        if (root == null) {
            return new Node(roll, name);
        }
        if (roll < root.roll)
            root.left = insertInBST(root.left, roll, name);
        else if (roll > root.roll)
            root.right = insertInBST(root.right, roll, name);
        return root;
    }

    // searching data in tree
    public void searchInBST(Node root, int roll) {
        if (root == null) {
            System.out.println("Student not found.");
            return;
        }
        if (roll == root.roll) {
            System.out.println("Student Found:");
            System.out.println("Roll No: " + root.roll);
            System.out.println("Name   : " + root.name);
        }
        else if (roll < root.roll) {
        	searchInBST(root.left, roll);
        }
        else {
        	searchInBST(root.right, roll);
        }
    }

    // method to perform inorder Traversal, displaying in sorted order
    public void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.println("Roll: " + root.roll + " | Name: " + root.name);
            inorder(root.right);
        }
    }

    // finding minimum value node
    Node minValueNode(Node node) {
        Node current = node;
        while (current.left != null)
            current = current.left;
        return current;
    }

    // deleting a node from bst
    Node deleteFromBST(Node root, int roll) {
        if (root == null)
            return root;

        if (roll < root.roll)
            root.left = deleteFromBST(root.left, roll);
        else if (roll > root.roll)
            root.right = deleteFromBST(root.right, roll);
        else {
            // Node with one or no child
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            // Node with two children
            Node temp = minValueNode(root.right);
            root.roll = temp.roll;
            root.name = temp.name;
            root.right = deleteFromBST(root.right, temp.roll);
        }
        return root;
    }

	public Node delete(Node root2, int delRoll) {
		// TODO Auto-generated method stub
		return null;
	}
}

//main class
public class UniversityRecordSystem {
	//main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BST tree = new BST();
        int choice;

        //displaying menu
        do {
            System.out.println("\nUniversity Student Record System");
            System.out.println("1. Insert Student");
            System.out.println("2. Delete Student");
            System.out.println("3. Search Student");
            System.out.println("4. Display All Students (Sorted)");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Roll Number: ");
                    int roll = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    tree.root = tree.insertInBST(tree.root, roll, name);
                    System.out.println("Student inserted successfully.");
                    break;

                case 2:
                    System.out.print("Enter Roll Number to delete: ");
                    int delRoll = sc.nextInt();
                    tree.root = tree.delete(tree.root, delRoll);
                    System.out.println("Student deleted (if existed).");
                    break;

                case 3:
                    System.out.print("Enter Roll Number to search: ");
                    int searchRoll = sc.nextInt();
                    tree.searchInBST(tree.root, searchRoll);
                    break;

                case 4:
                    System.out.println("\nStudent List (Sorted by Roll No):");
                    tree.inorder(tree.root);
                    break;

                case 5:
                    System.out.println("Exiting system...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 5);

        sc.close();
    }
}
