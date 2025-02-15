package junittest.testdateformatter;

import junit.testingdateformatter.DateFormatter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DateFormatterTest {

    @Test
    void testValidDates() {
        assertEquals("25-12-2023", DateFormatter.formatDate("2023-12-25"), "Christmas should be formatted correctly");
        assertEquals("01-01-2024", DateFormatter.formatDate("2024-01-01"), "New Year should be formatted correctly");
        assertEquals("15-08-1947", DateFormatter.formatDate("1947-08-15"), "Independence Day should be formatted correctly");
    }

    @Test
    void testInvalidDates() {
        assertThrows(IllegalArgumentException.class, () -> DateFormatter.formatDate("2023/12/25"), "Should throw exception for incorrect format");
        assertThrows(IllegalArgumentException.class, () -> DateFormatter.formatDate("12-25-2023"), "Should throw exception for MM-dd-yyyy format");
        assertThrows(IllegalArgumentException.class, () -> DateFormatter.formatDate("random-text"), "Should throw exception for non-date text");
        assertThrows(IllegalArgumentException.class, () -> DateFormatter.formatDate(""), "Should throw exception for empty string");
    }
}
