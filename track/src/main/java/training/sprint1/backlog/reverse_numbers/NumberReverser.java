package training.sprint1.backlog.reverse_numbers;

/**
 * Create a private method that accepts a number as an argument and returns the number in reverse.
 * For example, an input of 3956 should return 6593. Create code to call this from a main method. Remember
 * to use sensible method and variable names, and add documentation. Remember to use the debugger if something goes wrong!
 */
public class NumberReverser {
    /**
     * reverses the digits of an integer using Math.log10 to determine loop count.
     *
     * @param num The integer to be reversed
     * @return The reversed integer
     * @implNote this method assumes that the input fits within
     * the integer boundaries and does not account for overflow with Integer.MAX_VALUE.
     */
    private int reverseInteger(int num) {
        int reversed = 0;

        int digitCount = (int) Math.log10(Math.abs(num)) + 1;

        for (int i = 0; i < digitCount; i++) {
            int lastDigit = num % 10;
            reversed = (reversed * 10) + lastDigit;
            num = num / 10;
        }

        return (num < 0) ? -reversed : reversed;
    }

    public static void main(String[] args) {
        NumberReverser reverseNumbers = new NumberReverser();
        int reversedNumber = reverseNumbers.reverseInteger(-123);
        int reversedNumber1 = reverseNumbers.reverseInteger(0);
        System.out.println(reversedNumber);
        System.out.println(reversedNumber1);
    }
}
