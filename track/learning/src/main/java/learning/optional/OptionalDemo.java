package learning.optional;

import java.util.Optional;

public class OptionalDemo {
    static void main(String[] args) {
        String[] words = new String[10];
        words[5] = "Solution";
        Optional<String> op = Optional.ofNullable(words[5]);
        if (op.isPresent()) {
            String word = words[5].toUpperCase();
            System.out.println(word);
        } else {
            System.out.println("word at index 5 is null");
        }
    }
}
