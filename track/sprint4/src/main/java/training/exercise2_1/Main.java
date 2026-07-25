package training.exercise2_1;

import training.exercise2_2.Student;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
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
            System.out.println(student + " -> Grade: " + grade);
        });
    }
}
