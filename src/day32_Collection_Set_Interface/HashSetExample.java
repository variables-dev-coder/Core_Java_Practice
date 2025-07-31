package day32_Collection_Set_Interface;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {

        // Create a HashSet of names
        Set<String> names = new HashSet<>();

        // Add names
        names.add("Munna");
        names.add("Aziz");
        names.add("Rahul");
        names.add("munna"); // lowercase 'm' – different from "Munna"
        names.add("Rahul"); // duplicate – will be ignored
        names.add(null);    // null allowed
        names.add("Zara");

        // Print all names using for-each loop
        System.out.println("Names in the HashSet:");
        for (String name : names) {
            System.out.println(name);
        }

        // Check if a name exists
        System.out.println("\nContains 'Aziz'? " + names.contains("Aziz"));
        System.out.println("Contains 'aziz'? " + names.contains("aziz")); // case-sensitive

        // Remove a name
        names.remove("Zara");

        // Check size
        System.out.println("\nSize after removal: " + names.size());

        // Check if empty
        System.out.println("Is HashSet empty? " + names.isEmpty());
    }
}


/*

Names in the HashSet:
null
Rahul
Aziz
Munna
Zara
munna

Contains 'Aziz'? true
Contains 'aziz'? false

Size after removal: 5
Is HashSet empty? false
 */