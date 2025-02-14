package filterstreams;

import java.io.*;

public class UpperToLowerConverter {
    public static void main(String[] args) {
        String inputFile = "src/main/java/filterstreams/input.txt";    // Original file
        String outputFile = "src/main/java/filterstreams/output.txt";  // Converted file

        try {
            convertUpperToLower(inputFile, outputFile);
            System.out.println("Conversion successful! Check the output file.");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    // Method to convert uppercase letters to lowercase in a file
    public static void convertUpperToLower(String inputFile, String outputFile) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line.toLowerCase()); // Convert to lowercase
                writer.newLine(); // Maintain line breaks
            }
        }
    }
}
