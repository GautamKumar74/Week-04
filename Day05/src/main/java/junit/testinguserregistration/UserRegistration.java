package junit.testinguserregistration;

import java.util.regex.Pattern;

public class UserRegistration {

    // Email regex pattern
    private static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

    // Password: At least 8 characters, one uppercase, and one digit
    private static final String PASSWORD_REGEX = "^(?=.*[A-Z])(?=.*\\d).{8,}$";

    public static String registerUser(String username, String email, String password) {
        if (username == null || username.isEmpty()) {
            throw new IllegalArgumentException("Username cannot be empty");
        }
        if (email == null || !Pattern.matches(EMAIL_REGEX, email)) {
            throw new IllegalArgumentException("Invalid email format");
        }
        if (password == null || !Pattern.matches(PASSWORD_REGEX, password)) {
            throw new IllegalArgumentException("Password must be at least 8 characters long, with one uppercase letter and one digit");
        }
        return "User " + username + " registered successfully!";
    }
}
