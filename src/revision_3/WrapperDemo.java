package revision_3;


/*
Wrapper Classes

Java has 8 wrapper classes for primitives: Integer, Double, Character, etc.
Autoboxing → Primitive → Wrapper
Unboxing → Wrapper → Primitive
Example:
 */


public class WrapperDemo {
    public static void main(String[] args) {
        // Autoboxing
        int a = 10;
        Integer obj = a;   // primitive → wrapper
        System.out.println("Autoboxed: " + obj);

        // Unboxing
        Integer b = 20;
        int num = b;       // wrapper → primitive
        System.out.println("Unboxed: " + num);
    }
}
