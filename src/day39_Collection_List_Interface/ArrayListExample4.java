package day39_Collection_List_Interface;

import java.util.ArrayList;

public class ArrayListExample4 {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();

        // Add elements
        cities.add("Hyderabad");
        cities.add("Bangalore");
        cities.add("Chennai");
        cities.add("Mumbai");
        cities.add("Delhi");

        System.out.println("Original list: " + cities);

        // 1. Remove by index
        cities.remove(2); // Remove chennai
        System.out.println("After removing index 2 : " + cities);

        // 2. Remove by value
        cities.remove("Mumbai");
        System.out.println("After removing 'Mumbai': " + cities);

        // 3. Remove all
        cities.clear();
        System.out.println("After clearing list: " + cities);
    }
}

/*

Original list: [Hyderabad, Bangalore, Chennai, Mumbai, Delhi]
After removing index 2 : [Hyderabad, Bangalore, Mumbai, Delhi]
After removing 'Mumbai': [Hyderabad, Bangalore, Delhi]
After clearing list: []


 */