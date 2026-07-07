package training.prep.exercise4_1;

/**
 * ✍️Exercise 4.1 - Static Instance Counter
 * Tasks:
 * <p>
 * Create a class: Create a new class named Planet
 * Instance Field: Give the class a non-static (instance) field: private String name;
 * Add a constructor that takes the name.
 * Static Field (Shared State): Add a private static field to track the number of Planet objects created: private static int planetCount = 0;
 * Modify the Constructor: In the Planet constructor, increment planetCount every time a new Planet object is created
 * Static Method (Class Behaviour): Add a public static method to retrieve the count: public static int getPlanetCount() that returns planetCount
 * What happens if you try to reference the instance’s name field in this method?
 * Test: In your main method (or a separate test file):
 * Create three different Planet objects: earth, mars, jupiter
 * Print the planetCount using only the class name (Planet.getPlanetCount())
 * What happens when you print earth.getPlanetCount(), why is this confusing?
 */
public class Planet {
    private String name;

    private static int planetCount = 0;

    public Planet(String name) {
        this.name = name;
        planetCount++;
    }

    public static int getPlanetCount() {
        //  * What happens if you try to reference the instance’s name field in this method?
        // => We get this compile error: Non-static field 'name' cannot be referenced from a static context
        // name = "Elhadj";
        return planetCount;
    }

}
