package day25_Binary_Heap_Implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class KLargestElements {
    public static List<Integer> findKLargest(int[] nums, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int num : nums) maxHeap.offer(num);

        List<Integer> result = new ArrayList<>();
        while (k-- > 0 && !maxHeap.isEmpty()) {
            result.add(maxHeap.poll());
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 6, 4};
        int k = 3;
        System.out.println(findKLargest(arr, k)); // Output: [6, 5, 4]
    }
}
