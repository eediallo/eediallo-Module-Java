package learning.streams;

import java.util.*;
import java.util.stream.Collectors;

public class StudentGrade {
    static void main(String[] args) {
        Map<String, Integer> m = Map.of("Mic", 90, "Salif", 100, "Miriam", 30);
        m.entrySet().stream().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));

        int total = m.values().stream().mapToInt(Integer::intValue).sum();

        List<String> studentList = m.keySet().stream().filter(name -> name.startsWith("M")).toList();

        Optional<Integer> usersWith100OverGrade = m.values().stream().filter(grade -> grade >= 300).findAny();

        if (usersWith100OverGrade.isPresent()) {
            System.out.println("There is at lease one USER WITH 100 OVER GRADE");

        } else {
            System.out.println("No user with such grade in the system.");
        }

        List<String> names = Arrays.asList("Michal", "Charlie", "Alice");

        names.sort(Comparator.naturalOrder());

        System.out.println("\nSorted names: " + names + "\n");

        System.out.println("Sum of grades: " + total);

        System.out.println("Student list: " + studentList);

        List<Integer> nums = Arrays.asList(1, 1, 1, 1, 1, 3, 1);

        boolean match = nums.stream().allMatch(num -> num == 1);
        System.out.println("\n" + match + " <==== all match\n");

        boolean anyMatch = nums.stream().anyMatch(num -> num == 1);
        System.out.println("\n" + anyMatch + " <==== ANY match\n");

        Optional<Integer> oneIsPresent = nums.stream().filter(num -> num == 1).findFirst();


        List<String> list = Arrays.asList(
                "Reflection", "Collection", "Stream",
                "Structure", "Sorting", "State"
        );

        //ForEach print each element in the list
        list.stream().forEach(System.out::println);

        // collect names starting with S;
        List<String> sNames = list.stream().filter(l -> l.startsWith("S")).collect(Collectors.toList());
        System.out.println("\nNames with S: " + sNames + "\n");

        // Concat names
        String concatNames = list.stream().reduce("", (acc, el) -> acc + " " +  el);
        System.out.println("\nConcat Names : " + concatNames + "\n");

        // count the name numbers;
        long countNumber = list.stream().count();
        System.out.println("\nCount Names : " + countNumber + "\n");


        // find the first name
        Optional<String> firstName = list.stream().findFirst();
        if(firstName.isPresent()){
            System.out.println("\nFirst name found : " + firstName.get() + "\n");
        }

    }
}
