package prep.exercise1_2;

import prep.exercise1_1.Calculator;

/**
 * An extension of the basic {@link Calculator} that adds support for
 * advanced mathematical operations such as squaring and square roots
 */
public class CompleteCalculator extends Calculator {
    /**
     * Calculate the square of an integer (a value multiply by itself).
     *
     * @param a the value to be squared
     * @return the product of the {@code a * a}
     */
    public int square(int a) {
        return a * a;
    }

    /**
     * Calculates the principal square root of a non-negative integer.
     *
     * @param a the non-negative integer whose square root is to be calcualted
     * @return the positive square root of {@code a} as {@code double}
     * @throws IllegalArgumentException if {@code a} is negative
     */
    public double squareRoot(int a) {
        if (a < 0) {
            throw new IllegalArgumentException("Square root of a negative number");
        }

        return Math.sqrt(a);
    }
}
