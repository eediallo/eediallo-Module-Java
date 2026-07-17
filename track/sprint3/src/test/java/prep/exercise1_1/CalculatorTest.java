package prep.exercise1_1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Should add two numbers")
    void testAdd() {
        assertEquals(10, calculator.add(5, 5), "5 + 5 = 0");
    }

    @Test
    @DisplayName("Division by non zero value")
    void testDivide() {
        assertEquals(2, calculator.divide(10, 5), " 10 / 5 = 2");
    }

    @Test
    void testDivideByZeroThrows() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> calculator.divide(10, 0), "Division by zero");
        assertEquals("Division by zero", exception.getMessage());
    }
}
