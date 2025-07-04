package day12_Arrays_Strings_DSA;

public class SecondSmallest {
    public static void main(String[] args) {

        int[] arr = {12, 45, 67, 23, 89, 54};

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < first) {
                second = first;
                first = num;
            } else if (num < second && num != first) {
                second = num;
            }
        }
        System.out.println("Second Smallest: " + second);
    }
}


/*

Step 1: Set first = MIN, second = MIN
Step 2: Loop through array
Step 3: If current > first → update both
Step 4: Else if current > second and != first → update second


 */