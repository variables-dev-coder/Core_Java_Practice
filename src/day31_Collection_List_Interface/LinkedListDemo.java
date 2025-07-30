package day31_Collection_List_Interface;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> tech = new LinkedList<>();

        // add element
        tech.add("Java");
        tech.add("Spring");
        tech.add("SQL");
        tech.add("Java");  // duplicate allowed

        System.out.println("Initial list: " + tech);    // [Java, Spring, SQL, Java]

        // add at beginning and end
        tech.addFirst("DSA");
        tech.addLast("AWS");
        System.out.println("After addFirst & addLast: " + tech);  // [DSA, Java, Spring, SQL, Java, AWS]

        // Remove elements
        tech.removeFirst();
        tech.removeLast();
        System.out.println("After removeFirst & removeLast: " + tech); // [Java, Spring, SQL, Java]

        // Get and set
        System.out.println("Element at index 2: " + tech.get(2)); // SQL
        tech.set(2, "MongoDB");
        System.out.println("After set at index 2: " + tech); // [Java, Spring, MongoDB, Java]

        // Contains
        System.out.println("Contains 'Spring'? " + tech.contains("Spring")); // true

        // Clear
        tech.clear();
        System.out.println("List after clear(): " + tech); // []
    }
}
