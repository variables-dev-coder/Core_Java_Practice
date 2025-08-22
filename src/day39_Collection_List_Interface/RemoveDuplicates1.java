package day39_Collection_List_Interface;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class RemoveDuplicates1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(10);
        list.add(30);
        list.add(40);
        list.add(20);
        list.add(50);

        // Convert ArrayList to LinkedHashSet (removes duplicates & keeps order)
        LinkedHashSet<Integer> set = new LinkedHashSet<>(list);

        // Convert back to ArrayList
        ArrayList<Integer> uniqueList = new ArrayList<>(set);

        System.out.println("Original List: " + list);
        System.out.println("Unique List: " + uniqueList);
    }
}

/*
Original List: [10, 20, 10, 30, 40, 20, 50]
Unique List: [10, 20, 30, 40, 50]

 */