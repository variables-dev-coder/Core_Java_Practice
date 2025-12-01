package revision14;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 12, 15};
        int k = 12;

        int l = 0, r = arr.length - 1;

        while (l <= r) {
            int mid = (l + r) / 2;

            if (arr[mid] == k) {
                System.out.println("Found at index " + mid);
                return;
            }
            if (arr[mid] < k) l = mid + 1;
            else r = mid - 1;
        }

        System.out.println("Not Found");
    }
}

// Found at index 3