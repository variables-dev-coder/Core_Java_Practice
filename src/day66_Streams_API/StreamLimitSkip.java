package day66_Streams_API;

// 6. limit(), skip()

import java.util.List;

public class StreamLimitSkip {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1,2,3,4,5,6,7,8);

        List<Integer> res = nums.stream()
                .skip(2)  // remove first 2 → [3,4,5,6,7,8]
                .limit(3) // take next 3 → [3,4,5]
                .toList();

        System.out.println(res);
    }
}
