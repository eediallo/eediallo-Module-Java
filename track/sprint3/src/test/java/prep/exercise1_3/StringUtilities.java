package prep.exercise1_3;

import java.util.List;

public class StringUtilities {
    public boolean isPalindrome(String s) {
        String reversed = "";

        for(int i = s.length() - 1; i >=0 ; i--){
            reversed += s.charAt(i);
        }


        System.out.println(reversed + " <=========");
        return s.equals(reversed);
    };
//    public List<String> splitCommaSeparatedLine(String s) { ... }
}