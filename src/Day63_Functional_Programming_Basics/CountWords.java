package Day63_Functional_Programming_Basics;


//Count Words Starting with a Letter
//Count how many words in a list start with the letter "A".


import java.util.Arrays;
import java.util.List;

public class CountWords {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Apple", "Banana", "Avocado", "Dates", "Mango", "Grapes");

        long count = words.stream()
                .filter(w -> w.startsWith("A"))
                .count();

        System.out.println(count);   // 2
    }
}
