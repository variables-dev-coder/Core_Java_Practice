package revision_3;

public class WrapperExample8 {
    public static void main(String[] args) {
        String intStr = "50";
        String doubleStr = "45.67";
        String booleanStr = "true";

        // Converting String to primitive using parseXXX()
        int intValue = Integer.parseInt(intStr);
        double doubleValue = Double.parseDouble(doubleStr);
        boolean boolValue = Boolean.parseBoolean(booleanStr);

        System.out.println("String to int: " + intValue);
        System.out.println("String to double: " + doubleValue);
        System.out.println("String to boolean: " + boolValue);
    }
}

/*
String to int: 50
String to double: 45.67
String to boolean: true

Here we used methods like parseInt(), parseDouble(), and parseBoolean()
to directly convert Strings into primitive values.
 */