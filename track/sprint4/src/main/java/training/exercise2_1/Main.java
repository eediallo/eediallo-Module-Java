package training.exercise2_1;

import training.exercise2_2.Student;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] firstNames = {"Anuket", "Eryn", "Filip", "Raquel", "Eryn"};
        String[] lastNames = {"Hassan", "Doe", "Pappas", "Clarke", "Jones"};
        int[] grades = {22, 45, 35, 22, 41};

        StudentGradeBook studentGradeBook = new StudentGradeBook(firstNames, lastNames, grades);

        Student newJoiner = new Student("Miriam", "Barry");
        int newJoinerGrade = 50;

        Student leftStudent = new Student("Filip", "Pappas");
        int leftStudentGrade = 35;

        Student gradeToZero = new Student("Raquel", "Clarke");

        listOperationsDemo(studentGradeBook, newJoiner, leftStudent);
        setOperationsDemo(studentGradeBook, newJoiner, leftStudent);
        lastNameMapOperationsDemo(studentGradeBook, newJoiner, newJoinerGrade, leftStudent, leftStudentGrade, gradeToZero);
        studentMapOperationsDemo(studentGradeBook, newJoiner, newJoinerGrade, leftStudent, leftStudentGrade, gradeToZero);
        highestLowestGradeDemo(studentGradeBook.getGradeList());

    }

    private static void highestLowestGradeDemo(List<Integer> gradeList) {
        int highestGrade = getHighestGrade(gradeList);
        System.out.println("Highest Grade: " + highestGrade + "\n");

        int lowestGrade = getLowestGrade(gradeList);
        System.out.println("Highest Grade: " + lowestGrade + "\n");
    }

    private static int getHighestGrade(List<Integer> gradeList) {
        return Collections.max(gradeList);
    }

    private static int getLowestGrade(List<Integer> gradeList) {
        return Collections.min(gradeList);
    }


    private static void studentMapOperationsDemo(StudentGradeBook studentGradeBook, Student newJoiner, int newJoinerGrade, Student leftStudent, int leftStudentGrade, Student gradeToZero) {
        System.out.println("=====STUDENT MAP OPERATIONS (Student -> Grade) =====");
        Map<Student, Integer> studentToGrade = studentGradeBook.getStudentToGrade();
        studentGradeBook.addStudentToCollection(newJoiner, newJoinerGrade, studentToGrade);
        studentGradeBook.removeStudentToCollection(leftStudent, leftStudentGrade, studentToGrade);
        studentToGrade.put(gradeToZero, 0);
        studentToGrade.forEach((student, grade) -> {
            System.out.println(" - " + student + " -> Grade: " + grade);
        });
        System.out.println();
    }

    private static void lastNameMapOperationsDemo(StudentGradeBook studentGradeBook, Student newJoiner, int newJoinerGrade, Student leftStudent, int leftStudentGrade, Student gradeToZero) {
        System.out.println("=====MAP OPERATIONS (Last Name -> Grade) =====");
        Map<String, Integer> lastNameToGrades = studentGradeBook.getLastNameToGrade();
        studentGradeBook.addStudentToCollection(newJoiner.getLastName(), newJoinerGrade, lastNameToGrades);
        studentGradeBook.removeStudentToCollection(leftStudent.getLastName(), leftStudentGrade, lastNameToGrades);
        lastNameToGrades.put(gradeToZero.getLastName(), 0);
        System.out.println("Updated Map: " + lastNameToGrades + "\n");
    }

    private static void setOperationsDemo(StudentGradeBook studentGradeBook, Student newJoiner, Student leftStudent) {
        System.out.println("=====SET OPERATIONS (Distinct First Names)=====");
        Set<String> distinctFirstNames = studentGradeBook.getDistinctFirstNames();
        studentGradeBook.addStudentToCollection(newJoiner.getFirstName(), distinctFirstNames);
        distinctFirstNames.remove(leftStudent.getLastName());
        System.out.println("Updated list: " + distinctFirstNames + "\n");
    }

    private static void listOperationsDemo(StudentGradeBook studentGradeBook, Student newJoiner, Student leftStudent) {
        System.out.println("=====LIST OPERATIONS (First Names)=====");
        List<String> firstNamesList = studentGradeBook.getFirstNames();
        studentGradeBook.addStudentToCollection(newJoiner.getFirstName(), firstNamesList);
        firstNamesList.remove(leftStudent.getFirstName());
        System.out.println("Updated list: " + firstNamesList + "\n");
    }
}
