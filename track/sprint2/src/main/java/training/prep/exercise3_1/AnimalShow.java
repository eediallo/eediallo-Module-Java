package training.prep.exercise3_1;

public class AnimalShow {
    public void perform(Animal animal) {
        if (animal instanceof Dog) {
            ((Dog) animal).bark();
        } else if (animal instanceof Cat) {
            ((Cat) animal).meow();
        } else {
            System.out.println(animal.getName() + " is neither a dog nor a cat");
        }
    }
}
