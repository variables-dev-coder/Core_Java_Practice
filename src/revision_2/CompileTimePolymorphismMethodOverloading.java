package revision_2;

/*
Polymorphism

Polymorphism = “Many Forms”
In Java, it means one action behaves differently in different situations.

There are two types:
1. Compile-Time Polymorphism (Method Overloading)
Achieved by method overloading (same method name, different parameters).

Resolved at compile time.

Example:

 */


class Calculator2 {
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

public class CompileTimePolymorphismMethodOverloading {
    public static void main(String[] args) {
        Calculator2 calc = new Calculator2();

        System.out.println(calc.add(10, 20));       // int version
        System.out.println(calc.add(3.5, 2.5));   // double version
        System.out.println(calc.add(1, 2, 3));    // 3 args
    }
}

/*
30
6.0
6

 */