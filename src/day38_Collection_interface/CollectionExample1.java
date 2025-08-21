package day38_Collection_interface;


// Using Collection Interface with ArrayList

import java.util.ArrayList;
import java.util.Collection;

public class CollectionExample1 {
    public static void main(String[] args) {
    Collection<String> collection = new ArrayList<>();

    // Add elements
        collection.add("Apple");
        collection.add("Banana");
        collection.add("Mango");

    // Display
        System.out.println("Fruits: " + collection);

    // Check size
        System.out.println("Size: " + collection.size());

    // Check if contains
        System.out.println("Contains Banana? " + collection.contains("Banana"));

    // Remove
        collection.remove("Banana");
        System.out.println("After removal: " + collection);
}
}

/*
Fruits: [Apple, Banana, Mango]
Size: 3
Contains Banana? true
After removal: [Apple, Mango]
 */