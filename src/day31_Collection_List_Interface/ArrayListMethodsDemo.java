package day31_Collection_List_Interface;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMethodsDemo {
    public static void main(String[] args) {

        // 1. Create ArrayList of Strings
        ArrayList<String> names = new ArrayList<>();

        // 2. Add elements
        names.add("Munna");
        names.add("Aziz");
        names.add("Java");
        names.add("Munna"); // duplicate allowed

        System.out.println("Initial List: " + names);

        // 3. Add at specific index
        names.add(1, "Spring");
        System.out.println("After adding 'Spring' at index 1: " + names);

        // 4. Get element by index
        System.out.println("Element at index 2: " + names.get(2));

        // 5. Replace element at index (set)
        names.set(3, "MySQL");
        System.out.println("After replacing index 3 with 'MySQL': " + names);

        // 6. Check if list contains element
        System.out.println("Contains 'Java'? " + names.contains("Java"));
        System.out.println("Contains 'Python'? " + names.contains("Python"));

        // 7. Remove by index
        names.remove(0);
        System.out.println("After removing element at index 0: " + names);

        // 8. Remove by value
        names.remove("MySQL");
        System.out.println("After removing 'MySQL': " + names);

        // 9. Find first and last index of element
        System.out.println("First index of 'Munna': " + names.indexOf("Munna"));
        System.out.println("Last index of 'Munna': " + names.lastIndexOf("Munna"));

        // 10. Size of ArrayList
        System.out.println("Size of list: " + names.size());

        // 11. Check if empty
        System.out.println("Is list empty? " + names.isEmpty());

        // 12. Sort elements
        Collections.sort(names);
        System.out.println("Sorted list: " + names);

        // 13. Reverse list
        Collections.reverse(names);
        System.out.println("Reversed list: " + names);

        // 14. Clear all elements
        names.clear();
        System.out.println("After clear(): " + names);
        System.out.println("Is list empty now? " + names.isEmpty());
    }
}
