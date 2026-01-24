package src.com.collections.scenariobased;

import java.util.*;
import java.io.*;
import java.nio.file.*;
import java.util.regex.*;

// Generic class to hold feedback of any type
class Feedback<T> {
	
	//attributes
    private T category;  
    private String text;
    private int rating; 
    
    //constructor
    public Feedback(T category, String text, int rating) {
        this.category = category;
        this.text = text;
        this.rating = rating;
    }

    //getters and setters
    public T getCategory() {
        return category;
    }

    public String getText() {
        return text;
    }

    public int getRating() {
        return rating;
    }

    //overriding toString method to view feedback
    @Override
    public String toString() {
        return "[" + category + "] Rating: " + rating + "/10 - " + text;
    }
}

// Main FeedbackGuru class
public class FeedbackGuru {

	//attributes
    private static final Pattern RATING_PATTERN = Pattern.compile("(\\d{1,2})/10"); 
    private Map<String, List<Feedback<String>>> categorizedFeedback = new HashMap<>();

    //main method
    public static void main(String[] args) {
        FeedbackGuru guru = new FeedbackGuru();
        String folderPath = "D:\\Java programming workspace\\java-collection-practice\\scenario-based\\JavaCollectionsConcepts\\src\\src\\com\\collections\\scenariobased"; // folder containing .txt files

        try {
            guru.readFeedbackFiles(folderPath, "Service"); 
            guru.printSummary();
        } catch (IOException e) {
            System.err.println("Error reading feedback files: " + e.getMessage());
        }
    }

    // Read all .txt feedback files from folder
    public void readFeedbackFiles(String folderPath, String type) throws IOException {
        File folder = new File(folderPath);
        if (!folder.exists() || !folder.isDirectory()) {
            throw new IOException("Folder does not exist: " + folderPath);
        }

        File[] files = folder.listFiles((dir, name) -> name.endsWith(".txt"));
        if (files == null) return;

        for (File file : files) {
            List<String> lines = Files.readAllLines(file.toPath());
            for (String line : lines) {
                try {
                    if (line.trim().isEmpty()) throw new InvalidFeedbackException("Empty line in file: " + file.getName());

                    int rating = extractRating(line);
                    String category = categorizeRating(rating);

                    Feedback<String> feedback = new Feedback<>(type, line, rating);
                    categorizedFeedback.computeIfAbsent(category, k -> new ArrayList<>()).add(feedback);

                } catch (InvalidFeedbackException e) {
                    System.out.println("Skipping line: " + e.getMessage());
                }
            }
        }
    }

    // Extract rating from a line using regex
    private int extractRating(String text) throws InvalidFeedbackException {
        Matcher matcher = RATING_PATTERN.matcher(text);
        if (matcher.find()) {
            return Integer.parseInt(matcher.group(1));
        } else {
            throw new InvalidFeedbackException("No rating found in feedback: " + text);
        }
    }

    // Categorize feedback based on rating
    private String categorizeRating(int rating) {
        if (rating >= 8) return "Positive";
        else if (rating >= 5) return "Neutral";
        else return "Negative";
    }

    // Print feedback summary
    public void printSummary() {
        System.out.println("\n=== Feedback Summary ===");
        for (Map.Entry<String, List<Feedback<String>>> entry : categorizedFeedback.entrySet()) {
            System.out.println("\n" + entry.getKey() + " Feedback:");
            entry.getValue().forEach(System.out::println);
        }
    }

    // Custom exception for invalid feedback lines
    static class InvalidFeedbackException extends Exception {
        public InvalidFeedbackException(String message) {
            super(message);
        }
    }
}
