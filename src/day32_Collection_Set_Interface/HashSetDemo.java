package day32_Collection_Set_Interface;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> fruits = new HashSet<>();

        // Adding element
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Dates");
        fruits.add("Grapes");
        fruits.add("Banana");
        fruits.add("Mango");      // duplicate will be ignored
        fruits.add("null");       // only one null allow

        System.out.println("Fruits Set: " + fruits);  // Fruits Set: [Apple, Grapes, null, Mango, Dates, Banana]

        System.out.println("Contains Mango? " + fruits.contains("Mango"));   // Contains Mango? true

        fruits.remove("Apple");
        System.out.println("After Removing? " + fruits);   // After Removing? [Grapes, null, Mango, Dates, Banana]

        System.out.println("Set Size: " + fruits.size());   // Set Size: 5

        // Iterate
        System.out.println("Iterating:");
        for (String fruit: fruits) {
            System.out.print(fruit + " ");   // Grapes null Mango Dates Banana
        }
        System.out.println();

        System.out.println(fruits);   // [Grapes, null, Mango, Dates, Banana]
    }
}
