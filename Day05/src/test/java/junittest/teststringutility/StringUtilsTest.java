package junittest.teststringutility;

import junit.testingstringutility.StringUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    @Test
    void testReverse() {
        assertEquals("olleH", StringUtils.reverse("Hello"));
        assertEquals("avaJ", StringUtils.reverse("Java"));
        assertEquals("", StringUtils.reverse(""));
        assertNull(StringUtils.reverse(null));
    }

    @Test
    void testIsPalindrome() {
        assertTrue(StringUtils.isPalindrome("madam"));
        assertTrue(StringUtils.isPalindrome("racecar"));
        assertTrue(StringUtils.isPalindrome("Malayalam"));
        assertFalse(StringUtils.isPalindrome("hello"));
        assertFalse(StringUtils.isPalindrome(null));
    }

    @Test
    void testToUpperCase() {
        assertEquals("HELLO", StringUtils.toUpperCase("hello"));
        assertEquals("JAVA", StringUtils.toUpperCase("java"));
        assertEquals("", StringUtils.toUpperCase(""));
        assertNull(StringUtils.toUpperCase(null));
    }
}
