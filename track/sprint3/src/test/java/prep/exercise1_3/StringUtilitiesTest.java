package prep.exercise1_3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
    void testisNotPalindrome(){
        assertAll(()-> assertFalse(stringUtilities.isPalindrome("solution")), () -> assertFalse(stringUtilities.isPalindrome("mental")));
    }
}