package regex.extractlinksfromwebpage;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LinkExtractor {
    public static void main(String[] args) {
        String text= "Visit https://www.google.com and http://example.org for more info.";

        String urlRegex= "https?://[a-zA-Z0-9._-]+\\.[a-zA-Z]{2,}(/[a-zA-Z0-9._~:/?#[\\\\]@!$&'()*+,;=-]*)?";

        Pattern pattern= Pattern.compile(urlRegex);
        Matcher matcher= pattern.matcher(text);

        List<String> links= new ArrayList<>();

        while(matcher.find()){
            links.add(matcher.group());
        }

        System.out.println(links);
    }
}
