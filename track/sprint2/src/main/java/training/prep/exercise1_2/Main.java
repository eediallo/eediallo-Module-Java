package training.prep.exercise1_2;

import training.prep.exercise1_1.Product;

/**
 * ✍️Exercise 1.2 - Reference Behaviour
 * Starting with the following in your main method:
 * <p>
 * Product p1 = new Product("Laptop", 900);
 * Product p2 = p1;
 * p2.setPrice(1100);
 * System.out.println(p1.getPrice());
 * System.out.println(p2.getPrice());
 * Tasks:
 * Predict the output
 * Run the code to verify
 * Change how p2 is instantiated so that making changes to it does not affect p1
 */
public class Main {
    public void main(String[] args) {
        Product p1 = new Product("Laptop", 900);
        Product p2 = new Product("Laptop", 900);
        p2.setPrice(1100);
        System.out.println(p1.getPrice());// 900
        System.out.println(p2.getPrice()); // 1100
    }
}
