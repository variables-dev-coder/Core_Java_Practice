package day39_Collection_List_Interface;

import java.util.ArrayList;

public class SecondLargestInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(40);
        numbers.add(20);
        numbers.add(50);
        numbers.add(30);

        if (numbers.size() < 2) {
            System.out.println("Not enough elements to find second largest.");
            return;
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : numbers) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }

        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("No second largest element (all elements may be same).");
        } else {
            System.out.println("Second Largest Number: " + secondMax);
        }
    }
}

// Second Largest Number: 40