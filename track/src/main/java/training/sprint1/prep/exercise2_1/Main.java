package training.sprint1.prep.exercise2_1;

/*
* ✍️Exercise 2.1
Goal: Practice basic syntax and keywords.

Create a program that:

Declares variables of different primitive types (int, double, boolean, char).
Prints their values to the console.
Add comments explaining what each keyword does (e.g., public, static, void).
* */

public class Main {
    public static void main(String[] args) {
        int numberOfTrainees = 100;
        double courseCost = 28.4d;
        boolean isActive = true;
        char letter = 'A';

        System.out.println(numberOfTrainees);
        System.out.println(courseCost);
        System.out.println(isActive);
        System.out.println(letter);

        // public: access modifier which makes method main accessible by other classes in the module
        // static: makes main part of the class Main not its instances.
        // void: means that main does not return any value.
    }
}
