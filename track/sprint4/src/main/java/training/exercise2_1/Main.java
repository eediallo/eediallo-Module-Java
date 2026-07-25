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

        // New Joiner Data
        String newJoinerFirstName = "Miriam";
        String newJoinerLastName = "Barry";
        int newJoinerGrade = 50;

        List<String> firstNamesList = studentGradeBook.getFirstNames();
        firstNamesList.add(newJoinerFirstName);
        System.out.println("First Names: " + firstNamesList);

        Set<String> distinctFirstNames = studentGradeBook.getDistinctFirstNames();
        distinctFirstNames.add(newJoinerFirstName);
        System.out.println("Distinct First Names: " + distinctFirstNames);


        Map<String, Integer> lastNameToGrades = studentGradeBook.getLastNameToGrade();
        lastNameToGrades.put(newJoinerLastName, newJoinerGrade);
        System.out.println("LastName to grade: " + lastNameToGrades);

        Map<Student, Integer> studentToGrade = studentGradeBook.getStudentToGrade();
        studentToGrade.put(new Student(newJoinerFirstName, newJoinerLastName), newJoinerGrade);
        studentToGrade.forEach((student, grade) -> {
            System.out.println(student + " -> Grade: " + grade);
        });
    }
}
