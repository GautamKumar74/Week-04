package regex.extractallcapitalizedwords;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractCapitalizedWords {

    public static void main(String[] args) {
        String text= "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
        List<String> capitalizedWords= extractCapitalizedWords(text);

        System.out.println(capitalizedWords);
    }

    public static List<String> extractCapitalizedWords(String text){
        List<String> words= new ArrayList<>();

        String regex= "\\b[A-Z][a-z]*\\b";

        Pattern pattern= Pattern.compile(regex);
        Matcher matcher= pattern.matcher(text);

        while (matcher.find()){
            words.add(matcher.group());
        }

        return words;
    }
}
