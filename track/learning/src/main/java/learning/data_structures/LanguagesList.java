package learning.data_structures;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class LanguagesList {

    // Search for an item in a list
    private static <T> boolean searchForItemInList(T item, Collection<T> list) {
        if (list.contains(item)) {
            System.out.println(item + " is on the list");
            return true;
        }

        System.out.println(item + " is not on the list");
        return false;
    }

    static void main(String[] args) {
        List<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("JavaScript");
        languages.add("Rust");

        Collections.sort(languages);

        for (String lang : languages) {
            System.out.println(lang);
        }

        List<Integer> nums = (List.of(87, 98, 293, 3883, 100));
        int maxInt = Collections.max(nums);

        System.out.println(maxInt + "<======MAX INTEGER");
        System.out.println(Collections.min(nums) + " <=========Min value");

        Collections.addAll(languages, "C++", "C", "Scala", "Ruby", "Go");

        System.out.println("After adding new Languages: " + languages);

        languages.remove("C++");
        languages.remove(languages.size() - 1);

        System.out.println("After removing some languages: " + languages);

        // Searching for elements
        searchForItemInList("Java", languages);
        searchForItemInList("C++", languages);
        searchForItemInList(89, nums);
        searchForItemInList(100, nums);

        languages.set(0, "TypeScript");

        System.out.println("After updating element at index 0: " + languages);

    }
}
