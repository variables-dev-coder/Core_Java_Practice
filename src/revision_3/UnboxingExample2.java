package revision_3;

public class UnboxingExample2 {
    public static void main(String[] args) {
        Integer boxed = 20; // Autoboxing happens here

        // Unboxing: Integer object → primitive int
        int num = boxed;

        System.out.println("Integer object: " + boxed);
        System.out.println("Unboxed int: " + num);
    }
}


//Integer object: 20
//Unboxed int: 20


// Explanation:
//Integer boxed = 20; → autoboxing.
//int num = boxed; → Java automatically converts the Integer object to primitive int (unboxing).