package training.sprint1.backlog.reverse_numbers;

/**
 * Create a private method that accepts a number as an argument and returns the number in reverse.
 * For example, an input of 3956 should return 6593. Create code to call this from a main method. Remember
 * to use sensible method and variable names, and add documentation. Remember to use the debugger if something goes wrong!
 *
 */

public class ReverseNumbers {
    private int reverseNumber(int num) {
        String numStr = String.valueOf(num);

        String reverseNumStr = "";

        for (int i = numStr.length() - 1; i >= 0; i--) {
            reverseNumStr += numStr.charAt(i);
        }

        System.out.println(reverseNumStr);
        return Integer.valueOf(reverseNumStr);
    }

    static void main(String[] args) {
        new ReverseNumbers().reverseNumber(12345);
        new ReverseNumbers().reverseNumber(3956);

    }
}
