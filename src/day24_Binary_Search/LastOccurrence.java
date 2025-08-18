package day24_Binary_Search;

public class LastOccurrence {
    public static int lastOccurrence(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                result = mid;
                low = mid + 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4, 5};
        int target = 2;

        int index = lastOccurrence(arr, target);
        System.out.println("Last Occurrence of " + target + " = " + index);
    }
}

/*
Explanation
When arr[mid] == target, record index but move right (low = mid + 1) to find the last occurrence.
After loop ends, result gives the last occurrence index.
 */