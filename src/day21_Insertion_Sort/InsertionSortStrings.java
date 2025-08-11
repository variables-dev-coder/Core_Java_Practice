package day21_Insertion_Sort;

public class InsertionSortStrings {
    public static void insertionSort(String[] arr) {
        for (int i = 1; i < arr.length; i++) {
            String key = arr[i];
            int j = i - 1;

            // Compare strings using compareTo()
            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key; // Place key at correct position
        }
    }

    public static void main(String[] args) {
        String[] arr = {"banana", "apple", "cherry", "mango", "grape"};

        System.out.println("Before Sorting: ");
        for (String word : arr) {
            System.out.print(word + " ");
        }

        insertionSort(arr);

        System.out.println("\nAfter Sorting: ");
        for (String word : arr) {
            System.out.print(word + " ");
        }
    }
}

/*
How compareTo() Works
"apple".compareTo("banana") → negative → apple comes before banana.

"cherry".compareTo("apple") → positive → cherry comes after apple.

"grape".compareTo("grape") → 0 → same word.
 */

/*
Iteration 1 (i=1, key="apple")
Compare "banana" with "apple" → "banana".compareTo("apple") > 0 → shift banana.

Insert "apple" → {"apple", "banana", "cherry", "mango", "grape"}

Iteration 2 (i=2, key="cherry")
"banana".compareTo("cherry") < 0 → no shift → same order.

Iteration 3 (i=3, key="mango")
"cherry".compareTo("mango") < 0 → no shift.

Iteration 4 (i=4, key="grape")
Compare "mango" with "grape" → "mango".compareTo("grape") > 0 → shift mango.

Compare "cherry" with "grape" → "cherry".compareTo("grape") < 0 → stop shifting.

Insert "grape" → {"apple", "banana", "cherry", "grape", "mango"}

Sorted Array: {apple, banana, cherry, grape, mango}
 */