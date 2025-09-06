package revision_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseList {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));

        Collections.reverse(numbers);
        System.out.println("Reverse List: " + numbers);
    }
}
//Reverse List: [6, 5, 4, 3, 2, 1]