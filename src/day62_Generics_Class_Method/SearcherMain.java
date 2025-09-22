package day62_Generics_Class_Method;

//Generic Binary Search

class Searcher {
    public static <T extends Comparable<T>> int binarySearch(T[] arr, T key) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid].equals(key)) return mid;
            else if (arr[mid].compareTo(key) < 0) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
}

public class SearcherMain {
    public static void main(String[] args) {
        Integer[] nums = {1, 3, 5, 7, 9};
        System.out.println(Searcher.binarySearch(nums, 5)); // 2
    }
}
