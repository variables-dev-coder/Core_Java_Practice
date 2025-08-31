package revision_7;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates3 {
    public static void main(String[] args) {
        int[] nums = {10, 60, 100, 20, 30, 20, 30, 10, 40, 20, 50, 10};

        // HashSet -> Unique but unordered
        Set<Integer> hashSet = new HashSet<>();

        // LinkedHashSet -> Unique and maintains insertion order
        Set<Integer> linkedHashSet = new LinkedHashSet<>();

        // TreeSet -> Unique + sorted order
        Set<Integer> treeSet = new TreeSet<>();

        for (int num : nums) {
            hashSet.add(num);
            linkedHashSet.add(num);
            treeSet.add(num);
        }
        System.out.println("HashSet (Unordered) : " + hashSet);
        System.out.println("LinkedHashSet (Insertion Order : " + linkedHashSet);
        System.out.println("TreeSet (Sorted Order) : " + treeSet);
    }
}

/*

HashSet (Unordered) : [50, 100, 20, 40, 10, 60, 30]
LinkedHashSet (Insertion Order : [10, 60, 100, 20, 30, 40, 50]
TreeSet (Sorted Order) : [10, 20, 30, 40, 50, 60, 100]

 */
