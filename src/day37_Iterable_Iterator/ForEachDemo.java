package day37_Iterable_Iterator;


/*
2. Can you use for-each loop with Iterator directly? Why or Why not?

Answer:
No. The enhanced for loop (for-each) works on Iterable, not on Iterator.
Because Iterable has the iterator() method which the compiler uses internally.

Example:
 */

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ForEachDemo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10, 20, 30);

        // Works because List implements Iterable
        for(int n : nums) {
            System.out.println(n);
        }

        // Iterator cannot be used directly in for-each
        Iterator<Integer> it = nums.iterator();
        // for(int n : it) // Compile error
    }
}

//10
//20
//30