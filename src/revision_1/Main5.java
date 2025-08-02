package revision_1;


// Method Overloading and Overriding

class Calculator {
    void add(int a, int b) {
        System.out.println("Sum (int): " + (a + b));
    }

    void add(double a, double b) {
        System.out.println("Sum (double): " + (a + b));
    }
}

class MyCalc extends Calculator {
    @Override
    void add(int a, int b) {
        System.out.println("Overridden sum (int): " + (a + b));
    }
}

public class Main5 {
    public static void main(String[] args) {

        MyCalc calc = new MyCalc();
        calc.add(5, 3);           // overridden
        calc.add(2.5, 3.2);       // overloaded

    }
}
