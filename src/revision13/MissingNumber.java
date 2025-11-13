package revision13;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        int n = 6;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : arr)
            actualSum += num;

        System.out.println("Missing Number: " + (expectedSum - actualSum)); // 3
    }
}


//Logic:
//Sum of 1..n formula minus actual sum → gives missing number.
//Concept: Math formula, arrays, summation.