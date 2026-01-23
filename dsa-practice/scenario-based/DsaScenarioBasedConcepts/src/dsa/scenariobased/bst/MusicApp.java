package dsa.scenariobased.bst;

import java.util.*;

//class Song to stores attributes and constructor of Song
class Song {
	
	//attributes
    int trackId;
    String title;
    String artist;

    //constructor
    Song(int trackId, String title, String artist) {
        this.trackId = trackId;
        this.title = title;
        this.artist = artist;
    }
}

//main class
public class MusicApp {

	//main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // BST behavior: sorted by song title
        TreeMap<String, Song> songLibrary = new TreeMap<>();
        // Fast search by Track ID
        HashMap<Integer, Song> trackSearch = new HashMap<>();

        int choice;

        //display menu
        do {
            System.out.println("\n===== Music Library Menu =====");
            System.out.println("1. Search Track by Track ID");
            System.out.println("2. Insert New Track");
            System.out.println("3. Show Playlist Alphabetically");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            // consume newline
            sc.nextLine(); 

            switch (choice) {

                // Scenario 1: Search Track
            	//searching a song with track IDs
            	case 1:
            		System.out.print("Enter Track ID: ");
            		int searchId = sc.nextInt();
            		if (trackSearch.containsKey(searchId)) {
                        Song s = trackSearch.get(searchId);
                        System.out.println("Found: " + s.title + " by " + s.artist);
                    } else {
                        System.out.println("Track not found!");
                    }
                    break;

                // Scenario 2: Insert New Track
                // adding new releases to library
                case 2:
                    System.out.print("Enter Track ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Song Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Artist Name: ");
                    String artist = sc.nextLine();
                    Song song = new Song(id, title, artist);
                    // BST insert
                    songLibrary.put(title, song);
                    // ID-based search
                    trackSearch.put(id, song);      
                    System.out.println("Track added successfully!");
                    break;

                // 🔹 Scenario 3: In-order Traversal (Alphabetical)
                //	displaying playlist alphabetically
                case 3:
                    System.out.println("\nPlaylist (Alphabetical Order)");
                    for (Map.Entry<String, Song> entry : songLibrary.entrySet()) {
                        Song s = entry.getValue();
                        System.out.println(
                            s.title + " | ID: " + s.trackId + " | Artist: " + s.artist
                        );
                    }
                    break;

                case 4:
                    System.out.println("Exiting Music App...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}

