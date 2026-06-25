package training.sprint1.prep.exercise3_1;

/*
* ✍️Exercise 3.1
Goal: Write a method signature which takes parameters.

Create a private method called greetUser that:
Accepts a String name as a parameter.
Returns a greeting message like “Hello, Alice!”.
Call this method from a main method and print the result.
Explain each part of the method signature for the name method.
* */

public class Greet {
    // private => access modifier which makes this method only callable within the Greet class
    // String => return type, means method return a text
    // greetUser => method identifier, once called execute logic within it.
    // String name => param list, means method takes one argument of type string (text)
    // return => return value text
    private String greetUser(String name) {
        return "Hello, " + name + "!";
    }

    public static void main(String[] args) {
        String greetAlice = new Greet().greetUser("Alice");
        System.out.println(greetAlice);
    }
}
