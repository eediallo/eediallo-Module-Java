package learning.streams;

import java.util.List;
import java.util.Map;

public class StudentGrade {
    static void main(String[] args) {
        Map<String, Integer> m = Map.of("Mic", 90, "Salif", 100, "Miriam", 30);
        m.entrySet().stream().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));

        int total = m.values().stream().mapToInt(Integer::intValue).sum();

        List<String> studentList = m.keySet().stream().filter(name -> name.startsWith("M")).toList();

        System.out.println("Sum of grades: " + total);

        System.out.println("Student list: " + studentList);
    }
}
