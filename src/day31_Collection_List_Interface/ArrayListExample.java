package day31_Collection_List_Interface;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Munna");
        names.add("Aziz");
        names.add("Joy");
        names.add("Tom");
        names.add("Munna");    // duplicate
        names.add("null");

        System.out.println("Names: " + names);   // Names: [Munna, Aziz, Joy, Tom, Munna, null]
        System.out.println("First name: " + names.get(0));  // Munna, index based access

        names.remove(1);  // Remove Aziz
        System.out.println("After remove: " + names);    // After remove: [Munna, Joy, Tom, Munna, null]

        System.out.println("Contains 'Aziz' ? " + names.contains("Aziz"));   // false
    }
}
