package training.prep.exercise3_1;

public class Parrot extends Animal {
    public Parrot(String name) {
        super(name);
    }

    public void squawk() {
        System.out.println(getName() + " is squawking!!!");
    }
}
