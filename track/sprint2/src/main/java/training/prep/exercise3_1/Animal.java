package training.prep.exercise3_1;

/**
 * ✍️Exercise 3.1 - From Downcasting to Polymorphism
 * Set up a classes for an animal show:
 * <p>
 * Create a base class Animal with a name field and getter, include the name of the animal in your constructor
 * Create Dog extends Animal with a method bark() that prints something using the name
 * Create Cat extends Animal with a method meow() that prints something using the name
 * Create an AnimalShow class with a method: public void perform(Animal animal)
 * Implement perform using instanceof and casting so that:
 * <p>
 * If the animal is a Dog, it calls bark()
 * If the animal is a Cat, it calls meow()
 * Otherwise it prints a default message
 * Confirm this runs as expected for each of your animal types, then:
 * <p>
 * Add a new animal type, e.g. Parrot extends Animal with method squawk()
 * Call show.perform(new Parrot("Polly"))
 * Observe the output - is the squawk() method called?
 * Refactor this design to use a single method on Animal that is overridden by all subclasses.
 */
public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
