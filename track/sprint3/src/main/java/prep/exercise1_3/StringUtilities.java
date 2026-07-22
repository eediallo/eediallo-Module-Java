package prep.exercise1_3;

import java.util.Arrays;
import java.util.List;

/**
 * Utility class providing common helper operations for string manipulation and processing
 */
public class StringUtilities {
    /**
     * Determines whether a given string is a palindrome.
     * <p>
     * A string is considered a palindrome if it reads the exact same sequence
     * forwards and backwards. Note that this implementation is case-sensitive
     * and evaluates spaces or punctuation as characters.
     *
     * @param s the string to evaluate
     * @return {@code true} if {@code s } is equal to its reversed character sequence
     * {@code false} otherwise
     */
    public boolean isPalindrome(String s) {
        StringBuilder reversed = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            reversed = reversed.append(s.charAt(i));
        }

        return s.equals(reversed.toString());
    }

    /**
     * Splits a comma-separated string into a list of individual string values.
     *
     * @param s the comma-separated string to split
     * @return a {@link List} of strings parsed from the input; returns as empty list
     * if {@code s} is an empty string
     * @throws IllegalArgumentException if {@code s} is {@code null}
     */
    public List<String> splitCommaSeparatedLine(String s) {

        if (s == null) {
            throw new IllegalArgumentException("null is not allowed");
        }

        if (s == "") {
            return List.of();
        }

        String[] strings = s.split(",");

        System.out.println(Arrays.toString(strings));

        return Arrays.stream(strings).toList();
    }
}