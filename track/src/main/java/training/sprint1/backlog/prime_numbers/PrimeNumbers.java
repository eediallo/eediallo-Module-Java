package training.sprint1.backlog.prime_numbers;

/**
 * Exercise
 * Create a private method to print all prime numbers up to 1000. Call this
 * from a main method. Remember to use sensible method and variable names,
 * and add documentation where necessary! Remember to use the debugger if something goes wrong!
 */

public class PrimeNumbers {
    /**
     * Checks if a divisor is a perfect factor of a target number.
     *
     */
    private boolean isFactor(int target, int divisor) {
        return target % divisor == 0;
    }

    /**
     * Checks whether a given int is a prime number ( a whole number greater than 1 that has exactly two factors: 1 and itself)
     *
     * @param num the whole number to check
     * @return a boolean value, true if prime, false otherwise.
     *
     */
    private boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        if (isFactor(num, 2)) return false; // even numbers are not prime numbers

        int factor = 3;
        while (factor * factor <= num) {
            if (isFactor(num, factor)) return false;
            factor += 2; // make sure we only check odd numbers.
        }
        return true;
    }

    private void printPrimeNumbersUpTo1000() {
        for (int i = 1; i <= 1000; i++) {
            if (this.isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    static void main(String[] args) {
        new PrimeNumbers().printPrimeNumbersUpTo1000();
    }
}
