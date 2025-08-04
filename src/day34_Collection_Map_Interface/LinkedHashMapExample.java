package day34_Collection_Map_Interface;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        Map<Integer, String> students = new LinkedHashMap<>();

        students.put(101, "Munna");
        students.put(102, "Aziz");
        students.put(103, "Ravi");
        students.put(104, "Pooja");

        // Access and print elements
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // Some useful methods
        System.out.println("\nContains key 102? " + students.containsKey(102));
        System.out.println("Contains value 'Pooja'? " + students.containsValue("Pooja"));
        System.out.println("Value of key 101: " + students.get(101));
    }
}
