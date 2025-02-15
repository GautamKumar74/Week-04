package regex.extractcurrencyvalues;

import java.util.*;
import java.util.regex.*;

public class CurrencyExtractor {
    public static void main(String[] args) {
        String text = "The price is $45.99, and the discount is 10.50.";

        // Define regex pattern
        String currencyRegex = "\\$?\\d+\\.\\d{2}";
        Pattern pattern = Pattern.compile(currencyRegex);
        Matcher matcher = pattern.matcher(text);

        // Store matched currency values
        List<String> currencyValues = new ArrayList<>();

        while (matcher.find()) {
            currencyValues.add(matcher.group()); // Extract matched values
        }

        // Print extracted currency values
        System.out.println(currencyValues);
    }
}
