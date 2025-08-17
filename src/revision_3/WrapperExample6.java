package revision_3;

import java.util.ArrayList;

public class WrapperExample6 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // Autoboxing: int -> Integer
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("ArrayList elements: " + list);

        // Unboxing: Integer -> int
        int sum = 0;
        for (Integer num : list) {
            sum += num; // auto unboxing happens here
        }

        System.out.println("Sum of elements: " + sum);
    }
}

/*
ArrayList elements: [10, 20, 30]
Sum of elements: 60



 */