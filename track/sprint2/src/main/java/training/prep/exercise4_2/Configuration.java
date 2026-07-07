package training.prep.exercise4_2;

/**
 * ✍️Exercise 4.2 - Final Safety
 * This exercise explores the three main uses of final: fields, methods, and classes.
 * <p>
 * Final Fields
 * Create a class named Configuration in a package of your choice.
 * Class Constant: Add a public static final field for a universally constant value: public static final int MAX_USERS = 100;
 * Final Instance Field: Add a private final field: private final String systemName;
 * Initialise it in the constructor.
 * Test in main:
 * Try to reassign Configuration.MAX_USERS = 200; and observe the compiler error.
 * Create a Configuration instance. Try to reassign its systemName field (you’ll need to create a setter for this) and observe the compiler error
 * Final Methods and Classes
 * Create a parent class
 * <p>
 * Create a class named Polygon in your package.
 * Add a private final int field for numberOfSides.
 * Create a constructor that does not include this field, what happens?
 * Create a constructor that takes a numberOfSides parameter and initialises the field.
 * Add a getter method getNumberOfSides() to return the value of numberOfSides.
 * Add a public final method describe() that prints: ‘I am a polygon with X sides’ where X is the numberOfSides field
 * Try to create a setter for numberOfSides. Can you compile it?
 * Create a subclass
 * <p>
 * Create a class named Triangle that extends Polygon.
 * In the constructor, call the superclass constructor with 3 sides.
 * Try to override the describe() method in Triangle. What error does the compiler give you?
 * Make the parent class final
 * <p>
 * Change the Polygon class declaration to:
 * public final class Polygon
 * Try to compile the Triangle class. What error do you get?
 */

public class Configuration {
    public static final int MAX_USERS = 100;
    private final String systemName;

    public Configuration(String systemName) {
        this.systemName = systemName;
    }

    public void setSystemName(String newSystemName) {
        this.systemName = newSystemName; // Cannot assign a value to final variable 'systemName'
    }

    public static void main(String[] args) {
        Configuration configuration = new Configuration("LEWRU");
        //  Configuration.MAX_USERS = 200; => Cannot assign a value to final variable 'MAX_USERS'
    }
}

final class Polygon {
    private final int numberOfSides;

    public Polygon(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    public int getNumberOfSides() {
        return numberOfSides;
    }

    public final void describe() {
        System.out.println("I am a polygon with " + getNumberOfSides() + " sides");
    }

    // does not compile: Cannot assign a value to final variable 'numberOfSides'
    public final void setNumberOfSides(String newNumberOfSides) {
        this.numberOfSides = newNumberOfSides;
    }
}


// after making parent 'final': Cannot inherit from final class 'training.prep.exercise4_2.Polygon'
class Triangle extends Polygon {
    public Triangle() {
        super(3);
    }

    // 'describe()' cannot override 'describe()' in 'training.prep.exercise4_2.Polygon'; overridden method is final
    @Override
    public void describe() {

    }
}
