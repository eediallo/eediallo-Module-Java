package training.sprint1.prep.exercise4_1;

/*
* ✍️Exercise 4.1
Goal: Learn to use breakpoints and inspect variables.

Write a program that calculates the sum of numbers from 1 to 100 and prints the result
Introduce a bug (e.g., start the loop at -1 instead of 1).
Use IntelliJ’s debugger to:
Set a breakpoint inside the loop.
Inspect the value of the sum variable and the result variable, seeing how they change as you step through.
Step through the code to find the error.
* */

public class Main {

    public static void printSumOfNumbersFrom1To100() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }

        System.out.println(sum);
    }

    static void main(String[] args) {
        Main.printSumOfNumbersFrom1To100();
    }
}
