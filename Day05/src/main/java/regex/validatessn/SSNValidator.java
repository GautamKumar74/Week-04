package regex.validatessn;

import java.util.regex.*;

public class SSNValidator {
    public static boolean isValidSSN(String ssn) {
        // Define the regex for SSN validation
        String ssnRegex = "^\\d{3}-\\d{2}-\\d{4}$";
        Pattern pattern = Pattern.compile(ssnRegex);
        Matcher matcher = pattern.matcher(ssn);

        return matcher.matches();
    }

    public static void main(String[] args) {
        String ssn1 = "123-45-6789"; // Valid
        String ssn2 = "123456789";   // Invalid (missing dashes)
        String ssn3 = "12-345-6789"; // Invalid (wrong format)

        System.out.println("\"" + ssn1 + "\" is valid: " + isValidSSN(ssn1));
        System.out.println("\"" + ssn2 + "\" is valid: " + isValidSSN(ssn2));
        System.out.println("\"" + ssn3 + "\" is valid: " + isValidSSN(ssn3));
    }
}
