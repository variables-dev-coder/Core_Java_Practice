package revision_3;

// Using valueOf() method

public class WrapperExample9 {
    public static void main(String[] args) {
        String numStr = "200";
        String boolStr = "false";

        // Converting String to Wrapper objects using valueOf()
        Integer intObj = Integer.valueOf(numStr);
        Boolean boolObj = Boolean.valueOf(boolStr);

        System.out.println("String to Integer object: " + intObj);
        System.out.println("String to Boolean object: " + boolObj);

        // Also works with primitives
        int num = Integer.valueOf("150");
        double d = Double.valueOf("45.99");

        System.out.println("String to int (via valueOf): " + num);
        System.out.println("String to double (via valueOf): " + d);
    }
}

/*
String to Integer object: 200
String to Boolean object: false
String to int (via valueOf): 150
String to double (via valueOf): 45.99


valueOf() can convert a String or a primitive into a Wrapper object.
It is often used in frameworks and libraries where Strings need to be converted dynamically.
 */