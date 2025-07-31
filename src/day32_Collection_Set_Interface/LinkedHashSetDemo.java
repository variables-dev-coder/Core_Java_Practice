package day32_Collection_Set_Interface;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        Set<String> countries = new LinkedHashSet<>();

        countries.add("India");
        countries.add("USA");
        countries.add("Germany");
        countries.add("India");   // duplicate
        countries.add("Australia");
        countries.add(null);      // null is allowed
        countries.add("Brazil");

        // Print elements - insertion order is maintained
        System.out.println("Countries in LinkedHashSet:");
        for (String country : countries) {
            System.out.println(country);
        }

        // Check if a value exists
        System.out.println("\nContains 'USA'? " + countries.contains("USA"));

        // Remove an element
        countries.remove("Germany");

        // Check size and empty
        System.out.println("Size: " + countries.size());
        System.out.println("Is empty? " + countries.isEmpty());
    }
}
/*
Countries in LinkedHashSet:
India
USA
Germany
Australia
null
Brazil

Contains 'USA'? true
Size: 5
Is empty? false

 */