package src.com.collections.scenariobased;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.regex.*;
import java.util.stream.Collectors;

// Class to store resume data
class ResumeData {
	
	//attributes
    private String name;
    private String email;
    private String phone;
    private String fileName;
    private int keywordMatchCount;

    //constructor
    public ResumeData(String name, String email, String phone, String fileName) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.fileName = fileName;
        this.keywordMatchCount = 0;
    }

    public String getEmail() {
        return email;
    }

    public int getKeywordMatchCount() {
        return keywordMatchCount;
    }

    public void setKeywordMatchCount(int count) {
        this.keywordMatchCount = count;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Email: " + email + ", Phone: " + phone +
               ", File: " + fileName + ", Keyword Matches: " + keywordMatchCount;
    }
}

public class ResumeAnalyzer {

    // Keywords to search in resumes
    private static final String[] KEYWORDS = {"Java", "Python", "Spring"};

    // Regex patterns
    private static final Pattern EMAIL_PATTERN = Pattern.compile("[\\w._%+-]+@[\\w.-]+\\.[A-Za-z]{2,6}");
    private static final Pattern PHONE_PATTERN = Pattern.compile("\\b\\d{10}\\b"); // simple 10-digit pattern

    // Map to store resumes by email
    private Map<String, ResumeData> resumeMap = new HashMap<>();

    //main method
    public static void main(String[] args) {
        ResumeAnalyzer analyzer = new ResumeAnalyzer();
        String folderPath = "D:\\Java programming workspace\\java-collection-practice\\scenario-based\\JavaCollectionsConcepts\\src\\src\\com\\collections\\scenariobased\\resumes"; // folder containing .txt resumes

        try {
            analyzer.processResumes(folderPath);
            analyzer.printSortedResumes();
        } catch (IOException e) {
            System.err.println("Error reading resumes: " + e.getMessage());
        }
    }

    // method to process all resumes in a folder
    public void processResumes(String folderPath) throws IOException {
        File folder = new File(folderPath);
        if (!folder.exists() || !folder.isDirectory()) {
            throw new IOException("Folder does not exist: " + folderPath);
        }

        File[] files = folder.listFiles((dir, name) -> name.endsWith(".txt") || name.endsWith(".pdf"));
        if (files == null) return;

        for (File file : files) {
            try {
                String content = readFile(file);
                String email = extractPattern(content, EMAIL_PATTERN);
                String phone = extractPattern(content, PHONE_PATTERN);
                if (email == null) throw new InvalidResumeException("No valid email found in " + file.getName());

                int keywordCount = countKeywords(content);

                ResumeData resumeData = new ResumeData(file.getName().replace(".txt", ""), email, phone, file.getName());
                resumeData.setKeywordMatchCount(keywordCount);

                resumeMap.put(email, resumeData);

            } catch (InvalidResumeException e) {
                System.out.println("Skipping resume: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Error processing file " + file.getName() + ": " + e.getMessage());
            }
        }
    }

    // method to read file content
    private String readFile(File file) throws IOException {
        if (file.getName().endsWith(".txt")) {
            return new String(Files.readAllBytes(file.toPath()));
        } else if (file.getName().endsWith(".pdf")) {
            //  returning empty strings for errors
            return "";
        }
        return "";
    }

    // method to extract first match of a regex pattern
    private String extractPattern(String content, Pattern pattern) {
        Matcher matcher = pattern.matcher(content);
        return matcher.find() ? matcher.group() : null;
    }

    // method to count occurrences of keywords
    private int countKeywords(String content) {
        int count = 0;
        for (String keyword : KEYWORDS) {
            Pattern p = Pattern.compile("\\b" + keyword + "\\b", Pattern.CASE_INSENSITIVE);
            Matcher m = p.matcher(content);
            while (m.find()) count++;
        }
        return count;
    }

    // method to print resumes sorted by keyword match count
    public void printSortedResumes() {
        List<ResumeData> sortedList = resumeMap.values().stream()
                .sorted(Comparator.comparingInt(ResumeData::getKeywordMatchCount).reversed())
                .collect(Collectors.toList());

        System.out.println("\n=== Sorted Resumes by Keyword Matches ===");
        for (ResumeData rd : sortedList) {
            System.out.println(rd);
        }
    }

    // theowing custom exceptions for invalids
    public static class InvalidResumeException extends Exception {
        public InvalidResumeException(String message) {
            super(message);
        }
    }
}
