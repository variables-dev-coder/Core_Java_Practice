package day22_Linear_Search;


/*
Question:
You are given an array of Object elements that may contain both integers and strings.
Search for a target element (either number or string) and return its index.
If the target is a string → search case-insensitively.
If the target is a number → search normally.

Logic
Loop through the array.
If the current element is a string and the target is also a string → use equalsIgnoreCase().
If both are numbers → use normal equals().
Return the index if found; otherwise return -1.
 */


public class LinearSearchBonus {

    public static int searchMixed(Object[] arr, Object target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] instanceof String && target instanceof String) {
                if (((String) arr[i]).equalsIgnoreCase((String) target)) {
                    return i;
                }
            } else if (arr[i].equals(target)) {
                return i;
            }
        }
        return -1;   // Not found
    }


    public static void main(String[] args) {
        Object[] mixedArray = {10, "Apple", 25, "banana", 42, "Cherry"};

        // Test 1: Search number
        int indexNum = searchMixed(mixedArray, 42);
        System.out.println("Searching 42 -> Index: " + indexNum);

        // Test 2: Search string (case-insensitive)
        int indexStr = searchMixed(mixedArray, "BANANA");
        System.out.println("Searching BANANA → Index: " + indexStr);

        // Test 3: Not found
        int indexNotFound = searchMixed(mixedArray, "Grapes");
        System.out.println("Searching Grapes → Index: " + indexNotFound);

    }
}

/*
Searching 42 -> Index: 4
Searching BANANA → Index: 3
Searching Grapes → Index: -1



Dry Run
Array = {10, "Apple", 25, "banana", 42, "Cherry"}
Test 1: Target = 42
Found at index 4 → Return 4.
Test 2: Target = "BANANA"
Compare "banana" with "BANANA" → matches case-insensitively → Return 3.
Test 3: Target = "Grapes"
No match → Return -1.

 */