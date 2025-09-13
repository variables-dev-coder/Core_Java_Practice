package revision_10;

public class Example3 {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index error");
        } finally {
            System.out.println("Finally block executed");
        }
    }
}

//Array index error
//Finally block executed