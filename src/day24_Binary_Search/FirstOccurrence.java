package day24_Binary_Search;

public class FirstOccurrence {
    public static int firstOccurrence(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int result = -1;   // store first occurrence

        while (low <= high) {
           int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                result = mid;    // Possible first occurrence
                high = mid - 1;   // move left to find earlier occurrence
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid -1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4, 5};
        int target = 2;

        int index = firstOccurrence(arr, target);
        System.out.println("First occurrence of " + target + " = " + index);
    }
}
