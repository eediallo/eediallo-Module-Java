package training.sprint1.prep.exercise2_3;

/*
* ✍️Exercise 2.3
Goal: Compare Java control flow with JavaScript.

Write a program that:

Uses a for loop to print numbers 1 to 10.
Uses an if-else statement to check if a number is even or odd.
Bonus: Rewrite the same logic in JavaScript and note the differences in syntax.
* */

public class Main {

    public static void printNumbers1To10() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void isEven(int num) {
        if (num % 2 == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public static void main(String[] args) {
        Main.printNumbers1To10();
        Main.isEven(5); // false
        Main.isEven(4); // true;

    }

    /** JAVA                         vs                           JavaScript
     * *********************************************************************
     1. System.out.println()                                      console.log()
     2. int  i = 0                                                 let i = 0
     3. arg => int num                                            arg => num;
     4. ==                                                          ===
     **/
}
