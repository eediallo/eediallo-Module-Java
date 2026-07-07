package training.prep.exercise3_1;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Hodor");
//        dog.bark();
        Cat cat = new Cat("Titi");
//        cat.meow();

        AnimalShow animalShow = new AnimalShow();
        animalShow.perform(cat);
        System.out.println("'=========");
        animalShow.perform(dog);
        System.out.println("'=========");
        animalShow.perform(new Parrot("Polly"));
    }
}
