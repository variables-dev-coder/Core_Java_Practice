package day38_Collection_interface;

// Difference Together (Collection + Collections)

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Example5 {
    public static void main(String[] args) {
        Collection<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");

        System.out.println("Collection before sort: " + fruits);

        // Sorting using Collections utility class
        List<String> fruitList = new ArrayList<>(fruits);
        Collections.sort(fruitList);

        System.out.println("After sort using Collections: " + fruitList);
    }
}

//Collection before sort: [Banana, Apple, Mango]
//After sort using Collections: [Apple, Banana, Mango]