package countwordsinafile;

import java.io.*;
import java.util.*;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        String filePath = "src/main/java/countwordsinafile/input.txt"; // Change to your file path

        Map<String, Integer> wordCount = new HashMap<>();

        // Read file and count word occurrences
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Convert to lowercase and remove punctuation
                line = line.toLowerCase().replaceAll("[^a-z ]", "");

                // Split into words
                String[] words = line.split("\\s+");

                for (String word : words) {
                    if (!word.isEmpty()) { // Ignore empty words
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            return;
        }

        // Sort words by frequency (descending order)
        List<Map.Entry<String, Integer>> sortedWords = new ArrayList<>(wordCount.entrySet());
        sortedWords.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        // Display top 5 most frequent words
        System.out.println("Top 5 Most Frequent Words:");
        int count = 0;
        for (Map.Entry<String, Integer> entry : sortedWords) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
            if (++count == 5) break; // Stop after 5 words
        }
    }
}
