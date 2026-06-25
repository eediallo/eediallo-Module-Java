package training.sprint1.prep.exercise2_4;

/*
* ✍️Exercise 2.4
Write a program that uses a switch statement to print the name of the day based on an integer (1 = Monday, etc.).
Explain why switch in Java differs from JavaScript (e.g. type safety).
* */

public class Main {

    public static void printNameOfDay(int day) {
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Sunday");
        }
    }

    public static void main(String[] args) {
        Main.printNameOfDay(1); // Monday
        Main.printNameOfDay(5); //  Friday
        Main.printNameOfDay(7); // Sunday
    }
}
