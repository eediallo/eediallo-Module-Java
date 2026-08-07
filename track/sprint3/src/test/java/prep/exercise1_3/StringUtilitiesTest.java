package prep.exercise1_3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test suite for verifying the string manipulation behaviours of
 * {@link StringUtilities}.
 * <p>
 * Tests cover palindrome validation, string splitting logic and proper handling of edge cases
 * such as trailing commas, empty strings and null inputs.
 *
 * @see StringUtilities
 */
class StringUtilitiesTest {

    private StringUtilities stringUtilities = new StringUtilities();

    /**
     * Verifies that {@link StringUtilities#isPalindrome(String)} correctly identifies
     * valid palindrome words using a grouped assertion.
     */
    @Test
    void testisPalindrome() {
        assertTrue(stringUtilities.isPalindrome("civic"), "'civic' is a isPalindrome");
        assertTrue(stringUtilities.isPalindrome("radar"), "'radar' is a isPalindrome");
        assertTrue(stringUtilities.isPalindrome("level"), "'level' is a isPalindrome");
        assertTrue(stringUtilities.isPalindrome("rotor"), "'rotor' is a isPalindrome");
        assertTrue(stringUtilities.isPalindrome("madam"), "'madam' is a isPalindrome");
    }

    /**
     * Verifies that {@link StringUtilities#isPalindrome(String)} returns {@code false}
     * for non-palindrome words.
     */
    @Test
    void testisNotPalindrome() {
        assertFalse(stringUtilities.isPalindrome("solution"), "'solution' is not a Palindrome");
        assertFalse(stringUtilities.isPalindrome("mental"), "'mental' is a not Palindrome");
    }

    /**
     * Verifies that {@link StringUtilities#splitCommaSeparatedLine(String)} correctly parse a comma-separated
     * string into a list of individual elements.
     */
    @Test
    void testNormalCommaSeparatedLine() {
        List<String> fruits = stringUtilities.splitCommaSeparatedLine("mango,banana,apple");
        assertEquals(List.of("mango", "banana", "apple"), fruits);
    }

    /**
     * Tests how {@link StringUtilities#splitCommaSeparatedLine(String)} handles a string
     * ending with comma.
     */
    @Test
    void testSingleItemCommaSeparatedLine() {
        List<String> items = stringUtilities.splitCommaSeparatedLine("laptop,");
        assertEquals(List.of("laptop"), items);
    }

    /**
     * Verifies that passing an empty string to {@link StringUtilities#splitCommaSeparatedLine(String)} returns
     * empty list.
     */
    @Test
    void testEmptyStringSplitCommaSeparatedLine() {
        List<String> items = stringUtilities.splitCommaSeparatedLine("");
        assertTrue(items.isEmpty());
    }

    /**
     * Verifies that {@link StringUtilities#splitCommaSeparatedLine(String)} throws an
     * {@link IllegalArgumentException} when passed a {@code null} argument.
     */
    @Test
    void shouldThrowWhenNull() {
        assertThrows(IllegalArgumentException.class, () -> stringUtilities.splitCommaSeparatedLine(null));
    }


}