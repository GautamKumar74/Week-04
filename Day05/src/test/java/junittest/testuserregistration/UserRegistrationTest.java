package junittest.testuserregistration;

import junit.testinguserregistration.UserRegistration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserRegistrationTest {

    @Test
    void testValidUserRegistration() {
        assertEquals("User JohnDoe registered successfully!",
                UserRegistration.registerUser("JohnDoe", "john@example.com", "Password1"));

        assertEquals("User Alice123 registered successfully!",
                UserRegistration.registerUser("Alice123", "alice@example.com", "Secure123"));
    }

    @Test
    void testInvalidUsername() {
        assertThrows(IllegalArgumentException.class, () ->
                UserRegistration.registerUser("", "valid@example.com", "Password1"), "Username cannot be empty");

        assertThrows(IllegalArgumentException.class, () ->
                UserRegistration.registerUser(null, "valid@example.com", "Password1"), "Username cannot be null");
    }

    @Test
    void testInvalidEmail() {
        assertThrows(IllegalArgumentException.class, () ->
                UserRegistration.registerUser("JohnDoe", "invalid-email", "Password1"), "Invalid email format");

        assertThrows(IllegalArgumentException.class, () ->
                UserRegistration.registerUser("JohnDoe", "user@domain", "Password1"), "Invalid email format");
    }

    @Test
    void testInvalidPassword() {
        assertThrows(IllegalArgumentException.class, () ->
                UserRegistration.registerUser("JohnDoe", "john@example.com", "pass"), "Password too short");

        assertThrows(IllegalArgumentException.class, () ->
                UserRegistration.registerUser("JohnDoe", "john@example.com", "password"), "No uppercase letter or digit");

        assertThrows(IllegalArgumentException.class, () ->
                UserRegistration.registerUser("JohnDoe", "john@example.com", "PASSWORD"), "No digit");

        assertThrows(IllegalArgumentException.class, () ->
                UserRegistration.registerUser("JohnDoe", "john@example.com", "12345678"), "No uppercase letter");
    }
}
