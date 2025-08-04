package day34_Collection_Map_Interface;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();

        // Add entries
        map.put(101, "Java");
        map.put(102, "Spring Boot");
        map.put(103, "Microservices");

        // putIfAbsent won't override existing key
        map.putIfAbsent(102, "Hibernate");

        // Replace a value
        map.replace(103, "Spring Security");

        // Retrieve a value
        System.out.println("Course for 102: " + map.get(102));

        // Iterate entries
        System.out.println("\n📋 All Entries:");
        for (Integer key : map.keySet()) {
            System.out.println(key + " → " + map.get(key));
        }
    }
}
