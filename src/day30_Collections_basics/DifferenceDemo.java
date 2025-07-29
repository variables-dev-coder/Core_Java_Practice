package day30_Collections_basics;

// Collection and collections difference

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class DifferenceDemo {
    public static void main(String[] args) {

        // Collection Interface usage
        Collection<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Cherry");
        fruits.add("Banana");

        // Collections class usages
        Collections.sort((List<String>) fruits);  // sorting
        System.out.println(fruits);     // [Apple, Banana, Cherry]

    }
}
