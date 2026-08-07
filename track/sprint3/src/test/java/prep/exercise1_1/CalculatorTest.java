package prep.exercise1_1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for verifying the behavior of the {@link Calculator} class.
 * <p>
 * Ensures that basic arithmetic operations behave as expected and that proper
 * exceptions are thrown during invalid operations (such as division by zero).
 *
 * @see Calculator
 */
class CalculatorTest {
    private Calculator calculator = new Calculator();

    /**
     * Verifies that the add method correctly adds two integers.
     */
    @Test
    @DisplayName("Should add two numbers")
    void testAdd() {
        assertEquals(10, calculator.add(5, 5), "5 + 5 = 0");
    }

    /**
     * Verifies that the divide method performs standard integer division
     * when passed a valid non-zero divisor.
     */
    @Test
    @DisplayName("Division by non zero value")
    void testDivide() {
        assertEquals(2, calculator.divide(10, 5), " 10 / 5 = 2");
    }

    /**
     * Verifies that the divide method throws an {@link IllegalArgumentException} with the correct
     * error message ("Division by zero") when dividing by zero.
     */
    @Test
    void testDivideByZeroThrows() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> calculator.divide(10, 0), "Division by zero");
        assertEquals("Division by zero", exception.getMessage());
    }
}
