package day36_Collection_Problem;

import java.util.HashSet;
import java.util.Set;

public class HashSetPractice {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10); // duplicate ignored

        System.out.println("HashSet: " + set);

        // Check existence
        System.out.println("Contains 20? " + set.contains(20));

        // Remove
        set.remove(30);

        // Iteration
        for(int val : set) {
            System.out.println(val);
        }
    }
}

/*
HashSet: [20, 10, 30]
Contains 20? true
20
10
 */