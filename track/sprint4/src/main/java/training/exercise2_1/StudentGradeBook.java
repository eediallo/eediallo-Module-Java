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


    public static void main(String[] args) {
        String[] firstNames = {"Anuket", "Eryn", "Filip", "Raquel", "Eryn"};
        String[] lastNames = {"Hassan", "Doe", "Pappas", "Clarke", "Jones"};
        int[] grades = {22, 45, 35, 22, 41};

        StudentGradeBook studentGradeBook = new StudentGradeBook(firstNames, lastNames, grades);

        List<String> firstNamesList = studentGradeBook.getFirstNames();
        System.out.println("First Names: " + firstNamesList);

        Set<String> distinctFirstNames = studentGradeBook.getDistinctFirstNames();
        System.out.println("Distinct First Names: " + distinctFirstNames);


        Map<String, Integer> lastNameToGrades = studentGradeBook.getLastNameToGrade();
        System.out.println("LastName to grade: " + lastNameToGrades);

        Map<Student, Integer> studentToGrade = studentGradeBook.getStudentToGrade();

        studentToGrade.forEach((student, grade) -> {
            System.out.println(student + ": " + grade);
        });
    }

}
