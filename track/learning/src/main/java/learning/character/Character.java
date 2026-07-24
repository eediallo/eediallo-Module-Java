package learning.character;

import java.util.Objects;

public class Character {
    private String name;

    public Character(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Character character = (Character) o;
        return Objects.equals(name, character.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    static void main(String[] args) {
        Character c1 = new Character("Michael");
        System.out.println(c1.getName());
        System.out.println(c1.hashCode() + "<= +=======C1 hasCode");

        Character c2 = new Character("Michael");
        System.out.println(c2.getName());
        System.out.println(c2.hashCode() + "<= +=======C2 hasCode");

        // compare characters

        System.out.println(c1.equals(c2));
    }

}
