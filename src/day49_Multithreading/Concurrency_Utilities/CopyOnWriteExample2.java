package day49_Multithreading.Concurrency_Utilities;

/*
Q5. Demonstrate CopyOnWriteArrayList behavior during iteration when list is modified.
Theory:
Normal ArrayList → ConcurrentModificationException if modified during iteration.
CopyOnWriteArrayList → safe, creates a new copy on modification.

 */


import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteExample2 {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("A"); list.add("B"); list.add("C");

        for (String s : list) {
            System.out.println("Reading: " + s);
            list.add("X"); // safe during iteration
        }

        System.out.println("Final List: " + list);
    }
}


/*
Dry Run:
Iteration runs over original snapshot → prints A, B, C.
Meanwhile, "X" keeps getting added.
Final list: [A, B, C, X, X, X].

Reading: A
Reading: B
Reading: C
Final List: [A, B, C, X, X, X]
 */