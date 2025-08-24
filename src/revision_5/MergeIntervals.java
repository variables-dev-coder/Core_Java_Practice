package revision_5;

// Merge Intervals

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        List<int[]> res = new ArrayList<>();

        int[] curr = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            if (curr[1] >= intervals[i][0]) { // overlap
                curr[1] = Math.max(curr[1], intervals[i][1]);
            } else {
                res.add(curr);
                curr = intervals[i];
            }
        }
        res.add(curr);

        return res.toArray(new int[res.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int[][] result = merge(intervals);
        for (int[] in : result) System.out.println(Arrays.toString(in));
        // [1, 6]
        // [8, 10]
        // [15, 18]
    }
}

/*
Covered:

Two-Pointer (Pair sum, Move zeros, Container With Most Water)
Sliding Window (Max window)
Sorting-based (Sort Colors, Merge Intervals)

 */