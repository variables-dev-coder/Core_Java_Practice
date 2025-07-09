package day15_Binary_Search;

public class CountOccurrences {
    public static int first(int[] arr, int target) {
        int ans = -1;
        int low = 0;
        int high = arr.length - 1;


        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                ans = mid;
                high = mid - 1;

            } else if (arr[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return ans;
    }


    public static int last(int[] arr, int target) {
        int ans = -1;
        int low = 0;
        int high = arr.length - 1;


        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                ans = mid;
                low = mid + 1;
            } else if (arr[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4, 5};
        int first = first(arr, 2);
        int last = last(arr, 2);
        int count = (first == -1) ? 0 : (last - first + 1);
        System.out.println("Count: " + count);
    }
}
