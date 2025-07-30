package day31_Collection_List_Interface;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        // Creating Vector
        Vector<String> names = new Vector<>();

        // Adding elements
        names.add("Munna");
        names.add("Ajay");
        names.add("Zara");

        // Inserting at index
        names.add(1, "Bhanu");

        // Display all elements
        System.out.println("Initial Vector: " + names);

        // Accessing elements
        System.out.println("First Element: " + names.firstElement());
        System.out.println("Last Element: " + names.lastElement());
        System.out.println("Element at index 2: " + names.elementAt(2));

        // Modify element
        names.set(2, "Deepak");

        // Check contains
        System.out.println("Contains 'Zara'? " + names.contains("Zara"));

        // Remove element
        names.remove("Ajay");
        names.remove(0); // by index

        // Size
        System.out.println("Size of Vector: " + names.size());

        // Check empty
        System.out.println("Is Vector empty? " + names.isEmpty());

        // Final Vector
        System.out.println("Final Vector: " + names);

        // Clear all
        names.clear();
        System.out.println("After clear(): " + names);
    }
}

/*

Initial Vector: [Munna, Bhanu, Ajay, Zara]
First Element: Munna
Last Element: Zara
Element at index 2: Ajay
Contains 'Zara'? true
Size of Vector: 2
Is Vector empty? false
Final Vector: [Bhanu, Deepak]
After clear(): []

 */