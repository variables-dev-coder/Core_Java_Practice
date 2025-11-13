package revision13;

//Move All Zeros to End of Array
//Input: [0, 1, 0, 3, 12]
//Output: [1, 3, 12, 0, 0]

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        int index = 0;

        for (int num : arr)
            if (num != 0)
                arr[index++] = num;

        while (index < arr.length)
            arr[index++] = 0;

        System.out.println(Arrays.toString(arr));
    }
}


//Logic:
//Keep track of non-zero index and shift all non-zeros forward.
//Fill remaining positions with 0.
//Concept: Two-pointer technique, array shifting.

