package day39_Collection_List_Interface;

import java.util.ArrayList;

public class ArrayListExample1 {
    public static void main(String[] args) {
        // Create ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Add (Create)
        fruits.add("Apple");   // 0    index
        fruits.add("Banana");  // 1
        fruits.add("Mango");    // 2
        fruits.add("Apple");    // 3     // Duplicate allow

        // Read
        System.out.println("Fruits: " + fruits);  // Fruits: [Apple, Banana, Mango, Apple]

        // Update
        fruits.set(3, "Grapes");     // replace with Apple index no 3
        System.out.println("Fruits: " + fruits);    // Fruits: [Apple, Banana, Mango, Grapes]

        // Delete
        fruits.remove(2);
        System.out.println("Fruits: " + fruits);    // Fruits: [Apple, Banana, Grapes]
    }
}
