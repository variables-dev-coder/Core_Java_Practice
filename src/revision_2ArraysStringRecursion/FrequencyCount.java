package revision_2ArraysStringRecursion;

// Frequency Count
// Use nested loops to count occurrences.

public class FrequencyCount {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 5, 4, 3, 2, 1, 6, 7, 8, 9, 10};
        boolean[] visited = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (visited[i]) continue;

            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " appears " + count + " times");
        }
    }
}
