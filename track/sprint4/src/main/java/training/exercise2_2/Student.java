package training.exercise2_2;

import java.util.Objects;

/**
 * Represents an individual student identified by their first and last name.
 * <p>
 * This class implements custom {@link #equals(Object)} and {@link #hashCode()}
 * logic to enable safe usage as a key in hash-based collections
 */
public class Student {
    private String firstName;
    private String lastName;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * {@inheritDoc}
     * <p>
     * Two {@code Student} instances are considered equal if and only if both
     * their {@code firsName} and {@code lastName} values are equal.
     *
     * @param o the reference object with which to compare
     * @return {@code true} if this object is identical to the {@code o} argument by name;
     * {@code false} otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName);
    }

    /**
     * {@inheritDoc}
     * <p>
     * Generates a hash code integer based on the student's {@code firstName}
     * abd {@code lastName} fields.
     *
     * @return a hash code value this student object
     */
    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
