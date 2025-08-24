package revision_5;
/*
Find Min & Max in Array

Problem: Find the smallest and largest element in an array.

Example:
Input: [10, 4, 7, 25, 1]
Output: Min = 1, Max = 25

 */


public class MinMaxExample {
    public static void main(String[] args) {
        int[] arr = {10, 4, 7, 25, 1};

        int min = arr[0];
        int max = arr[0];

        for(int i=1; i<arr.length; i++) {
            if(arr[i] < min) min = arr[i];
            if(arr[i] > max) max = arr[i];
        }

        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
    }
}

// Logic: Traverse array → keep track of smallest & largest. (O(n))

//Min = 1
//Max = 25