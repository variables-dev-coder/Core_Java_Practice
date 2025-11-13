package revision13;

public class Fibonacci {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;
        int n3 = 10;
        int count = 10;

        System.out.println("Fibonacci number of 0 1");
        for (int i = 2; i < count; ++i) {
            n3 = n1 + n2;

            System.out.print(" " + n3);

            n1 = n2;
            n2 = n3;
        }
    }
}

//Fibonacci number of 0 1
// 1 2 3 5 8 13 21 34

//Logic:
//Each term = sum of previous two.
//Concept: Loops, variable swapping.