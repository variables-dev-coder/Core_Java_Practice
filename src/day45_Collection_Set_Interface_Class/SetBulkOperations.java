package day45_Collection_Set_Interface_Class;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetBulkOperations {
    public static void main(String[] args) {
        Set<Integer> setA = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> setB = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8));

        System.out.println("Set A: " + setA);
        System.out.println("Set B: " + setB);

        // 1. UNION (All elements in A OR B)
        // Use addAll()
        Set<Integer> union = new HashSet<>(setA);
        union.addAll(setB);
        System.out.println("Union (A ∪ B): " + union); // [1, 2, 3, 4, 5, 6, 7, 8]

        // 2. INTERSECTION (Elements in both A AND B)
        // Use retainAll()
        Set<Integer> intersection = new HashSet<>(setA);
        intersection.retainAll(setB);
        System.out.println("Intersection (A ∩ B): " + intersection); // [4, 5]

        // 3. ASYMMETRIC DIFFERENCE (Elements in A but NOT in B)
        // Use removeAll()
        Set<Integer> difference = new HashSet<>(setA);
        difference.removeAll(setB);
        System.out.println("Difference (A - B): " + difference); // [1, 2, 3]

        // 4. SUBSET Check (Is A a subset of B?)
        // Use containsAll()
        Set<Integer> testSubset = new HashSet<>(Arrays.asList(2, 3));
        boolean isSubset = setA.containsAll(testSubset);
        System.out.println("Is " + testSubset + " a subset of " + setA + "? " + isSubset); // true
    }
}

/*

Set A: [1, 2, 3, 4, 5]
Set B: [4, 5, 6, 7, 8]
Union (A ∪ B): [1, 2, 3, 4, 5, 6, 7, 8]
Intersection (A ∩ B): [4, 5]
Difference (A - B): [1, 2, 3]
Is [2, 3] a subset of [1, 2, 3, 4, 5]? true

 */