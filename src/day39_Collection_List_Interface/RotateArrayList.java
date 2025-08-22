package day39_Collection_List_Interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int k = 2;

        int n = list.size();
        k = k % n; // normalize

        List<Integer> rotated = new ArrayList<>();
        rotated.addAll(list.subList(n - k, n));  // last k elements
        rotated.addAll(list.subList(0, n - k));  // first n-k elements

        System.out.println("Original List: " + list);
        System.out.println("Rotated List: " + rotated);
    }
}

/*
Original List: [1, 2, 3, 4, 5]
Rotated List: [4, 5, 1, 2, 3]

 */