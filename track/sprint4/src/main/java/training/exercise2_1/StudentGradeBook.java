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

    public Map<String, Integer> getLastNameToGrade() {
        Map<String, Integer> lastNameToGrade = new HashMap<>();

        for (int i = 0; i < lastNames.length; i++) {
            lastNameToGrade.put(lastNames[i], grades[i]);
        }

        return lastNameToGrade;
    }

    Map<Student, Integer> getStudentToGrade() {
        Map<Student, Integer> studentToGrade = new HashMap<>();

        for (int i = 0; i < firstNames.length; i++) {
            studentToGrade.put(new Student(firstNames[i], lastNames[i]), grades[i]);
        }

        return studentToGrade;
    }
}
