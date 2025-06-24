package day8_StaticKeywordStaticBlockStaticMethod;


class MyClass {
    static void greed() {
        System.out.println("Hello from static method");
    }
}

class MathUtility {
    static int add(int a, int b) {
        return a + b;
    }

    static int square(int x) {
        return x * x;
    }

    static void showInfo() {
        System.out.println("Welcome to Math Utility");
    }
}
public class StaticMethodDemo {
    public static void main(String[] args) {

        MathUtility.showInfo();
        System.out.println("Sum = " + MathUtility.add(10, 20));
        System.out.println("Square = " + MathUtility.square(10));
    }
}
