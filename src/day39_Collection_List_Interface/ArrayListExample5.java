package day39_Collection_List_Interface;

import java.util.ArrayList;

public class ArrayListExample5 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Banana");

        System.out.println("Fruits List: " + fruits);

        // 1. Check if element exists
        if (fruits.contains("Mango")) {
            System.out.println("Mango is present in the list.");
        }

        // 2. Find index of first occurrence
        int firstIndex = fruits.indexOf("Banana");
        System.out.println("First index of Banana: " + firstIndex);

        // 3. Find index of last occurrence
        int lastIndex = fruits.lastIndexOf("Banana");
        System.out.println("Last index of Banana: " + lastIndex);

        // 4. Check for an element that doesn't exist
        if (!fruits.contains("Papaya")) {
            System.out.println("Papaya is NOT in the list.");
        }
    }
}

/*
Fruits List: [Apple, Banana, Mango, Orange, Banana]
Mango is present in the list.
First index of Banana: 1
Last index of Banana: 4
Papaya is NOT in the list.


 */