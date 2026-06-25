package training.sprint1.prep.exercise2_4;

/*
* ✍️Exercise 2.4
Write a program that uses a switch statement to print the name of the day based on an integer (1 = Monday, etc.).
Explain why switch in Java differs from JavaScript (e.g. type safety).
* */

public class Main {

    public static void printNameOfDay(int day) {
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            default -> System.out.println("Sunday");
        }
    }

    public static void main(String[] args) {
        Main.printNameOfDay(1); // Monday
        Main.printNameOfDay(5); //  Friday
        Main.printNameOfDay(7); // Sunday
    }
}
/*
Java enforces identical data types for the expression and all case labels at compile time,
whereas JavaScript allows you to evaluate any combination of data types inside the same blockt at runtime.
* */