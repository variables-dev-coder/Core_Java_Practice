package day2_OPP;


class Counter{
    static int count = 0;    // Share across all Object

    Counter(){
        count++;             // Increment count each time object is created
        System.out.println("Object created. Count = " + count);
    }

    static void showCount(){
        System.out.println("Total object created: " + count);
    }
}
public class StaticKeywordDemo {
    public static void main(String[] args) {
        Counter c1 = new Counter(); // count = 1
        Counter c2 = new Counter(); // count = 2
        Counter.showCount();        // Static method call using class name
    }
}

/*
    Key Points:
 static variable is shared across all instances.

 static methods can be called without object.

 Use static for utility functions, constants, and class-level logic.
 
 */