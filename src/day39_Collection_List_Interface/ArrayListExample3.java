package day39_Collection_List_Interface;

import java.util.ArrayList;

public class ArrayListExample3 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

        // 1. For loop with index
        System.out.println("Using for loop: ");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }

        // 2. Enhanced for loop
        System.out.println("\nUsing enhance for loop: ");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // 3. using for each with lambda
        System.out.println("\nUsing for each with lambda: ");
        fruits.forEach(f -> System.out.println(f));
    }
}

/*
Using for loop:
Apple
Banana
Mango
Orange

Using enhance for loop:
Apple
Banana
Mango
Orange

Using for each with lambda:
Apple
Banana
Mango
Orange


 */