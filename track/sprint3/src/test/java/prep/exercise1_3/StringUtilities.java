package prep.exercise1_3;

import java.util.List;

public class StringUtilities {
    public boolean isPalindrome(String s) {
        StringBuilder reversed = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            reversed = reversed.append(s.charAt(i));
        }

        return s.equals(reversed.toString());
    }

    ;
//    public List<String> splitCommaSeparatedLine(String s) { ... }
}