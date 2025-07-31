package day32_Collection_Set_Interface;

import java.util.*;

public class HashSetOperations {
    public static void main(String[] args) {
        // List with duplicate
        List<Integer> numbers = Arrays.asList(10, 20, 30, 10, 40, 20, 50);

        // Convert List to set to remove duplicate
        Set<Integer> uniqueNumbers = new HashSet<>(numbers);

        System.out.println("Original List: " + numbers);  // Original List: [10, 20, 30, 10, 40, 20, 50]

        System.out.println("Unique Numbers using HashSet: " + uniqueNumbers);  // Unique Numbers using HashSet: [50, 20, 40, 10, 30]

        // Add new numbers
        uniqueNumbers.add(60);
        uniqueNumbers.add(70);
        System.out.println(uniqueNumbers); // [50, 20, 70, 40, 10, 60, 30]

        // Remove number
        uniqueNumbers.remove(30);
        System.out.println(uniqueNumbers);  // [50, 20, 70, 40, 10, 60]

        // Check existence
        System.out.println("Contains 40? " + uniqueNumbers.contains(40));  // Contains 40? true

        // Convert Set back to List
        List<Integer> uniqueList = new ArrayList<>(uniqueNumbers);
        System.out.println("Converted back to List: " + uniqueList); // Converted back to List: [50, 20, 70, 40, 10, 60]

        // Simulate Union
        Set<Integer> setA = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> setB = new HashSet<>(Arrays.asList(3, 4, 5));
        setA.addAll(setB);  // Union
        System.out.println("Union of sets: " + setA);  // Union of sets: [1, 2, 3, 4, 5]

        // Simulate Intersection
        Set<Integer> setC = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> setD = new HashSet<>(Arrays.asList(3, 4, 5));
        setC.retainAll(setD);  // Intersection
        System.out.println("Intersection of sets: " + setC);   // Intersection of sets: [3]


    }
}
