package training.prep.exercise3_3;

import training.prep.exercise3_2.PaymentMethod;

/**
 * ✍️Exercise 3.3 - Composition vs Inheritance
 * Building on the last exercise, we now need to support a checkout process. A checkout must be able to take a payment using a payment method.
 * <p>
 * Tasks:
 * <p>
 * Create a Checkout class.
 * Decide how Checkout should relate to PaymentMethod. Should Checkout extend PaymentMethod, or should it contain a PaymentMethod?
 * Implement the chosen relationship, if your Checkout class contains a PaymentMethod remember to instantiate it inside your constructor
 * Add a method processPayment(double amount) in Checkout that uses the payment method to make a payment.
 * In your main method:
 * Create a PaymentMethod
 * Create a Checkout
 * Call your processPayment method
 * Stretch task - implement a different extension of PaymentMethod, and add a method to Checkout that lets you update the PaymentMethod before making a payment
 */
public class Checkout {
    private PaymentMethod paymentMethod;

    public Checkout(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void processPayment(double amount) {
        paymentMethod.pay(amount);
    }

    public static void main(String[] args) {
        PaymentMethod paymentMethod = new PaymentMethod();
        Checkout checkout = new Checkout(paymentMethod);
        checkout.processPayment(500.0);
    }
}
