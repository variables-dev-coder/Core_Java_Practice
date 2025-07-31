package day32_Collection_Set_Interface;

import java.util.TreeSet;

public class TreeSetMethodsExample {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();

        set.add(10);
        set.add(30);
        set.add(50);
        set.add(70);

        System.out.println("Original TreeSet: " + set);

        System.out.println("First element: " + set.first());    // smallest
        System.out.println("Last element: " + set.last());      // largest

        System.out.println("Ceiling of 35: " + set.ceiling(35)); // least >= 35
        System.out.println("Floor of 35: " + set.floor(35));     // greatest <= 35

        System.out.println("Ceiling of 50: " + set.ceiling(50)); // 50 itself
        System.out.println("Floor of 10: " + set.floor(10));     // 10 itself
    }
}

/*
Original TreeSet: [10, 30, 50, 70]
First element: 10
Last element: 70
Ceiling of 35: 50
Floor of 35: 30
Ceiling of 50: 50
Floor of 10: 10

 */