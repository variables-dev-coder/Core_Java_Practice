package revision13;

//Find Missing & Repeating Number
//Input: [4,3,6,2,1,1]
//Output: Missing=5, Repeating=1

public class MissingRepeating {
    public static void main(String[] args) {
        int[] arr = {4,3,6,2,1,1};
        int n = arr.length;
        boolean[] seen = new boolean[n + 1];

        int repeating = -1, missing = -1;
        for (int num : arr) {
            if (seen[num])
                repeating = num;
            seen[num] = true;
        }

        for (int i = 1; i <= n; i++) {
            if (!seen[i])
                missing = i;
        }

        System.out.println("Repeating: " + repeating + ", Missing: " + missing);
    }
}

// Repeating: 1, Missing: 5

// Concept: Boolean marking array, O(n).