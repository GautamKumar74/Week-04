package junittest.testfilehandling;

import junit.testingfilehandling.FileProcessor;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class FileProcessorTest {

    private final String testFilename = "testfile.txt";

    @BeforeEach
    void setup() {
        // Ensure the test file does not exist before each test
        try {
            Files.deleteIfExists(Path.of(testFilename));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @AfterEach
    void cleanup() {
        // Delete the test file after each test
        try {
            Files.deleteIfExists(Path.of(testFilename));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    void testWriteAndReadFile() throws IOException {
        String content = "Hello, JUnit!";
        FileProcessor.writeToFile(testFilename, content);

        // Verify that the file exists
        assertTrue(Files.exists(Path.of(testFilename)), "File should exist after writing");

        // Verify that the content is correctly written and read
        String readContent = FileProcessor.readFromFile(testFilename);
        assertEquals(content, readContent, "Content should match");
    }

    @Test
    void testReadNonExistentFile() {
        // Expect IOException when reading a non-existent file
        assertThrows(IOException.class, () -> FileProcessor.readFromFile("nonexistent.txt"));
    }
}

