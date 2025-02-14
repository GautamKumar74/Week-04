package readlargefilelinebyline;

import java.io.*;

public class ErrorLogFilter {
    public static void main(String[] args) {
        String filePath = "src/main/java/readlargefilelinebyline/input.txt"; // Change to your file path

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) { // Read line by line
                if (line.toLowerCase().contains("error")) { // Case-insensitive check
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.err.println("File reading error: " + e.getMessage());
        }
    }
}

