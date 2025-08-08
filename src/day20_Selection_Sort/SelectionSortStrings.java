package day20_Selection_Sort;

public class SelectionSortStrings {

    public static void selectionSortByLength(String[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                // compare by length first
                if (arr[j].length() < arr[minIndex].length()) {
                    minIndex = j;
                }
                // if length are equal compare alphabetically
                else if (arr[j].length() == arr[minIndex].length() && arr[j].compareTo(arr[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                String temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        String[] arr = {"apple", "bat", "banana", "cat", "apricot"};

        System.out.println("Original Array: ");
        for (String num : arr) {
            System.out.print(num + " ");  // apple bat banana cat apricot
        }

        selectionSortByLength(arr);

        System.out.println("\nSorted Array by length then alphabetically: ");
        for (String num : arr) {
            System.out.print(num + " ");   // bat cat apple banana apricot 
        }
    }
}
