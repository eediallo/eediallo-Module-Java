package training.exercise2_1;

import training.exercise2_2.Student;

import java.util.*;

public class StudentGradeBook {

    private String[] firstNames;
    private String[] lastNames;
    private int[] grades;

    public StudentGradeBook(String[] firstNames, String[] lastNames, int[] grades) {
        this.firstNames = firstNames;
        this.lastNames = lastNames;
        this.grades = grades;
    }

    public List<String> getFirstNames() {
        return Arrays.asList(firstNames);
    }

    public Set<String> getDistinctFirstNames() {
        return new HashSet<>(getFirstNames());
    }

    /**
     * Maps each student's last name to their achieved grade.
     * <p>
     * <b>Note:</b> Because map keys must be unique, duplicate last names (e.g., twins)
     * override earlier entries in the map.
     *
     * @return a {@link Map} linking student last names to their corresponding numerical grades
     */
    public Map<String, Integer> getLastNameToGrade() {
        Map<String, Integer> lastNameToGrade = new HashMap<>();

        for (int i = 0; i < lastNames.length; i++) {
            lastNameToGrade.put(lastNames[i], grades[i]);
        }

        return lastNameToGrade;
    }

    /**
     * Creates a mapping of individual {@link Student} entities to their acheived grades.
     * <p>
     * Unlike {@link #getLastNameToGrade()}, using full {@link Student} objects as map keys
     * safely supports sharing the same surname.
     *
     * @return a {@link Map} linking each {@link Student} to their corresponding numerical grades
     *
     */
    Map<Student, Integer> getStudentToGrade() {
        Map<Student, Integer> studentToGrade = new HashMap<>();

        for (int i = 0; i < firstNames.length; i++) {
            studentToGrade.put(new Student(firstNames[i], lastNames[i]), grades[i]);
        }

        return studentToGrade;
    }
}
