package prep.exercise1_2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompleteCalculatorTest {
    private CompleteCalculator completeCalculator;

    @BeforeEach
    void setup() {
        completeCalculator = new CompleteCalculator();
    }

    @Test
    void testSquare() {
        assertEquals(25, completeCalculator.square(5), "5 * 5 = 25");
    }

    @Test
    void testSquareRootOfNegativeNumberThrows() {
        assertThrows(IllegalArgumentException.class, () -> completeCalculator.squareRoot(-5));
    }

    @Test
    void testSquareRootOfPositiveEvenNumber() {
        assertEquals(5, completeCalculator.squareRoot(25));
    }

}