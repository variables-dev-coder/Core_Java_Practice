package day15_Binary_Search;

public class FloorCeil {
    public static int findFloor(int[] arr, int target) {
        int ans = -1;
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] <= target) {
                ans = arr[mid];
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public static int findCeill(int[] arr, int target) {
        int ans = -1;
        int low = 0;
        int high = arr.length -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] >= target) {
                ans = arr[mid];
                high = mid - 1;
            } else {
                low = mid +1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        System.out.println("Floor: " + findFloor(arr, 5));
        System.out.println("Ceil: " + findCeill(arr, 5));
    }
}
