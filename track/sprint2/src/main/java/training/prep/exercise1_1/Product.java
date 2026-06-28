package training.prep.exercise1_1;

/*
* Exercise 1.1 - Product Class
Create a Product class with:

Fields: name, price, stockCount

Getters and setters for each field

A toString method that includes each of the fields

Two constructors:

Name and price only, defaulting stockCount to 0

Name, price and stock

Create several products and print them, then modify your first constructor so that it takes advantage of constructor chaining.
* */

public class Product {
  private String name;
  private double price;
  private int stockAccount;

  public Product(String name){
      this.name = name;
      this.stockAccount = 0;
  }

  public Product(String name, double price, int stockAccount){
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

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", stockAccount=" + stockAccount +
                '}';
    }
}
