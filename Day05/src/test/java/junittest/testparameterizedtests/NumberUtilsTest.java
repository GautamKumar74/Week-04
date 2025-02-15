package junittest.testparameterizedtests;

import junit.testingparameterizedtests.NumberUtils;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class NumberUtilsTest {

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 7, 9}) // Providing multiple test values
    void testIsEven(int number) {
        boolean expected = (number % 2 == 0); // Expected result
        assertEquals(expected, NumberUtils.isEven(number), number + " should be " + (expected ? "even" : "odd"));
    }
}