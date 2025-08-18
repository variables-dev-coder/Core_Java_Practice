package day24_Binary_Search;



/*
1.What is Binary Search?
Binary Search is a searching algorithm used to find the position of a target element in a sorted array or list.
Works on sorted data only (ascending or descending).
Reduces the search space by half in each step → O(log n) time complexity.

2. How Binary Search Works (Logic)
    1. Start with two pointers:
            low = 0 → start of array
            high = n - 1 → end of array
2. Find the middle element:
            mid = low + (high - low) / 2
3. Compare the middle element with the target:
            If arr[mid] == target → Found! Return index.
            If arr[mid] < target → Target is in the right half → low = mid + 1
            If arr[mid] > target → Target is in the left half → high = mid - 1
4. Repeat steps 2–3 until low <= high.
5. If low > high → Element not found.

 */


public class BinarySearch {
    public static int binarySearch(int[]arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= target) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return -1;    // element not found
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 16, 23, 38};
        int target = 16;

        int index = binarySearch(arr, target);

        System.out.println("Index of " + target + " = " + index);
    }
}

/*

3. Binary Search Example (Ascending Array)
Array: [2, 5, 8, 12, 16, 23, 38]
Target: 16

| Step | low | high | mid | arr\[mid] | Action                        |
| ---- | --- | ---- | --- | --------- | ----------------------------- |
| 1    | 0   | 6    | 3   | 12        | 12 < 16 → right half, low = 4 |
| 2    | 4   | 6    | 5   | 23        | 23 > 16 → left half, high = 4 |
| 3    | 4   | 4    | 4   | 16        | Found!                        |
Index of 16 = 4
 */