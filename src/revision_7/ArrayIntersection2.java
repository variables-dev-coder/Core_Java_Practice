package revision_7;

import java.util.HashSet;
import java.util.Set;

public class ArrayIntersection2 {
    public static void main(String[] args) {
        int[] nums1 = {10, 20, 30, 40, 50};
        int[] nums2 = {60, 10, 70, 30, 50};

        // Use HashSet to store nums1 element
        Set<Integer> set = new HashSet<>();
        for (int num : nums1) {
            set.add(num);
        }

        // Find Intersection with nums2
        Set<Integer> intersection = new HashSet<>();
        for (int num : nums2) {
            if (set.contains(num)) {
                intersection.add(num);
            }
        }
        System.out.println("Intersection : " + intersection);
    }
}

// Intersection : [50, 10, 30]