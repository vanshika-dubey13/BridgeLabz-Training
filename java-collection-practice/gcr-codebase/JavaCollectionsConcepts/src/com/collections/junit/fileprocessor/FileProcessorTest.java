package com.collections.junit.fileprocessor;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.io.*;

public class FileProcessorTest {

    private FileProcessor processor;
    private static final String TEST_FILE = "testfile.txt";

    @BeforeEach
    void setUp() {
        processor = new FileProcessor();
    }

    @AfterEach
    void tearDown() {
        File file = new File(TEST_FILE);
        if (file.exists()) {
            file.delete(); // clean up after each test
        }
    }

    @Test
    void testWriteAndReadFile() throws IOException {
        String content = "Hello, JUnit!";
        processor.writeToFile(TEST_FILE, content);

        String readContent = processor.readFromFile(TEST_FILE);
        assertEquals(content, readContent, "Content should match after writing and reading");
    }

    @Test
    void testFileExistsAfterWriting() throws IOException {
        processor.writeToFile(TEST_FILE, "Sample content");
        File file = new File(TEST_FILE);
        assertTrue(file.exists(), "File should exist after writing");
    }

    @Test
    void testReadNonExistentFileThrowsException() {
        assertThrows(IOException.class, () -> {
            processor.readFromFile("nonexistent.txt");
        }, "Reading a non-existent file should throw IOException");
    }
}
