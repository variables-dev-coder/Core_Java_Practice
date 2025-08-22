package day39_Collection_List_Interface;

import java.util.ArrayList;

public class ArrayListReverseManual {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("Original List: " + numbers);

        // Manual reverse using two-pointer technique
        int left = 0;
        int right = numbers.size() - 1;

        while (left < right) {
            // Swap elements
            int temp = numbers.get(left);
            numbers.set(left, numbers.get(right));
            numbers.set(right, temp);

            left++;
            right--;
        }

        System.out.println("Reversed List: " + numbers);
    }
}

/*
Original List: [10, 20, 30, 40, 50]
Reversed List: [50, 40, 30, 20, 10]


Logic:

We use two pointers:
left starts from beginning (0).
right starts from end (size - 1).
Swap values at left and right.
Move left++ and right--.
Continue until left >= right.

Complexity:
Time: O(n) (linear scan).
Space: O(1) (no extra list, just swaps).


 */