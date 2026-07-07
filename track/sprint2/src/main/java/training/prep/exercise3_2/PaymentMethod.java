package training.prep.exercise3_2;

/**
 * ✍️Exercise 3.2 - Overloading vs Overriding
 * Starting with:
 * <p>
 * class PaymentMethod {
 * void pay(double amount) {
 * System.out.println("Paying " + amount ");
 * }
 * }
 * Overload the pay method:
 * <p>
 * Add an overloaded pay(double amount, String currency)
 * Implement the method to reference the currency when paying
 * Instantiate a PaymentMethod class in your main method and call both methods of pay
 * Override the pay method:
 * <p>
 * Create DirectDebit extending PaymentMethod
 * Override pay(double amount)
 * Instantiate a DirectDebit class and call both methods of pay
 */
class PaymentMethod {
    void pay(double amount) {
        System.out.println("Paying " + amount);
    }

    void pay(double amount, String currency){
        System.out.println("Paying " + currency + amount);
    }

    public static void main(String[] args) {
        PaymentMethod paymentMethod = new PaymentMethod();
        paymentMethod.pay(100.0);
        paymentMethod.pay(200.0, "£");
    }
}
