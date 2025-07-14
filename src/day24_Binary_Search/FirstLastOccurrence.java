package day24_Binary_Search;

public class FirstLastOccurrence {
     public static int firstOccurrence(int[] arr, int target) {
         int ans = -1;
         int low = 0;
         int high = arr.length - 1;

         while (low <= high) {
             int mid = (low + high) / 2;
             if (arr[mid] == target) {
                 ans = mid;
                 high = mid - 1; // keep searching left
             } else if (arr[mid] < target)
                 low = mid + 1;
             else
                 high = mid - 1;
         }
         return ans;
     }

     public static int lastOccurrence(int[] arr, int target) {
         int ans = -1;
         int low = 0;
         int high = arr.length - 1;

         while (low <= high) {
             int mid = (low + high) / 2;
             if (arr[mid] == target) {
                 ans = mid;
                 low = mid + 1;   // keep searching right
             } else if (arr[mid] < target)
                 low = mid + 1;
             else
                 high = mid - 1;
         }
         return ans;
     }

    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8, 10};
        int first = firstOccurrence(arr, 8);
        int last = lastOccurrence(arr, 8);

        System.out.println("First: " + first + ", Last: " + last);
    }
}
