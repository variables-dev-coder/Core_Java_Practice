package day12_Arrays_Strings_DSA;

public class FrequencyCount_2 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 10, 40, 20, 50, 10, 50, 30};
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
            System.out.println(arr[i] + " -> " + count + " time(s)");
        }
    }
}
