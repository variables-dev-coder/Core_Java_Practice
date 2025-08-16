package revision_2;

/*
Method Overloading

Method overloading → Same method name, but different parameter list (number or type).
It happens within the same class.

Example:

 */

class MathUtil {
    // Overloaded methods
    int multiply(int a, int b) {
        return a * b;
    }

    double multiply(double a, double b) {
        return a * b;
    }

    int multiply(int a, int b, int c) {
        return a * b * c;
    }
}

public class OverloadingMain {
    public static void main(String[] args) {
        MathUtil m = new MathUtil();

        System.out.println(m.multiply(5, 10));       // int version
        System.out.println(m.multiply(3.5, 2.0));   // double version
        System.out.println(m.multiply(2, 3, 4));    // 3-argument version
    }
}
/*
50
7.0
24


Key Takeaways

Methods make code reusable.
Parameters provide inputs, return type provides output.
Overloading = compile-time polymorphism.
 */