package regex.repeatingwords;

import java.util.*;
import java.util.regex.*;

public class RepeatingWordsFinder {
    public static void main(String[] args) {
        String text = "This is is a repeated repeated word test.";

        // Define regex pattern
        String repeatingWordRegex = "\\b(\\w+)\\s+\\1\\b";
        Pattern pattern = Pattern.compile(repeatingWordRegex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        // Store matched repeating words
        Set<String> repeatingWords = new HashSet<>();

        while (matcher.find()) {
            repeatingWords.add(matcher.group(1)); // Add only the repeated word
        }

        // Print repeating words
        System.out.println(repeatingWords);
    }
}
