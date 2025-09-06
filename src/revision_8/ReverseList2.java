package revision_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseList2 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));

        Collections.reverse(nums);
        System.out.println("Reverse List Is : " + nums);
    }
}

//Reverse List Is : [50, 40, 30, 20, 10]