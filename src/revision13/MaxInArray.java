package revision13;

// Find Maximum Element in Array

public class MaxInArray {
    public static void main(String[] args) {
        int[] arr = {3, 9, 1, 4, 7};
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println("Maximum Element: " + max);  // Maximum Element: 9
    }
}

//Logic:
//Track max value while traversing.
//Concept: Arrays, loop traversal.