package revision_3;

public class WrapperExample7 {
    public static void main(String[] args) {
        Integer num = 100;   // Autoboxing

        // Converting Integer to different primitive types
        int intValue = num.intValue();        // Integer → int
        double doubleValue = num.doubleValue(); // Integer → double
        float floatValue = num.floatValue();   // Integer → float
        long longValue = num.longValue();      // Integer → long

        System.out.println("Integer value: " + num);
        System.out.println("int value: " + intValue);
        System.out.println("double value: " + doubleValue);
        System.out.println("float value: " + floatValue);
        System.out.println("long value: " + longValue);
    }
}

/*
Integer value: 100
int value: 100
double value: 100.0
float value: 100.0
long value: 100

This shows how wrapper objects can convert to different primitive
types using methods like intValue(), doubleValue(), etc.

 */