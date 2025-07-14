package day15_Quick_Sort;

public class KthSmallestElement {
    public static int quickSelect(int[] arr, int low, int high, int k) {
        if (low <= high) {
            int pi = partition(arr, low, high);

            if (pi == k - 1) return arr[pi]; // 0-based index
            else if (pi > k - 1) return quickSelect(arr, low, pi - 1, k);
            else return quickSelect(arr, pi + 1, high, k);
        }
        return -1;
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high], i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;
        int result = quickSelect(arr, 0, arr.length - 1, k);
        System.out.println("Kth smallest = " + result);
    }
}
