package junittest.testexceptionhandling;

import junit.testingexceptionhandling.ExceptionHandling;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ExceptionHandlingTest {

    @Test
    void testDivideByNonZero() {
        assertEquals(5, ExceptionHandling.divide(10, 2));
        assertEquals(-3, ExceptionHandling.divide(-9, 3));
    }

    @Test
    void testDivideByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            ExceptionHandling.divide(10, 0);
        });

        // Verify exception message
        assertEquals("Cannot divide by zero", exception.getMessage());
    }
}
