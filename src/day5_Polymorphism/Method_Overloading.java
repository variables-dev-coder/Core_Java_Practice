package day5_Polymorphism;

// Method Overloading or Compile time Polymorphism

class Calculator {
    int add(int a, int b){
        return a + b;
    }

    double add(double a, double b){
        return a + b;
    }

    int add(int a, int b, int c){
        return a + b + c;
    }
}

public class Method_Overloading {
    public static void main(String[] args) {
        Calculator cc = new Calculator();

        System.out.println("Add(23, 12): " + cc.add(23, 12));
        System.out.println("Add(89, 67, 14): " + cc.add(89, 67, 14));
        System.out.println("Add(7.9, 6.4): " + cc.add(7.9, 6.4));
    }

}
