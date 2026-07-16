package learning.calculator;

import org.jetbrains.annotations.NotNull;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public int addNumbers(int @NotNull ... args) {
        int sum = 0;
        for (int num : args) {
            sum += num;
        }
        return sum;
    }

}
