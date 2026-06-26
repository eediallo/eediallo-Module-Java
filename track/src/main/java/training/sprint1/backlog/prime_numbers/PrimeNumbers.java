package training.sprint1.backlog.prime_numbers;

/**
 * Exercise
 * Create a private method to print all prime numbers up to 1000. Call this
 * from a main method. Remember to use sensible method and variable names,
 * and add documentation where necessary! Remember to use the debugger if something goes wrong!
 */

public class PrimeNumbers {
    /**
     * Check whether a given int is a prime number ( a whole number greater than 1 that has exactly two factors: 1 and itself)
     *
     * @param num the whole number to check
     * @return a boolean value, true if prime, false otherwise.
     *
     */
    private boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;

        int factor = 3;
        while (factor * factor <= num) {
            if (num % factor == 0) return false;
            factor += 2;
        }
        return true;
    }
}
