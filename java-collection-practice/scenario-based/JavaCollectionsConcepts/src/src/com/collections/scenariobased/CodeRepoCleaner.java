package src.com.collections.scenariobased;

import java.io.*;
import java.nio.file.*;
import java.time.Instant;
import java.util.*;
import java.util.regex.*;

// creating an enum for file categories
enum FileType {
    VALID, WARNING, ERROR
}

public class CodeRepoCleaner {

	//attributes
    private Map<FileType, List<File>> categorizedFiles = new HashMap<>();
    private Set<String> methodNames = new HashSet<>();

    // Regex patterns
    private static final Pattern METHOD_PATTERN = Pattern.compile(
            "\\b(public|private|protected)\\s+(static\\s+)?[\\w<>\\[\\]]+\\s+([a-zA-Z0-9_]+)\\s*\\(");
    private static final Pattern IMPORT_PATTERN = Pattern.compile("^import\\s+.*;$", Pattern.MULTILINE);

    public static void main(String[] args) {
        CodeRepoCleaner cleaner = new CodeRepoCleaner();
        // root folder to scan
        String rootFolder = "src";

        try {
            cleaner.scanJavaFiles(rootFolder);
            cleaner.printSummary();

            // Example: filter files > 5KB modified in last 30 days
            cleaner.filterFiles(5 * 1024, 30);
        } catch (IOException e) {
            System.err.println("Error scanning files: " + e.getMessage());
        }
    }

    // scanning all .java files recursively
    public void scanJavaFiles(String folderPath) throws IOException {
        categorizedFiles.put(FileType.VALID, new ArrayList<>());
        categorizedFiles.put(FileType.WARNING, new ArrayList<>());
        categorizedFiles.put(FileType.ERROR, new ArrayList<>());

        Files.walk(Paths.get(folderPath))
                .filter(path -> path.toString().endsWith(".java"))
                .forEach(path -> {
                    try {
                        categorizeFile(path.toFile());
                    } catch (IOException e) {
                        System.out.println("Error reading file " + path + ": " + e.getMessage());
                    }
                });
    }

    // categorizing a single Java file
    private void categorizeFile(File file) throws IOException {
        String content = new String(Files.readAllBytes(file.toPath()));
        boolean hasWarning = false;
        boolean hasError = false;

        // Check for unused imports
        Matcher importMatcher = IMPORT_PATTERN.matcher(content);
        while (importMatcher.find()) {
            String importLine = importMatcher.group();
            String importedClass = importLine.replaceAll("import\\s+|;$", "").trim();
            if (!content.contains(importedClass.substring(importedClass.lastIndexOf(".") + 1))) {
                hasWarning = true;
                break;
            }
        }

        // checking method naming conventions (camelCase)
        Matcher methodMatcher = METHOD_PATTERN.matcher(content);
        while (methodMatcher.find()) {
            String methodName = methodMatcher.group(3);
            methodNames.add(methodName);
            if (!methodName.matches("[a-z][a-zA-Z0-9]*")) {
                hasError = true;
            }
        }

        if (hasError) categorizedFiles.get(FileType.ERROR).add(file);
        else if (hasWarning) categorizedFiles.get(FileType.WARNING).add(file);
        else categorizedFiles.get(FileType.VALID).add(file);
    }

    // method to print categorized summary
    public void printSummary() {
        System.out.println("\n=== CodeRepoCleaner Summary ===");
        for (FileType type : FileType.values()) {
            List<File> files = categorizedFiles.get(type);
            System.out.println(type + " files: " + files.size());
            files.forEach(f -> System.out.println(" - " + f.getPath()));
        }
    }

    // method to filter files by size (bytes) and modified within last 'days' days
    public void filterFiles(long minSizeBytes, int modifiedWithinDays) {
        Instant cutoff = Instant.now().minusSeconds(modifiedWithinDays * 24L * 60L * 60L);

        System.out.println("\n=== Filtered Files (size > " + minSizeBytes + " bytes, modified in last " + modifiedWithinDays + " days) ===");
        categorizedFiles.values().stream()
                .flatMap(List::stream)
                .filter(f -> f.length() > minSizeBytes)
                .filter(f -> {
                    try {
                        return Files.getLastModifiedTime(f.toPath()).toInstant().isAfter(cutoff);
                    } catch (IOException e) {
                        return false;
                    }
                })
                .forEach(f -> System.out.println(f.getPath() + " (" + f.length() + " bytes)"));
    }
}

