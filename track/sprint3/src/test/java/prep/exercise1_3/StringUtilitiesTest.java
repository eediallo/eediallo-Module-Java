package prep.exercise1_3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilitiesTest {

    private StringUtilities stringUtilities;

    @BeforeEach
    void setup() {
        stringUtilities = new StringUtilities();
    }

    @Test
    void testisPalindrome() {
        assertAll(() -> assertTrue(stringUtilities.isPalindrome("civic"), "civic is a Palindrome"), () -> assertTrue(stringUtilities.isPalindrome("radar")), () -> assertTrue(stringUtilities.isPalindrome("level")), () -> stringUtilities.isPalindrome("rotor"), () -> assertTrue(stringUtilities.isPalindrome("madam")));
    }

    @Test
    void testisNotPalindrome() {
        assertAll(() -> assertFalse(stringUtilities.isPalindrome("solution")), () -> assertFalse(stringUtilities.isPalindrome("mental")));
    }

    @Test
    void testNormalCommaSeparatedLine() {
        List<String> fruits = stringUtilities.splitCommaSeparatedLine("mango,banana,apple");
        assertEquals(List.of("mango", "banana", "apple"), fruits);
    }

    @Test
    void testSingleItemCommaSeparatedLine() {
        List<String> items = stringUtilities.splitCommaSeparatedLine("laptop,");
        assertEquals(List.of("laptop"), items);
    }

}