package revision_3;

public class AutoboxingExample1 {

    public static void main(String[] args) {
        int num = 10;

        // Autoboxing: primitive int → Integer object
        Integer boxed = num;

        System.out.println("Primitive int: " + num);
        System.out.println("Autoboxed Integer: " + boxed);
    }
}


//Primitive int: 10
//Autoboxed Integer: 10


/*
Explanation:

int num = 10; → primitive.
Integer boxed = num; → automatically converts (autoboxing) to an Integer object.

 */