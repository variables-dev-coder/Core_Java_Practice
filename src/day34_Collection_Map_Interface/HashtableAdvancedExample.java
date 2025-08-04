package day34_Collection_Map_Interface;

import java.util.Hashtable;
import java.util.Map;

public class HashtableAdvancedExample {
    public static void main(String[] args) {
        // Creating a Hashtable of Employee IDs and Names
        Hashtable<Integer, String> employees = new Hashtable<>();

        // putIfAbsent() avoids overwriting existing keys
        employees.putIfAbsent(1001, "Alice");
        employees.putIfAbsent(1002, "Bob");
        employees.putIfAbsent(1003, "Charlie");

        // Trying to add a duplicate key (will not overwrite)
        employees.putIfAbsent(1001, "David"); // Ignored

        // replace() will update the value if key exists
        employees.replace(1002, "Bobby");

        // Display using entrySet()
        System.out.println("📋 Employee Hashtable:");
        for (Map.Entry<Integer, String> entry : employees.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " → Name: " + entry.getValue());
        }

        // Try removing an entry
        employees.remove(1003);
        System.out.println("\nAfter removing ID 1003:");
        System.out.println(employees);

        // Check for key existence
        System.out.println("\nContains key 1001? " + employees.containsKey(1001));
        System.out.println("Contains value 'Charlie'? " + employees.containsValue("Charlie"));

        // Attempting to use null key or value (uncommenting below lines will throw exception)
        // employees.put(null, "NullKey");   // NullPointerException
        // employees.put(1004, null);        // NullPointerException
    }
}
