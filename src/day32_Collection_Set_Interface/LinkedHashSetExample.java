package day32_Collection_Set_Interface;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<String> studentNames = new LinkedHashSet<>();

        // Adding student names
        studentNames.add("Arjun");
        studentNames.add("Bhavna");
        studentNames.add("Charan");
        studentNames.add("Arjun");   // Duplicate - will be ignored
        studentNames.add("Disha");
        studentNames.add(null);      // null allowed
        studentNames.add("Esha");

        // Displaying names (in insertion order)
        System.out.println("Student List:");
        for (String name : studentNames) {
            System.out.println(name);
        }

        // Checking for a student's presence
        System.out.println("\nIs 'Disha' in the list? " + studentNames.contains("Disha"));
        System.out.println("Is 'Farhan' in the list? " + studentNames.contains("Farhan"));

        // Removing a name
        studentNames.remove("Charan");

        // Size and empty check
        System.out.println("\nTotal Students: " + studentNames.size());
        System.out.println("Is list empty? " + studentNames.isEmpty());

        // Clear all elements
        studentNames.clear();
        System.out.println("\nAfter clearing, is list empty? " + studentNames.isEmpty());
    }
}

/*
Student List:
Arjun
Bhavna
Charan
Disha
null
Esha

Is 'Disha' in the list? true
Is 'Farhan' in the list? false

Total Students: 6
Is list empty? false

After clearing, is list empty? true

 */