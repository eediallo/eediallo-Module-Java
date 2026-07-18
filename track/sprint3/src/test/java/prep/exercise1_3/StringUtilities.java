package prep.exercise1_3;

import java.util.Arrays;
import java.util.List;

public class StringUtilities {
    public boolean isPalindrome(String s) {
        StringBuilder reversed = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            reversed = reversed.append(s.charAt(i));
        }

        return s.equals(reversed.toString());
    }

    public List<String> splitCommaSeparatedLine(String s) {
        String[]  strings = s.split(",");

        System.out.println(strings + " <==========");

        return Arrays.stream(strings).toList();
    }
}