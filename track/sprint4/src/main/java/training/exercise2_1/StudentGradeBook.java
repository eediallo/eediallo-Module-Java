package training.exercise2_1;

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

    public Map<String, Integer> getLastNameToGrade(String[] lastNames, int[] grades) {
        Map<String, Integer> lastNameToGrades = new HashMap<>();

        for (int i = 0; i < lastNames.length; i++) {
            lastNameToGrades.put(lastNames[i], grades[i]);
        }

        return lastNameToGrades;
    }

    public static void main(String[] args) {
        String[] firstNames = {"Anuket", "Eryn", "Filip", "Raquel", "Eryn"};
        String[] lastNames = {"Hassan", "Doe", "Pappas", "Clarke", "Jones"};
        int[] grades = {22, 45, 35, 22, 41};

        StudentGradeBook studentsGrades = new StudentGradeBook(firstNames, lastNames, grades);

        List<String> firstNamesList = studentsGrades.getFirstNames();
        System.out.println("First Names: " + firstNamesList);

        Set<String> distinctFirstNames = studentsGrades.getDistinctFirstNames();
        System.out.println("Distinct First Names: " + distinctFirstNames);


        Map<String, Integer> lastNameToGrades = studentsGrades.getLastNameToGrade(lastNames, grades);
        System.out.println("LastName to grade: " + lastNameToGrades);
    }

}
