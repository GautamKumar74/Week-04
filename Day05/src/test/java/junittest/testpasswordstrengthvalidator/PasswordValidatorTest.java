package junittest.testpasswordstrengthvalidator;

import junit.testingpasswordstrengthvalidator.PasswordValidator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    @Test
    void testValidPassword() {
        assertTrue(PasswordValidator.isValidPassword("StrongPass1"), "Valid password should pass");
    }

    @Test
    void testShortPassword() {
        assertFalse(PasswordValidator.isValidPassword("Abc1"), "Password shorter than 8 characters should fail");
    }

    @Test
    void testNoUpperCase() {
        assertFalse(PasswordValidator.isValidPassword("weakpassword1"), "Password without uppercase should fail");
    }

    @Test
    void testNoDigit() {
        assertFalse(PasswordValidator.isValidPassword("WeakPassword"), "Password without digit should fail");
    }

    @Test
    void testNullPassword() {
        assertFalse(PasswordValidator.isValidPassword(null), "Null password should fail");
    }

    @Test
    void testOnlyNumbers() {
        assertFalse(PasswordValidator.isValidPassword("12345678"), "Password with only numbers should fail");
    }
}
