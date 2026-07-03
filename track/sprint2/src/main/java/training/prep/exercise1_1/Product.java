package training.prep.exercise1_1;

/**
 * Exercise 1.1 - Product Class
 * Create a Product class with:
 * <p>
 * Fields: name, price, stockCount
 * <p>
 * Getters and setters for each field
 * <p>
 * A toString method that includes each of the fields
 * <p>
 * Two constructors:
 * <p>
 * Name and price only, defaulting stockCount to 0
 * <p>
 * Name, price and stock
 * <p>
 * Create several products and print them, then modify your first constructor so that it takes advantage of constructor chaining.
 */
public class Product {
    private String name;
    private double price;
    private int stockAccount;

    public Product(String name, double price) {
        this(name, price, 0);
    }

    public Product(String name, double price, int stockAccount) {
        this.name = name;
        this.price = price;
        this.stockAccount = stockAccount;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStockAccount() {
        return stockAccount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setStockAccount(int stockAccount) {
        this.stockAccount = stockAccount;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", stockAccount=" + stockAccount +
                '}';
    }

    static void main(String[] args) {
        Product p1 = new Product("EDA-1", 55.34);
        Product p2 = new Product("EDA2", 99.99, 23948783);
        System.out.println("Product 1: " + p1);
        System.out.println("Product 2: " + p2);
    }
}
