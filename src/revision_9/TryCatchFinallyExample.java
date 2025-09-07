package revision_9;

//try-catch-finally

public class TryCatchFinallyExample {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]); // ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds");
        } finally {
            System.out.println("Finally block always executes");
        }
    }
}

//Array index out of bounds
//Finally block always executes