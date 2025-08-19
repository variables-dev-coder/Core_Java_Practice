package day36_Collection_Problem;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        // Add elements
        names.add("Munna");
        names.add("Rahul");
        names.add("Anita");
        names.add("Munna"); // duplicate allowed

        System.out.println("ArrayList: " + names);

        // Remove
        names.remove("Rahul");

        // Search
        System.out.println("Contains 'Anita'? " + names.contains("Anita"));

        // Iterate
        for(String name : names) {
            System.out.println(name);
        }
    }
}

/*
ArrayList: [Munna, Rahul, Anita, Munna]
Contains 'Anita'? true
Munna
Anita
Munna

 */