package junittest.testcalculator;

import static org.junit.jupiter.api.Assertions.*;

import junit.testingcalculator.Calculator;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    void testAddition() {
        assertEquals(10, calculator.add(5, 5));
        assertEquals(-3, calculator.add(-1, -2));
    }

    @Test
    void testSubtraction() {
        assertEquals(2, calculator.subtract(5, 3));
        assertEquals(-1, calculator.subtract(2, 3));
    }

    @Test
    void testMultiplication() {
        assertEquals(15, calculator.multiply(3, 5));
        assertEquals(0, calculator.multiply(0, 10));
    }

    @Test
    void testDivision() {
        assertEquals(2, calculator.divide(10, 5));
        assertEquals(-3, calculator.divide(-9, 3));
    }

    @Test
    void testDivisionByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calculator.divide(10, 0);
        });
        assertEquals("Division by zero is not allowed", exception.getMessage());
    }
}
