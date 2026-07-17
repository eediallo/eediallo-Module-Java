package prep.exercise1_2;

import prep.exercise1_1.Calculator;

public class CompleteCalculator extends Calculator {
    public int square(int a) {
        return a * a;
    }

    public double squareRoot(int a) {
        if (a < 0) {
            throw new IllegalArgumentException("Square root of a negative number");
        }

        return Math.sqrt(a);
    }
}
