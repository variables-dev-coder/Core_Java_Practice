package revisaion_Core_Oop;


/*

2. Methods & Method Overloading
Theory
Method: A block of code that performs a specific task.
Method Overloading: Multiple methods with the same name but different parameters.
Benefits: Improves code readability and flexibility.

 */


class MathUtil {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class MainMethod {
    public static void main(String[] args) {
        MathUtil util = new MathUtil();
        System.out.println(util.add(5, 3));         // int + int
        System.out.println(util.add(2.5, 4.1));     // double + double
        System.out.println(util.add(1, 2, 3));      // three ints
    }
}
// 8
//6.6
//6