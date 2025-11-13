package revision13;

//Find Majority Element (> n/2 times)
//Example: [2,2,1,1,1,2,2] → 2

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        int count = 0, candidate = 0;

        for (int num : arr) {
            if (count == 0)
                candidate = num;
            count += (num == candidate) ? 1 : -1;
        }

        System.out.println("Majority element: " + candidate);
    }
}

//Majority element: 2

//Logic:
//Boyer-Moore Voting Algorithm.
//Cancel out non-major elements.
//Concept: Array traversal, optimization O(n).