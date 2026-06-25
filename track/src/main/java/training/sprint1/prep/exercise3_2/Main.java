package training.sprint1.prep.exercise3_2;

/*
* ✍️Exercise 3.2
Create a method calculateSum that takes two integers and returns their sum.
Add JavaDoc comments explaining the method.
* */

public class Main {

    public int calculateSum(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        System.out.println(new Main().calculateSum(10, 10)); // 20;
    }
}
