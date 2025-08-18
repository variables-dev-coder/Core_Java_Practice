package day24_Binary_Search;

public class CountOccurrences2 {

    // First Occurrence
    public static int firstOccurrence(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                result = mid;
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    // Last occurrence
    public static int lastOccurrence(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int result = - 1;

        while (low <= target) {
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

    // count Occurrences
    public static int countOccurrences(int[] arr, int target) {
        int first = firstOccurrence(arr, target);
        if (first == -1) return 0;
        int last = lastOccurrence(arr, target);
        return last - first + 1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 2, 2, 3, 4, 5, 6};
        int target = 2;

        int count = countOccurrences(arr, target);
        System.out.println(target + " occurs " + count + " times.");
    }
}

// Use first occurrence and last occurrence indices.
//Count = lastIndex - firstIndex + 1.