package training.exercise2_1;

import training.exercise2_2.Student;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void removeStudent() {

    }

    public static void main(String[] args) {
        String[] firstNames = {"Anuket", "Eryn", "Filip", "Raquel", "Eryn"};
        String[] lastNames = {"Hassan", "Doe", "Pappas", "Clarke", "Jones"};
        int[] grades = {22, 45, 35, 22, 41};

        StudentGradeBook studentGradeBook = new StudentGradeBook(firstNames, lastNames, grades);

        // New Joiner Data
        String newJoinerFirstName = "Miriam";
        String newJoinerLastName = "Barry";
        int newJoinerGrade = 50;

        // Left student data
        String leftStudentFirstName = "Filip";
        String leftStudentLastName = "Pappas";
        int leftStudentGrade = 35;

        // Student whose grade needs to be set to zero data.
        String gradeToZeroStudentFirstName = "Raquel";
        String gradeToZeroStudentLastName = "Clarke";

        List<String> firstNamesList = studentGradeBook.getFirstNames();
        studentGradeBook.addStudentToCollection(newJoinerFirstName, firstNamesList);
        firstNamesList.remove(leftStudentFirstName);
        System.out.println("First Names: " + firstNamesList);

        Set<String> distinctFirstNames = studentGradeBook.getDistinctFirstNames();
        studentGradeBook.addStudentToCollection(newJoinerFirstName, distinctFirstNames);
        distinctFirstNames.remove(leftStudentLastName);
        System.out.println("Distinct First Names: " + distinctFirstNames);


        Map<String, Integer> lastNameToGrades = studentGradeBook.getLastNameToGrade();
        studentGradeBook.addStudentToCollection(newJoinerLastName, newJoinerGrade, lastNameToGrades);
        studentGradeBook.removeStudentToCollection(leftStudentLastName, leftStudentGrade, lastNameToGrades);
        lastNameToGrades.put(gradeToZeroStudentLastName, 0);
        System.out.println("LastName to grade: " + lastNameToGrades);

        Map<Student, Integer> studentToGrade = studentGradeBook.getStudentToGrade();
        studentGradeBook.addStudentToCollection(new Student(newJoinerFirstName, newJoinerLastName), newJoinerGrade, studentToGrade);
        studentGradeBook.removeStudentToCollection(new Student(leftStudentFirstName, leftStudentLastName), leftStudentGrade, studentToGrade);
        studentToGrade.put(new Student(gradeToZeroStudentFirstName, gradeToZeroStudentLastName), 0);
        studentToGrade.forEach((student, grade) -> {
            System.out.println(student + " -> Grade: " + grade);
        });
    }
}
