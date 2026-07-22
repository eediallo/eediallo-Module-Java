package prep.exercise1_1;

/**
 * Provides basic arithmetic operations for integer values
 * including addition, multiplication and division.
 */
public class Calculator {
    /**
     * Calculates the usm of two integers.
     *
     * @param a the first integer
     * @param b second integer
     * @return the arithmetic sum of {@code a} and {@code b}
     */
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Multiplies two integers together.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the product of {@code a} and {@code b}
     *
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Divides the dividend by the divisor using integer division.
     *
     * @param a the dividend (value being divided)
     * @param b the divisor (value dividing by)
     * @return the quotient resulting from {@code a / b}
     * @throws IllegalArgumentException if {@code b } is zero
     */
    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero");
        }
        return a / b;
    }
}