package dsa.scenariobased.avl;

import java.util.Scanner;

//AVL Tree Node
class PlayerNode {
	
	//attributes
	int playerId;
	int score;
	int height;
	PlayerNode left, right;

	//constructor
	PlayerNode(int playerId, int score) {
		this.playerId = playerId;
		this.score = score;
		this.height = 1;
	}
}

//AVL Tree Implementation
class AVLLeaderboard {
	//attributes
	private PlayerNode root;

	// Height
	int height(PlayerNode node) {
		return node == null ? 0 : node.height;
	}

	// Balance Factor
	int getBalance(PlayerNode node) {
		return node == null ? 0 : height(node.left) - height(node.right);
	}

	// Right Rotate
	PlayerNode rightRotate(PlayerNode y) {
		PlayerNode x = y.left;
		PlayerNode T2 = x.right;

		x.right = y;
		y.left = T2;

		y.height = Math.max(height(y.left), height(y.right)) + 1;
		x.height = Math.max(height(x.left), height(x.right)) + 1;

		return x;
	}

	// Left Rotate
	PlayerNode leftRotate(PlayerNode x) {
		PlayerNode y = x.right;
		PlayerNode T2 = y.left;

		y.left = x;
		x.right = T2;

		x.height = Math.max(height(x.left), height(x.right)) + 1;
		y.height = Math.max(height(y.left), height(y.right)) + 1;

		return y;
	}

	// Inserting or Updating Player
	PlayerNode insert(PlayerNode node, int playerId, int score) {
		if (node == null)
			return new PlayerNode(playerId, score);

		if (score < node.score)
			node.left = insert(node.left, playerId, score);
		else if (score > node.score)
			node.right = insert(node.right, playerId, score);
		else {
			node.playerId = playerId; // Update existing
			return node;
		}

		node.height = 1 + Math.max(height(node.left), height(node.right));
		int balance = getBalance(node);

		// Balancing
		if (balance > 1 && score < node.left.score)
			return rightRotate(node);
		
		if (balance < -1 && score > node.right.score)
			return leftRotate(node);
		
		if (balance > 1 && score > node.left.score) {
			node.left = leftRotate(node.left);
			return rightRotate(node);
		}

		if (balance < -1 && score < node.right.score) {
			node.right = rightRotate(node.right);
			return leftRotate(node);
		}

		return node;
	}

	// Finding minimum value node
	PlayerNode minValueNode(PlayerNode node) {
		PlayerNode current = node;
		while (current.left != null)
			current = current.left;
			return current;
	}

	// Removing Player
	PlayerNode deletePlayer(PlayerNode root, int score) {
		if (root == null)
			return root;

		if (score < root.score)
			root.left = deletePlayer(root.left, score);
		else if (score > root.score)
			root.right = deletePlayer(root.right, score);
		else {
			if ((root.left == null) || (root.right == null)) {
				PlayerNode temp = root.left != null ? root.left : root.right;
				root = temp;
			}
			else {
				PlayerNode temp = minValueNode(root.right);
				root.score = temp.score;
				root.playerId = temp.playerId;
				root.right = deletePlayer(root.right, temp.score);
			}
		}

		if (root == null)
			return root;

		root.height = Math.max(height(root.left), height(root.right)) + 1;
		int balance = getBalance(root);

		// balancing cases
		if (balance > 1 && getBalance(root.left) >= 0)
			return rightRotate(root);

		if (balance > 1 && getBalance(root.left) < 0) {
			root.left = leftRotate(root.left);
			return rightRotate(root);
		}

		if (balance < -1 && getBalance(root.right) <= 0)
			return leftRotate(root);

		if (balance < -1 && getBalance(root.right) > 0) {
			root.right = rightRotate(root.right);
			return leftRotate(root);
		}	

		return root;
	}

	// Displaying Top Players
	void displayTopPlayers(PlayerNode node, int[] count) {
		if (node == null || count[0] >= 10)
			return;
		displayTopPlayers(node.right, count);

		if (count[0] < 10) {
			System.out.println("Player ID: " + node.playerId + " | Score: " + node.score);
			count[0]++;
		}	
		displayTopPlayers(node.left, count);
	}

	// Public Methods
	void addPlayer(int playerId, int score) {
		root = insert(root, playerId, score);
	}

	void removePlayer(int score) {
		root = deletePlayer(root, score);
	}

	void showLeaderboard() {
		int[] count = {0};
		System.out.println("\nTop Players:");
		displayTopPlayers(root, count);
		if (count[0] == 0)
			System.out.println("No players available.");
		}
	}		

//Main Class with Menu
public class GamingApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AVLLeaderboard leaderboard = new AVLLeaderboard();

		//displaying menu
		while (true) {
			System.out.println("\naming Leaderboard Menu");
			System.out.println("1. Insert / Update Player");
			System.out.println("2. Display Top 10 Players");
			System.out.println("3. Remove Player");
			System.out.println("4. Exit");
			System.out.print("Enter choice: ");

			int choice = sc.nextInt();

			switch (choice) {
				case 1:
					System.out.print("Enter Player ID: ");
					int id = sc.nextInt();
					System.out.print("Enter Score: ");
					int score = sc.nextInt();
					leaderboard.addPlayer(id, score);
					System.out.println("Player added/updated.");
					break;

				case 2:
					leaderboard.showLeaderboard();
					break;

				case 3:
					System.out.print("Enter Score of player to remove: ");
					int removeScore = sc.nextInt();
					leaderboard.removePlayer(removeScore);
					System.out.println("Player removed.");
					break;

				case 4:
					System.out.println("Exiting...");
					sc.close();
					return;

				default:
					System.out.println("Invalid choice.");
         		}
     		}
 		}
}

