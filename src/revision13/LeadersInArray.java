package revision13;

//Find All Leaders in Array
//Leader: element greater than all elements on its right.
//Example: [16,17,4,3,5,2] → 17, 5, 2

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeadersInArray {
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        int maxRight = arr[arr.length - 1];
        List<Integer> leaders = new ArrayList<>();
        leaders.add(maxRight);

        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > maxRight) {
                maxRight = arr[i];
                leaders.add(maxRight);
            }
        }

        Collections.reverse(leaders);
        System.out.println(leaders);
    }
}

//Logic:
//Traverse from right, keep track of the maximum seen so far.
//Concept: Reverse traversal, conditional tracking.