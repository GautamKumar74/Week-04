package regex.extractprogramminglanguages;

import java.util.regex.*;
import java.util.*;

public class ExtractProgrammingLanguages {
    public static List<String> extractLanguages(String text) {
        List<String> languages = new ArrayList<>();
        String regex = "\\b(JavaScript|Java|Python|Go|C\\+\\+|C|Ruby|Swift|Kotlin|PHP|Rust|TypeScript|Perl|R)\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            languages.add(matcher.group());
        }

        return languages;
    }

    public static void main(String[] args) {
        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";

        List<String> extractedLanguages = extractLanguages(text);
        System.out.println(extractedLanguages);
    }
}
