package learning.calculator;

import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @BeforeAll
    static void setup() {
        System.out.println("@BeforeAll: execute before all tests in this class");
    }

    @BeforeEach
    void init() {
        System.out.println("@BeforeEach: execute before each test in the class");
    }


    @Test
    @DisplayName("5 + 5 = 10")
    void addTwoNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(10, calculator.add(5, 5));
    }

    @Test
    @DisplayName("Adding 7 and 3 give 10")
    void addAnotherTwoNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(10, calculator.add(7, 3));
    }

    @Test
    @DisplayName("7 + 2 + 1 = 10")
    void addThreeNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(10, calculator.add(7, 2, 1));
    }

    @Test
    @Disabled("Until bug 4 is fixed")
    void addNumbers() {
        Calculator calculator = new Calculator();
        int actual = calculator.addNumbers(1, 2, 3, 4);
        assertEquals(10, actual);
    }

    @Test
    void sumShouldNotBeGreaterThan10() {
        List<Integer> nums = Arrays.asList(1, 2, 3, 3);
        Calculator calculator = new Calculator();
        int sum = calculator.addNumbers(1, 2, 3);
        assertTrue(nums.stream().mapToInt(Integer::intValue).sum() > sum);
    }

    @Test
    void listElementsShouldMatch() {
        List<Integer> nums = Arrays.asList(1, 2, 3, 3);
        assertAll(() -> assertEquals(nums.toArray()[0], 1), () -> assertEquals(nums.toArray()[1], 2), () -> assertEquals(nums.toArray()[2], 3));
    }

    public int add(int a, int b) {
        return a + b;
    }

    @AfterAll
    static void finalSetup() {
        System.out.println("=========================================");
        System.out.println("@AfterAll: Freeing external resources...");
    }

    @AfterEach
    void finalEach() {
        System.out.println("@AfterEach: Closing db....");
    }
}