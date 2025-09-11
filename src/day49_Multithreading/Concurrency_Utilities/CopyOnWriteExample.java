package day49_Multithreading.Concurrency_Utilities;


/*
CopyOnWriteArrayList
Safe for concurrent read-heavy tasks.
On write → creates new copy.
 */

import java.util.concurrent.*;
import java.util.*;

public class CopyOnWriteExample {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("A");
        list.add("B");

        for (String item : list) {
            list.add("C"); // no ConcurrentModificationException
        }

        System.out.println(list);
    }
}

// [A, B, C, C]