package regex.validatecreditcardnumber;

import java.util.regex.*;

public class CreditCardValidator {
    public static boolean isValidCreditCard(String cardNumber) {
        String creditCardRegex = "^(4[0-9]{15}|5[1-5][0-9]{14})$";
        return cardNumber.matches(creditCardRegex);
    }

    public static void main(String[] args) {
        String[] testCards = {
                "4111111111111111",
                "5500000000000004",
                "1234567890123456",
                "4111111111111",
                "5111111111111111"
        };

        for (String card : testCards) {
            System.out.println(card + " → " + (isValidCreditCard(card) ? "Valid" : "Invalid"));
        }
    }
}
